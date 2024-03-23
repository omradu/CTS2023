package dp.factorymethod;

public class MultiplicationFactory extends BinaryOperatorFactory{
    @Override
    public BinaryOperator getBinaryOperator() throws UnsupportedOperationException {
        return new Multiplication();
    }
}
