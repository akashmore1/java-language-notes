package shop.process.validation;

public class UserInputValidation {
    public static boolean isMealOrderValid (String userInput) {
        if(userInput.equals("1") || userInput.equals("2")  || userInput.equals("3") ) {
            return true;
        }
        return false;
    }

    public static boolean isToppingsOptionValid(String toppingsOption) {
        if(toppingsOption.equals("1") || toppingsOption.equals("2") || toppingsOption.equals("3") || toppingsOption.equals("4")) {
            return true;
        }

        return false;
    }

    public static boolean isBurgerSelectionOptionValid(String burgerSelectionOption) {
        if(
                burgerSelectionOption.equals("1") ||
                burgerSelectionOption.equals("2") ||
                burgerSelectionOption.equals("3") ||
                burgerSelectionOption.equals("4") ||
                burgerSelectionOption.equals("5") ||
                burgerSelectionOption.equals("6") ||
                burgerSelectionOption.equals("7")
        ) {
            return true;
        }

        return false;
    }

    public static boolean isDrinkOptionValid(String drinkOption) {
        if(
                drinkOption.equals("1") ||
                drinkOption.equals("2") ||
                drinkOption.equals("3") ||
                drinkOption.equals("4")
        ) {
            return true;
        }

        return false;
    }
}
