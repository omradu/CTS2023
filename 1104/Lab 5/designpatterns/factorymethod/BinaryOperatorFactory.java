package dp.factorymethod;

public abstract class BinaryOperatorFactory {

    public abstract BinaryOperator getBinaryOperator() throws UnsupportedOperationException;
}
