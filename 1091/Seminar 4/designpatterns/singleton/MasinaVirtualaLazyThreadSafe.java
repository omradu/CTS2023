package designpatterns.singleton;

public class MasinaVirtualaLazyThreadSafe {
    private String adresaIp;
    private int portConexiune;
    private String numeMasinaVirtuala;
    private String username;

    private static MasinaVirtualaLazyThreadSafe instance = null;

    private MasinaVirtualaLazyThreadSafe() {
        this.adresaIp = "10.0.0.1";
        this.portConexiune = 3389;
        this.numeMasinaVirtuala = "lazyTSVM";
        this.username = "admin";
    }

    @Override
    public String toString() {
        return "Userul " + username + " se conecteaza la masina virtuala " + numeMasinaVirtuala + " care are ip-ul " + adresaIp + " prin portul " + portConexiune;
    }

    public static synchronized MasinaVirtualaLazyThreadSafe getInstance() {
        if(instance == null) {
            instance = new MasinaVirtualaLazyThreadSafe();
        }

        return instance;
    }
}
