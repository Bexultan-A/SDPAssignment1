import interfaces.IDiscountStrategy;

public class CouponDiscount  implements IDiscountStrategy {
    int couponNumber;

    public CouponDiscount(int couponNumber) {
        this.couponNumber = couponNumber;
    }

    @Override
    public void discount(double totalPrice) {
        totalPrice = totalPrice - couponNumber*1500;
        System.out.println("Total price is " + totalPrice + " discount: " + couponNumber*1500);
    }
}
