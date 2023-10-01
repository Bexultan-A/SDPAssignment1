import interfaces.IDiscountStrategy;

public class NoDiscount implements IDiscountStrategy {
    @Override
    public void discount(double totalPrice) {
        System.out.println("Unfortunately, you have no discount");
    }
}
