public enum Membership {
    NEW(0), SILVER(0.1F), GOLD(0.25F), DIAMOND(0.35F);

    private float discount;

    Membership(float discount) {
        this.discount = discount;
    }

    public float getDiscount() {
        return discount;
    }
}
