public class Main {
    public static void main(String[] args) {
        ManagerM1 M1 = new ManagerM1();
        ManagerM2 M2 = new ManagerM2();
        VicePresident VP = new VicePresident();

        M1.setUrmatorulAprobator(M2);
        M2.setUrmatorulAprobator(VP);

        M1.aprobaBuget(150);
        System.out.println("------------------------");
        M1.aprobaBuget(2000);
        System.out.println("------------------------");
        M1.aprobaBuget(10000);
    }
}
