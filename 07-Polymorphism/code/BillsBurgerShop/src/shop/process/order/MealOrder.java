package shop.process.order;

import shop.items.burgers.Burger;
import shop.items.burgers.BurgerToppings;
import shop.items.drinks.Drink;
import shop.items.sideitems.SideItem;
import shop.process.meal.Meal;
import shop.process.validation.UserInputValidation;
import shop.utils.burger.BurgerToppingsTypes;
import shop.utils.burger.BurgerType;
import shop.utils.drink.DrinkSize;
import shop.utils.drink.DrinkType;
import shop.utils.sideitems.SideItemTypes;

import java.util.Scanner;

public class MealOrder {
    private static void orderDefaultMeal() {
        Meal defaultMeal = new Meal();

        String orderSummary = defaultMeal.getOrderDetails();
        Double totalPrice = defaultMeal.getTotalOrderPrice();

        System.out.println(String.format(
               """
               Order Summary:
               %s
               
               Total price of the Yummy Burger Meal is: Rs %.2f
                """,
                orderSummary,
                totalPrice
        ));
    }

    private static String getBurgerToppingName(String option) {
        return switch(option) {
            case "1" -> BurgerToppingsTypes.ONION_RINGS;
            case "2" -> BurgerToppingsTypes.CAPSICUM;
            case "3" -> BurgerToppingsTypes.OLIVE;
            case "4" -> BurgerToppingsTypes.CUCUMBER;
            default -> "";
        };
    }

    private static void orderDeluxeBurgerMeal() {
        // Deluxe burger is most expensive or best meal
        Scanner scanner = new Scanner(System.in);

        String toppingsSelectionOption1;
        String toppingsSelectionOption2;

        System.out.println("Great choice of Deluxe Burger!");
        System.out.println("You will get Maharaja burger, 2 free toppings of your choice, Peri-Peri French Fries and large coke!");
        do {
            System.out.println("First Topping");
            System.out.println("Choose one of following toppings options by entering '1', '2', '3' or '4'");
            System.out.println("1. " + BurgerToppingsTypes.ONION_RINGS);
            System.out.println("2. " + BurgerToppingsTypes.CAPSICUM);
            System.out.println("3. " + BurgerToppingsTypes.OLIVE);
            System.out.println("4. " + BurgerToppingsTypes.CUCUMBER);
            toppingsSelectionOption1 = scanner.nextLine();
        }
        while(!UserInputValidation.isToppingsOptionValid(toppingsSelectionOption1));

        do {
            System.out.println("Second Topping");
            System.out.println("Choose one of following toppings options by entering '1', '2', '3' or '4'");
            System.out.println("1. " + BurgerToppingsTypes.ONION_RINGS);
            System.out.println("2. " + BurgerToppingsTypes.CAPSICUM);
            System.out.println("3. " + BurgerToppingsTypes.OLIVE);
            System.out.println("4. " + BurgerToppingsTypes.CUCUMBER);
            toppingsSelectionOption2 = scanner.nextLine();
        }
        while(!UserInputValidation.isToppingsOptionValid(toppingsSelectionOption2));

        String topping1 = getBurgerToppingName(toppingsSelectionOption1);
        String topping2 = getBurgerToppingName(toppingsSelectionOption2);

        BurgerToppings burgerTopping1 = new BurgerToppings(topping1, 0);
        BurgerToppings burgerTopping2 = new BurgerToppings(topping2, 0);
        Burger deluxeBurger = new Burger(BurgerType.MAHARAJA, burgerTopping1, burgerTopping2, null);

        Drink deluxeDrink = new Drink(DrinkType.COKE, DrinkSize.LARGE);

        SideItem deluxeSideItem = new SideItem(SideItemTypes.PERI_PERI_FRENCH_FRISE);

        Meal deluxeMeal = new Meal(deluxeBurger, deluxeDrink, deluxeSideItem);

        String orderSummary = deluxeMeal.getOrderDetails();
        Double totalPrice = deluxeMeal.getTotalOrderPrice();

        System.out.println(String.format(
               """
               Order Summary:
               %s
               
               Total price of the Yummy Burger Meal is: Rs %.2f
                """,
                orderSummary,
                totalPrice
        ));
    }

