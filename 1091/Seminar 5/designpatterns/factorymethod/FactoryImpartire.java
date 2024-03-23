package designpatterns.factorymethod;

public class FactoryImpartire extends FactoryOperatorBinar{
    @Override
    public OperatorBinar getOperatorBinar() throws UnsupportedOperationException {
        return new Impartire();
    }
}
