package shop.items.burgers;

import shop.items.MealItem;
import shop.utils.burger.BurgerPrice;
import shop.utils.burger.BurgerType;

public class Burger extends MealItem {
    private BurgerToppings burgerToppings1;
    private BurgerToppings burgerToppings2;
    private BurgerToppings burgerToppings3;
    private static double getBurgerPrice(String type) {
        if(type.equals(BurgerType.MAHARAJA)) {
            return BurgerPrice.MAHARAJA;
        }

        if(type.equals(BurgerType.ALOO_TIKKI)) {
            return BurgerPrice.ALOO_TIKKI;
        }

        if(type.equals(BurgerType.PERI_PERI_CHICKEN)) {
            return BurgerPrice.PERI_PERI_CHICKEN;
        }

        if(type.equals(BurgerType.ROASTED_PANEER)) {
            return BurgerPrice.ROASTED_PANEER;
        }

        if(type.equals(BurgerType.ROASTED_CHICKEN)) {
            return BurgerPrice.ROASTED_CHICKEN;
        }

        if(type.equals(BurgerType.VEGGIE_DELITE)) {
            return BurgerPrice.VEGGIE_DELITE;
        }

        if(type.equals(BurgerType.PERI_PERI_PANEER)) {
            return BurgerPrice.PERI_PERI_PANEER;
        }

        return 0;
    }

    public Burger(
            String type,
            BurgerToppings burgerToppings1,
            BurgerToppings burgerToppings2,
            BurgerToppings burgerToppings3
    ) {
        super(type, getBurgerPrice(type));
        this.burgerToppings1 = burgerToppings1;
        this.burgerToppings2 = burgerToppings2;
        this.burgerToppings3 = burgerToppings3;
    }

    public Burger() {
        this(BurgerType.VEGGIE_DELITE, new BurgerToppings(), null, null);
    }

    @Override
    public String getType() {
        return String.format(
             """
             %s and extra toppings of %s%s%s
             """,
                super.getType(),
                burgerToppings1 != null
                ? burgerToppings1.getType()
                : "",
                burgerToppings2 != null
                ? ", " + burgerToppings2.getType()
                : "",
                burgerToppings3 != null
                ? ", " + burgerToppings3.getType()
                : ""
        );
    }

    @Override
    public double getPrice() {
        double priceOfBurgerToppings1 = burgerToppings1 != null ? burgerToppings1.getPrice() : 0;
        double priceOfBurgerToppings2 = burgerToppings2 != null ? burgerToppings2.getPrice() : 0;
        double priceOfBurgerToppings3 = burgerToppings3 != null ? burgerToppings3.getPrice() : 0;

        return super.getPrice() + priceOfBurgerToppings1 + priceOfBurgerToppings2 + priceOfBurgerToppings3;
    }
}
