package shop.items.burgers;

import shop.items.MealItem;
import shop.utils.burger.BurgerToppingsPrice;
import shop.utils.burger.BurgerToppingsTypes;

public class BurgerToppings extends MealItem {
    private static double getBurgerToppingsPrice(String type) {
        if(type.equals(BurgerToppingsTypes.ONION_RINGS)) {
            return BurgerToppingsPrice.ONION_RINGS;
        }
        if(type.equals(BurgerToppingsTypes.CAPSICUM)) {
            return BurgerToppingsPrice.CAPSICUM;
        }
        if(type.equals(BurgerToppingsTypes.OLIVE)) {
            return BurgerToppingsPrice.OLIVE;
        }
        if(type.equals(BurgerToppingsTypes.CUCUMBER)) {
            return BurgerToppingsPrice.CUCUMBER;
        }
        return 0;
    }

    public BurgerToppings(String type, double price) {
        super(type, price);
    }

    public BurgerToppings(String type) {
        super(type, getBurgerToppingsPrice(type));
    }

    public BurgerToppings() {
        this(BurgerToppingsTypes.CAPSICUM);
    }
}
