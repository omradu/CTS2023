package dp.factorymethod;

public class Substraction implements BinaryOperator{
    @Override
    public double apply(double number1, double number2) {
        return number1 - number2;
    }
}
