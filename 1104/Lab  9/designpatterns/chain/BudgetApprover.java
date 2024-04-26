public abstract class BudgetApprover {
    protected BudgetApprover nextApprover;

    public void setNextApprover(BudgetApprover nextApprover) {
        this.nextApprover = nextApprover;
    }

    public abstract void approveBudget(float amount);
}
