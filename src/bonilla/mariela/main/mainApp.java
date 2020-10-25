package bonilla.mariela.main;

import bonilla.mariela.testbean.MySpringCalculatorBeanWithDependency;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.*;

public class mainApp {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = new PrintStream(System.out);
    static ApplicationContext context;

    static BeanFactory factory;

    public static void main(String[] args) throws IOException {
        runApp();
    }

    public static void runApp() throws IOException {
        context = new ClassPathXmlApplicationContext("bonilla/mariela/META-INF/beans.xml");
        factory = context;
        menu();
    }

    public static void menu() throws IOException {
        int num1, num2, opcion;
        String tipo = "";
        out.println("Ingrese num 1");
        num1 = Integer.parseInt(in.readLine());
        out.println("Ingrese num 2");
        num2 = Integer.parseInt(in.readLine());
        out.println("Encoja el tipo de suma:");
        out.println("1.Enteros");
        out.println("2.Strings");
        opcion = Integer.parseInt(in.readLine());
        switch (opcion){
            case 1:
                tipo = "int";

                break;
            case 2:
                tipo = "string";
                break;

        }
        continuar(tipo, num1, num2);
    }

    private static void continuar(String tipo, int num1, int num2) {
        out.println("Resultado:\n");

        if (tipo.equals("int")) {
            MySpringCalculatorBeanWithDependency entero = (MySpringCalculatorBeanWithDependency) factory
                    .getBean("MySpringIntBeanWithDependency");
            out.println(entero.run(num1, num2));
        } else if (tipo.equals("string")) {
            MySpringCalculatorBeanWithDependency texto = (MySpringCalculatorBeanWithDependency) factory
                    .getBean("MySpringStrBeanWithDependency");
            out.println(texto.run(num1, num2));
        }
    }
}
