public class Discount {
    private static final float MIN_MEMBERSHIP_TIME = 10;
    private static final float MAX_DISCOUNT = 0.15F;

    public static float calculateCustomerDiscount(Membership discountType) {
        if(discountType!=null)
            return discountType.getDiscount();
        else
            return 1F;
    }

    public float applyDiscount(Membership discountType, float initialPrice, float period) {
        return calculateDiscountedPrice(initialPrice, discountType, period);
    }

    private static float calculateDiscountedPrice(float initialPrice, Membership discountType, float period) {
        float periodDiscount = (period>MIN_MEMBERSHIP_TIME) ? MAX_DISCOUNT : period/100;
        float customerDiscount = calculateCustomerDiscount(discountType);
        float discountedValue = initialPrice - (customerDiscount * initialPrice);

        return discountedValue - periodDiscount* discountedValue;
    }
}
