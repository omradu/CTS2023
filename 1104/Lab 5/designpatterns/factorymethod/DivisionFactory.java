package dp.factorymethod;

public class DivisionFactory extends BinaryOperatorFactory{
    @Override
    public BinaryOperator getBinaryOperator() throws UnsupportedOperationException {
        return new Division();
    }
}
