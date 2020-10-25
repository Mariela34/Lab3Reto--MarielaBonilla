package bonilla.mariela.calculator;

public class CalculatorInteger implements ICalculator {
    @Override
    public Integer calculate(int num1, int num2) {
        return num1 + num2;
    }
}
