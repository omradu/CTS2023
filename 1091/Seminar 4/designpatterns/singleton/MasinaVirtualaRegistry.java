package designpatterns.singleton;

import java.util.HashMap;

public class MasinaVirtualaRegistry {
    private String adresaIp;
    private int portConexiune;
    private String numeMasinaVirtuala;
    private String username;

    private static HashMap<String, MasinaVirtualaRegistry> masinaVirtualaRegistry = new HashMap<String, MasinaVirtualaRegistry>();

    public static synchronized MasinaVirtualaRegistry getInstance(String adresaIp, int portConexiune, String numeMasinaVirtuala, String username) {
        MasinaVirtualaRegistry conexiuneMasinaVirtula = masinaVirtualaRegistry.get(adresaIp);

        if(conexiuneMasinaVirtula == null) {
            conexiuneMasinaVirtula = new MasinaVirtualaRegistry(adresaIp, portConexiune, numeMasinaVirtuala, username);
            masinaVirtualaRegistry.put(adresaIp, conexiuneMasinaVirtula);
        }

        return conexiuneMasinaVirtula;
    }

    private MasinaVirtualaRegistry(String adresaIp, int portConexiune, String numeMasinaVirtuala, String username) {
        this.adresaIp = adresaIp;
        this.portConexiune = portConexiune;
        this.numeMasinaVirtuala = numeMasinaVirtuala;
        this.username = username;
    }

    @Override
    public String toString() {
        return "Userul " + username + " se conecteaza la masina virtuala " + numeMasinaVirtuala + " care are ip-ul " + adresaIp + " prin portul " + portConexiune;
    }
}
