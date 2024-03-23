package dp.factorymethod;

public class Division implements BinaryOperator{
    @Override
    public double apply(double number1, double number2) {
        if(number2 != 0) {
            return number1/number2;
        } else {
            throw new UnsupportedOperationException("Cannot divide with 0");
        }
    }
}
