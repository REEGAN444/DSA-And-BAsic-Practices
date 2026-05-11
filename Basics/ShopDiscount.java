public class ShopDiscount {
    public static void main(String[] args) {
        int pricePerItem = 50;

        System.out.println("Items\tTotal Cost (₹)");
        for (int i = 1; i <= 10; i++) {
            int totalCost = i * pricePerItem;
            System.out.println(i + "\t₹" + totalCost);
        }
    }
}
