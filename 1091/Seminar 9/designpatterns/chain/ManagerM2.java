public class ManagerM2 extends AprobatorBuget {
    public static final int BUGET_MAXIM = 3000;
    @Override
    public void aprobaBuget(float suma) {
        if(suma < BUDGET_MAXIM) {
            System.out.println("Budget aprobat de M2");
        } else {
            if(urmatorulAprobator != null) {
                urmatorulAprobator.aprobaBuget(suma);
            } else {
                System.out.println("Budget refuzat");
            }
        }
    }
}
