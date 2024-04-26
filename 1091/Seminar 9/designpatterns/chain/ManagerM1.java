public class ManagerM1 extends AprobatorBuget {
    public static final int BUGET_MAXIM = 1000;
    @Override
    public void aprobaBuget(float suma) {
        if(suma < BUDGET_MAXIM) {
            System.out.println("Budget aprobat de M1");
        } else {
            if(urmatorulAprobator != null) {
                urmatorulAprobator.aprobaBuget(suma);
            } else {
                System.out.println("Budget refuzat");
            }
        }
    }
}
