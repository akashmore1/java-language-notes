package shop.items.drinks;

import shop.items.MealItem;
import shop.utils.drink.DrinkPrice;
import shop.utils.drink.DrinkSize;
import shop.utils.drink.DrinkType;

public class Drink extends MealItem {
    private String size;

    private static double getDrinkPrice(String type, String size) {
        if(type.equals(DrinkType.COKE) && size.equals(DrinkSize.SMALL)) {
            return DrinkPrice.SMALL_COKE;
        }
        if(type.equals(DrinkType.COKE) && size.equals(DrinkSize.MEDIUM)) {
            return DrinkPrice.MEDIUM_COKE;
        }
        if(type.equals(DrinkType.COKE) && size.equals(DrinkSize.LARGE)) {
            return DrinkPrice.LARGE_COKE;
        }
        if(type.equals(DrinkType.PEPSI) && size.equals(DrinkSize.SMALL)) {
            return DrinkPrice.SMALL_PEPSI;
        }
        if(type.equals(DrinkType.PEPSI) && size.equals(DrinkSize.MEDIUM)) {
            return DrinkPrice.MEDIUM_PEPSI;
        }
        if(type.equals(DrinkType.PEPSI) && size.equals(DrinkSize.LARGE)) {
            return DrinkPrice.LARGE_PEPSI;
        }
        if(type.equals(DrinkType.FANTA) && size.equals(DrinkSize.SMALL)) {
            return DrinkPrice.SMALL_FANTA;
        }
        if(type.equals(DrinkType.FANTA) && size.equals(DrinkSize.MEDIUM)) {
            return DrinkPrice.MEDIUM_FANTA;
        }
        if(type.equals(DrinkType.FANTA) && size.equals(DrinkSize.LARGE)) {
            return DrinkPrice.LARGE_FANTA;
        };
        if(type.equals(DrinkType.SPRITE) && size.equals(DrinkSize.SMALL)) {
            return DrinkPrice.SMALL_SPRITE;
        }
        if(type.equals(DrinkType.SPRITE) && size.equals(DrinkSize.MEDIUM)) {
            return DrinkPrice.MEDIUM_SPRITE;
        }
        if(type.equals(DrinkType.SPRITE) && size.equals(DrinkSize.LARGE)) {
            return DrinkPrice.LARGE_SPRITE;
        }
        return 0;
    }

    public Drink(String type, String size) {
        super(type, getDrinkPrice(type, size));
        this.size = size;
    }

    public Drink() {
        this(DrinkType.COKE, DrinkSize.MEDIUM);
    }
}
