public class Main {
    public static void main(String[] args) {
        Inamic inamic1 = new Inamic("Jason");
        Inamic inamic2 = new Inamic("Vasile");
        Wave wave1 = new Wave("Wave incepatori");
        Inamic inamic3 = new Inamic("Robert");
        Inamic inamic4 = new Inamic("Mihai");
        Wave wave2 = new Wave("Wave intermediari");
        Wave boss = new Wave("Vincenzo");

        wave1.adaugaInamic(inamic2);
        wave1.adaugaInamic(inamic1);
        wave2.adaugaInamic(inamic3);
        wave2.adaugaInamic(inamic4);
        wave2.adaugaInamic(wave1);
        boss.adaugaInamic(wave2);

        boss.ataca(10);
    }
}
