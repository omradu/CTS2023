package designpatterns.singleton;

public enum MasinaVirtualaEnum {
    INSTANCE;

    public void soSomething() {
        System.out.println("Este un singleton");
    }
}
