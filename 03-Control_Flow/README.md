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
