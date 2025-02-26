package shop.process.meal;

import shop.items.burgers.Burger;
import shop.items.drinks.Drink;
import shop.items.sideitems.SideItem;

public class Meal {
    private Burger burger;
    private Drink drink;
    private SideItem sideItem;

    public Meal(Burger burger, Drink drink, SideItem sideItem) {
        this.burger = burger;
        this.drink = drink;
        this.sideItem = sideItem;
    }

    public Meal() {
        this(new Burger(), new Drink(), new SideItem());
    }

    public Burger getBurger() {
        return burger;
    }

    public Drink getDrink() {
        return drink;
    }

    public SideItem getSideItem() {
        return sideItem;
    }

    public double getTotalOrderPrice () {
        return burger.getPrice() + drink.getPrice() + sideItem.getPrice();
    }

    public String getOrderDetails() {
        return String.format(
                """
                Your order is as follows:
                1. Burger: %s
                2. Drink: %s
                3. Side Item: %s
                
                with Prices:
                1. %s: Rs %.2f
                2. %s: Rs %.2f 
                3. %s: Rs %.2f
                """,
                burger.getType(),
                drink.getType(),
                sideItem.getType(),
                burger.getType(),
                burger.getPrice(),
                drink.getType(),
                drink.getPrice(),
                sideItem.getType(),
                sideItem.getPrice()
        );
    }
}
