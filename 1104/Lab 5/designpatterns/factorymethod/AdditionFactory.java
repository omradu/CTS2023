package dp.factorymethod;

public class AdditionFactory extends BinaryOperatorFactory{
    @Override
    public BinaryOperator getBinaryOperator() throws UnsupportedOperationException {
        return new Addition();
    }
}
