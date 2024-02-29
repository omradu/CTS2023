public class Produs {

    public static final int NR_MIN_ACHIZITII = 10;
    public static final float MAX_PROCENT_REDUCERE = 0.15F;

    public float calculateDiscountedPrice(int membershipType, float initialPrice) {


        float discountAmount = Membership.getMembershipById(membershipType).getDiscountAmount();

        return initialPrice - (discountAmount * initialPrice);
    }

    public float ApplyDiscount(int discountType, float initialPrice, int nrAchizitii) {
        float appliedPercentage = (nrAchizitii > NR_MIN_ACHIZITII) ? (float)MAX_PROCENT_REDUCERE : (float)nrAchizitii/100;

        float discountedPrice = calculateDiscountedPrice(discountType, initialPrice);

        return discountedPrice - appliedPercentage * discountedPrice;
    }
}
