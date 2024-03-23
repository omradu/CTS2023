package designpatterns.singleton;

public class MasinaVirtualaEager {
    private String adresaIp;
    private int portConexiune;
    private String numeMasinaVirtuala;
    private String username;

    private static final MasinaVirtualaEager instance = new MasinaVirtualaEager();

    private MasinaVirtualaEager() {
        this.adresaIp = "10.0.0.1";
        this.portConexiune = 3389;
        this.numeMasinaVirtuala = "eagerVM";
        this.username = "admin";
    }

    @Override
    public String toString() {
        return "Userul " + username + " se conecteaza la masina virtuala " + numeMasinaVirtuala + " care are ip-ul " + adresaIp + " prin portul " + portConexiune;
    }

    public static MasinaVirtualaEager getInstance() {
        return instance;
    }
}
