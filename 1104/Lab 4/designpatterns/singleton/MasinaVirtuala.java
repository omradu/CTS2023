package designpatterns.singleton;

public class MasinaVirtuala {
    private String adresaIp;
    private int portConexiune;
    private String numeMasinaVirtuala;
    private String username;

    public MasinaVirtuala(String adresaIp, int portConexiune, String numeMasinaVirtuala, String username) {
        this.adresaIp = adresaIp;
        this.portConexiune = portConexiune;
        this.numeMasinaVirtuala = numeMasinaVirtuala;
        this.username = username;
    }

    public String getAdresaIp() {
        return adresaIp;
    }

    public void setAdresaIp(String adresaIp) {
        this.adresaIp = adresaIp;
    }

    public int getPortConexiune() {
        return portConexiune;
    }

    public void setPortConexiune(int portConexiune) {
        this.portConexiune = portConexiune;
    }

    public String getNumeMasinaVirtuala() {
        return numeMasinaVirtuala;
    }

    public void setNumeMasinaVirtuala(String numeMasinaVirtuala) {
        this.numeMasinaVirtuala = numeMasinaVirtuala;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Userul " + username + " se conecteaza la masina virtuala " + numeMasinaVirtuala + " care are ip-ul " + adresaIp + " prin portul " + portConexiune;
    }
}
