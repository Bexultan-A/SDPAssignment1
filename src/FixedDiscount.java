import interfaces.IDiscountStrategy;

public class FixedDiscount  implements IDiscountStrategy {
    int discountAmount;

    public FixedDiscount(int discountAmount) {
        this.discountAmount = discountAmount;
    }

    @Override
    public void discount(double totalPrice) {
        totalPrice -= discountAmount;
        System.out.println("Total price is " + totalPrice + " discount: " + discountAmount);
    }
}
