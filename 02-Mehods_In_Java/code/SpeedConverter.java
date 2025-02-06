public class SpeedConverter {
    // write code here
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }

        double speedInMph = kilometersPerHour / 1.609;
        long speedInMilesPerHour = (long) (Math.round(speedInMph));
        return speedInMilesPerHour;
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
            return;
        }

        long speedInMph = (long) (Math.round(kilometersPerHour / 1.609));

        System.out.print(kilometersPerHour + " km/h = " + speedInMph + " mi/h");
    }
}