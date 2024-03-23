package designpatterns.factorymethod;

public class FactoryScadere extends FactoryOperatorBinar{
    @Override
    public OperatorBinar getOperatorBinar() throws UnsupportedOperationException {
        return new Scadere();
    }
}
