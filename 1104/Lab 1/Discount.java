public class Discount {

    public static float calculateCustomerDiscount(int discountType) {
        if(discountType==1)
            return 0;

        if(discountType==2)
            return 0.1F;

        if(discountType==3)
            return 0.25F;

        if(discountType==4)
            return 0.35F;

        return 1F;
    }

    public float applyDiscount(int discountType, float initialPrice, int period) {
        return calculateDiscountedPrice(initialPrice, discountType, period);
    }

    private static float calculateDiscountedPrice(float initialPrice, int discountType, int period) {
        float periodDiscount = (period>10) ? (float)(15/100) : (float)period/100;
        float customerDiscount = calculateCustomerDiscount(discountType);
        float discountedValue = initialPrice - (customerDiscount * initialPrice);

        return discountedValue - periodDiscount* discountedValue;
    }
}
