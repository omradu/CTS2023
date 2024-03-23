package designpatterns.singleton;

public class MasinaVirtualaThreadSafeBetter {
    private String adresaIp;
    private int portConexiune;
    private String numeMasinaVirtuala;
    private String username;

    private static MasinaVirtualaThreadSafeBetter instance = null;

    private MasinaVirtualaThreadSafeBetter() {
        this.adresaIp = "10.0.0.1";
        this.portConexiune = 3389;
        this.numeMasinaVirtuala = "lazyTSVMBetter";
        this.username = "admin";
    }

    @Override
    public String toString() {
        return "Userul " + username + " se conecteaza la masina virtuala " + numeMasinaVirtuala + " care are ip-ul " + adresaIp + " prin portul " + portConexiune;
    }

    public static MasinaVirtualaThreadSafeBetter getInstance() {
        if(instance == null) {

            synchronized (MasinaVirtualaThreadSafeBetter.class) {
                if(instance == null) {
                    instance = new MasinaVirtualaThreadSafeBetter();
                }
            }

        }

        return instance;
    }
}
