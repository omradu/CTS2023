public class Produs {

    public float calculateDiscountedPrice(int discountType, float initialPrice) {
        // (float) (initialPrice - (discountAmount * initialPrice));

        float discountAmount;
        switch (discountType) {
            case 2:
                discountAmount = 0.1F;
                break;
            //calcculateDiscountedPrice(0.1, initalPrice) - appliedPercentage * calculateDiscountedPrice(0.1, initialPrice);
            case 3:
                discountAmount = 0.25F;
                break;

            case 4:
                discountAmount = 0.35F;
                break;

            default:
                discountAmount = 0;
                break;
        }

        return initialPrice - (discountAmount * initialPrice);
    }

    public float ApplyDiscount(int discountType, float initialPrice, int percentage) {
        float appliedPercentage = (percentage > 10) ? (float)15/100 : (float)percentage/100;

        return calculateDiscountedPrice(discountType, initialPrice) - appliedPercentage * calculateDiscountedPrice(discountType, initialPrice);
    }
}
