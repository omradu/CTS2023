public class ManagerM1 extends BudgetApprover {
    public static final int MAXIMUM_BUDGET = 1000;
    @Override
    public void approveBudget(float amount) {
        if(amount < MAXIMUM_BUDGET) {
            System.out.println("Budget approved by M1");
        } else {
            if(nextApprover != null) {
                nextApprover.approveBudget(amount);
            } else {
                System.out.println("Budget rejected");
            }
        }
    }
}
