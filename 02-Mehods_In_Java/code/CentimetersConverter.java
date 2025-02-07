public class CentimetersConverter {
    public static double convertToCentimeters(int inches) {
        double centimeters = 2.54 * inches;
        return centimeters;
    }

    public static double convertToCentimeters(int heightInFeet, int remainingInches) {
        double centimeters = convertToCentimeters(remainingInches) + heightInFeet * 30;
        return centimeters;
    }

    public static void main(String[] args) {
        System.out.println(convertToCentimeters(5, 8));
        System.out.println(convertToCentimeters(40));
    }
}
