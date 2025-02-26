package shop.items;

public class MealItem {
    private String type;
    private double price;

    public MealItem(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public String getType() {
        return this.type;
    }
}
