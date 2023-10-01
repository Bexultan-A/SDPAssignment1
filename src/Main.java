public class Main {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart(10000);

        shoppingCart.setDiscountStrategy(new CouponDiscount(3));

        shoppingCart.calculateTotalPrice();
    }
}