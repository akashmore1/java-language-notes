# Switch Statement in Java:

With newer versions of java, there are two types of Switch Statements

1. Traditional Switch statement
2. Enhanced Switch Statement

### Traditional Switch:

```
public class LearnSwitch {
    public static int daysInMonth (String month) {
        int numberOfDays;
        switch(month){
            case "February":
                numberOfDays = 28;
                break;
            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                numberOfDays = 31;
                break;
            case "April":
            case "June":
            case "September":
            case "November":
                numberOfDays = 30;
                break;
            default:
                numberOfDays = -1;
        }

        return numberOfDays;
    }

    public static void main(String[] args) {
        System.out.println(daysInMonth("January"));
    }
}

```

### LearnSwitchEnhanced:

```
public class LearnSwitch {
    public static int daysInMonthEnhanced (String month) {
        int numberOfDays;
        switch(month) {
            case "February" -> numberOfDays = 28;
            case "January", "March", "May", "July", "August", "October", "December" -> numberOfDays = 31;
            case "April", "June", "September", "November" -> numberOfDays = 30;
            default -> numberOfDays = -1;
        }

        return numberOfDays;
    }
    public static void main(String[] args) {
        System.out.println(daysInMonthEnhanced("January"));
    }
}

```

```
public class LearnSwitch {
    public static int daysInMonthEnhancedYield (String month) {
        return switch(month) {
            case "February" -> 28;
            case "January", "March", "May", "July", "August", "October", "December" ->  31;
            case "April", "June", "September", "November" -> 30;
            default -> {
                yield -1;
            }
        };
    }

    public static void main(String[] args) {
        System.out.println(daysInMonthEnhancedYield("March"));
    }
}
```

# For loop

Prime number logic:

```
public class PrimeNumber {
    public static boolean isPrimeNumber (int number) {
        if(number == 2) {
            return true;
        }
        if(number == 0 || number == 1 || (number % 2 == 0)) {
            return false;
        }
        int halfNumber = number / 2;
        for(int i = 3; i < halfNumber; i++) {
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
```

# User Inputs in Java (Scanner)

1. To take user input we use scanner class

```
public class UserAge {
    public static int getUserAge() {
        System.out.println("Enter your birth year:");

        Scanner scanner = new Scanner(System.in);
        String birthYear = scanner.nextLine();

        int birthYear = Integer.parseInt(age);

        return 2025 - birthYear;
    }
}
```

# Scope of variables:

1. Unlike javascript, all variables declared in java are block scoped.
2. In case of switch-case statement, if a variable is declared in case 1, it can be accessed in other case statements provided it is declared before assigned a value
