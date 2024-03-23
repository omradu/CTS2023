package designpatterns.singleton;

public class Main {

    public static void main(String[] args) {

        MasinaVirtuala masinaVirtuala = new MasinaVirtuala("10.0.0.3", 22, "LinuxWebServer", "adminPagina");
        System.out.println(masinaVirtuala.toString());

        MasinaVirtualaEager masinaVirtualaEager = MasinaVirtualaEager.getInstance();
        System.out.println(masinaVirtualaEager.toString());

        MasinaVirtualaLazy masinaVirtualaLazy = MasinaVirtualaLazy.getInstance();
        System.out.println(masinaVirtualaLazy.toString());

        MasinaVirtualaLazyThreadSafe masinaVirtualaLazyThreadSafe = MasinaVirtualaLazyThreadSafe.getInstance();
        System.out.println(masinaVirtualaLazyThreadSafe.toString());

        MasinaVirtualaStaticBlock masinaVirtualaStaticBlock = MasinaVirtualaStaticBlock.getInstance();
        System.out.println(masinaVirtualaStaticBlock.toString());
    }
}
