package bonilla.mariela.calculator;

public class StringCalculator implements ICalculator {
    @Override
    public Integer calculate(int num1, int num2) {
        return Integer.parseInt(Integer.toString(num1) + Integer.toString(num2));
    }
}
