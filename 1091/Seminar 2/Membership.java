public enum Membership {
    BRONZE(0.1F, 2), SILVER(0.25F,3), GOLD((0.35F,4);

    private float discountAmount;
    private int id;

    private Membership(float discountAmount, int id) {
        this.discountAmount = discountAmount;
        this.id = id;
    }

    public float getDiscountAmount() {
        return discountAmount;
    }

    public int getId() {
        return id;
    }

    public static Membership getMembershipById(int i) {
        for(Membership membership : values()) {
            if(membership.getId() == i) {
                return membership;
            }
        }
        return null;
    }
}
