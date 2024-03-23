package designpatterns.singleton;

public class MasinaVirtualaLazy {
    private String adresaIp;
    private int portConexiune;
    private String numeMasinaVirtuala;
    private String username;

    private static MasinaVirtualaLazy instance = null;

    private MasinaVirtualaLazy() {
        this.adresaIp = "10.0.0.1";
        this.portConexiune = 3389;
        this.numeMasinaVirtuala = "lazyVM";
        this.username = "admin";
    }

    @Override
    public String toString() {
        return "Userul " + username + " se conecteaza la masina virtuala " + numeMasinaVirtuala + " care are ip-ul " + adresaIp + " prin portul " + portConexiune;
    }

    public static MasinaVirtualaLazy getInstance() {
        if(instance == null) {
            instance = new MasinaVirtualaLazy();
        }

        return instance;
    }
}
