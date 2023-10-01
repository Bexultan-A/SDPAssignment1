import interfaces.IDiscountStrategy;

public class ShoppingCart {
    int totalPrice;
    private IDiscountStrategy discountStrategy;

    public ShoppingCart(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setDiscountStrategy(IDiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public void calculateTotalPrice() {
        discountStrategy.discount(totalPrice);
    }
}
