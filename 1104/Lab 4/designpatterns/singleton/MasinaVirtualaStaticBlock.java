package designpatterns.singleton;

public class MasinaVirtualaStaticBlock {
    private String adresaIp;
    private int portConexiune;
    private String numeMasinaVirtuala;
    private String username;

    private static final MasinaVirtualaStaticBlock instance;

    static {
        try {
            instance = new MasinaVirtualaStaticBlock();
        } catch (Exception e) {
            throw new RuntimeException("Eroare la crearea instantei");
        }
    }

    private MasinaVirtualaStaticBlock() {
        this.adresaIp = "10.0.0.1";
        this.portConexiune = 3389;
        this.numeMasinaVirtuala = "staticBlockVM";
        this.username = "admin";
    }

    @Override
    public String toString() {
        return "Userul " + username + " se conecteaza la masina virtuala " + numeMasinaVirtuala + " care are ip-ul " + adresaIp + " prin portul " + portConexiune;
    }

    public static MasinaVirtualaStaticBlock getInstance() {
        return instance;
    }
}
