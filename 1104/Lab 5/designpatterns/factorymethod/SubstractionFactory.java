package dp.factorymethod;

public class SubstractionFactory extends BinaryOperatorFactory{
    @Override
    public BinaryOperator getBinaryOperator() throws UnsupportedOperationException {
        return new Substraction();
    }
}