    private static void orderMealManually() {
        Scanner scanner = new Scanner(System.in);

        String burgerSelectionOption;
        String toppingsSelectionOption1;
        String toppingsSelectionOption2;
        String toppingsSelectionOption3;

        String drinkSelectionOption;
        String drinkSizeOption;

        String sideItemSelectionOption;

        System.out.println("You can customize you meal");

        do {
            System.out.println("Please select burger you want by entering options '1', '2' and '3' etc");
            System.out.println("1. " + BurgerType.MAHARAJA);
            System.out.println("2. " + BurgerType.ALOO_TIKKI);
            System.out.println("3. " + BurgerType.PERI_PERI_CHICKEN);
            System.out.println("4. " + BurgerType.PERI_PERI_PANEER);
            System.out.println("5. " + BurgerType.VEGGIE_DELITE);
            System.out.println("6. " + BurgerType.ROASTED_PANEER);
            System.out.println("7. " + BurgerType.ROASTED_PANEER);

            burgerSelectionOption = scanner.nextLine();
        }
        while(!UserInputValidation.isBurgerSelectionOptionValid(burgerSelectionOption));

        System.out.println("Great burger choice of " + getBurgerName(burgerSelectionOption));
        System.out.println("Now select options (1, 2, 3 or 4) toppings for your " + getBurgerName(burgerSelectionOption));
        do {
            System.out.println("Select 1st toppings: (Enter option '1', '2', '3' or '4')");
            System.out.println("1. " + BurgerToppingsTypes.ONION_RINGS);
            System.out.println("2. " + BurgerToppingsTypes.CAPSICUM);
            System.out.println("3. " + BurgerToppingsTypes.OLIVE);
            System.out.println("4. " + BurgerToppingsTypes.CUCUMBER);
            toppingsSelectionOption1 = scanner.nextLine();
        }
        while(!UserInputValidation.isToppingsOptionValid(toppingsSelectionOption1));

        do {
            System.out.println("Select 2nd toppings: (Enter option '1', '2', '3' or '4')");
            System.out.println("1. " + BurgerToppingsTypes.ONION_RINGS);
            System.out.println("2. " + BurgerToppingsTypes.CAPSICUM);
            System.out.println("3. " + BurgerToppingsTypes.OLIVE);
            System.out.println("4. " + BurgerToppingsTypes.CUCUMBER);
            toppingsSelectionOption2 = scanner.nextLine();
        }
        while(!UserInputValidation.isToppingsOptionValid(toppingsSelectionOption2));

        do {
            System.out.println("Select 3rd toppings: (Enter option '1', '2', '3' or '4')");
            System.out.println("1. " + BurgerToppingsTypes.ONION_RINGS);
            System.out.println("2. " + BurgerToppingsTypes.CAPSICUM);
            System.out.println("3. " + BurgerToppingsTypes.OLIVE);
            System.out.println("4. " + BurgerToppingsTypes.CUCUMBER);
            toppingsSelectionOption3 = scanner.nextLine();
        }
        while(!UserInputValidation.isToppingsOptionValid(toppingsSelectionOption3));

        System.out.println("After selecting toppings, please select a drink");
        do {
            System.out.println("Select your drink from below options (1, 2, 3, 4)");
            System.out.println("1. " + DrinkType.COKE);
            System.out.println("2. " + DrinkType.FANTA);
            System.out.println("3. " + DrinkType.PEPSI);
            System.out.println("4. " + DrinkType.SPRITE);

            drinkSelectionOption = scanner.nextLine();
        }
        while (!UserInputValidation.isDrinkOptionValid(drinkSelectionOption));

        System.out.println("That's a great choice of " + getDrinkType(drinkSelectionOption));
        System.out.println("Now select your drink size");

        do {
            System.out.println("Select an option (1, 2 or 3) for selecting size of drink");
            System.out.println("1. " + DrinkSize.SMALL);
            System.out.println("2. " + DrinkSize.MEDIUM);
            System.out.println("3. " + DrinkSize.LARGE);

            drinkSizeOption = scanner.nextLine();
        }
        while(!UserInputValidation.isMealOrderValid(drinkSizeOption));

        System.out.println("Great! Almost there!");
        System.out.println("Now please select Side Item for your meal");

        do {
            System.out.println("Please select one of following options (1, 2, 3 or 4).");
            System.out.println("1. " + SideItemTypes.FRENCH_FRISE);
            System.out.println("2. " + SideItemTypes.PERI_PERI_FRENCH_FRISE);
            System.out.println("3. " + SideItemTypes.POTATO_WEDGES);
            System.out.println("4. " + SideItemTypes.SWEET_FRUIT_SALAD);

            sideItemSelectionOption = scanner.nextLine();
        }
        while(!UserInputValidation.isDrinkOptionValid(sideItemSelectionOption));

        System.out.println("Great, your order is complete");

        BurgerToppings burgerToppings1 = new BurgerToppings(getBurgerToppingName(toppingsSelectionOption1));
        BurgerToppings burgerToppings2 = new BurgerToppings(getBurgerToppingName(toppingsSelectionOption2));
        BurgerToppings burgerToppings3 = new BurgerToppings(getBurgerToppingName(toppingsSelectionOption3));

        Burger burger = new Burger(getBurgerName(burgerSelectionOption), burgerToppings1, burgerToppings2, burgerToppings3);

        Drink drink = new Drink(getDrinkType(drinkSelectionOption), getDrinkSize(drinkSizeOption));

        SideItem sideItem = new SideItem(getSideItemType(sideItemSelectionOption));

        Meal meal = new Meal(burger, drink, sideItem);

        String orderSummary = meal.getOrderDetails();
        Double totalPrice = meal.getTotalOrderPrice();

        System.out.println(String.format(
                """
                Order Summary:
                %s
                
                Total price of the Yummy Burger Meal is: Rs %.2f
                 """,
                orderSummary,
                totalPrice
        ));
    }

