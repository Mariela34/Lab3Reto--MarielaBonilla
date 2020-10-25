package bonilla.mariela.testbean;

import bonilla.mariela.calculator.ICalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;


public class MySpringCalculatorBeanWithDependency {
    private ICalculator calculator;

    @Autowired

    public void setCalculator( ICalculator pCalculator){
        this.calculator = pCalculator;
    }

    public int run(int num1, int num2){
        return calculator.calculate(num1, num2);
    }
}