    private static String getSideItemType(String sideItemSelectionOption) {
        return switch(sideItemSelectionOption) {
            case "1" -> SideItemTypes.FRENCH_FRISE;
            case "2" -> SideItemTypes.PERI_PERI_FRENCH_FRISE;
            case "3" ->  SideItemTypes.POTATO_WEDGES;
            case "4" -> SideItemTypes.SWEET_FRUIT_SALAD;
            default -> "";
        };
    }

    private static String getDrinkSize(String drinkSizeOption) {
        return switch(drinkSizeOption) {
            case "1" -> DrinkSize.SMALL;
            case "2" -> DrinkSize.MEDIUM;
            case "3" -> DrinkSize.LARGE;
            default -> "";
        };
    }

    private static String getDrinkType(String drinkOption) {
        return switch(drinkOption) {
            case "1" -> DrinkType.COKE;
            case "2" -> DrinkType.FANTA;
            case "3" -> DrinkType.PEPSI;
            case "4" -> DrinkType.SPRITE;
            default -> "";
        };
    }

    private static String getBurgerName(String burgerOption) {
        return switch(burgerOption) {
            case "1" -> BurgerType.MAHARAJA;
            case "2" -> BurgerType.ALOO_TIKKI;
            case "3" -> BurgerType.PERI_PERI_CHICKEN;
            case "4" -> BurgerType.PERI_PERI_PANEER;
            case "5" -> BurgerType.VEGGIE_DELITE;
            case "6" -> BurgerType.ROASTED_PANEER;
            case "7" -> BurgerType.ROASTED_PANEER;
            default -> "";
        };
    }

    // This function should print all items that were ordered and total order price
    public static void orderMeal () {
        Scanner scanner = new Scanner(System.in);
        String selectedMealOption;
        System.out.println("Welcome to Bill's Burger!");
        System.out.println("Select the meal of your choice");

        do {
            System.out.println("Please select one of options '1', '2' or '3'");
            System.out.println("1. Our best seller Yummy Burger Meal");
            System.out.println("2. Deluxe Burger");
            System.out.println("3. Choose manually");
            selectedMealOption = scanner.nextLine();
        }
        while(!UserInputValidation.isMealOrderValid(selectedMealOption));

        switch(selectedMealOption) {
            case "1":
                orderDefaultMeal();
                break;
            case "2":
                orderDeluxeBurgerMeal();
                break;
            case "3":
                orderMealManually();
                break;
        }

    }
}
