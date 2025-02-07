public class HourMinuteSecond {
    public static String getDurationString(int seconds) {
        int remainingSeconds = seconds % 60;
        int minutes = (seconds - remainingSeconds) / 60;

        return getDurationString(minutes, remainingSeconds);
    }

    public static String getDurationString(int minutes, int seconds) {
        int remainingMinutes = minutes % 60;
        int hours = (minutes - remainingMinutes) / 60;

        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }

    public static void main(String[] args) {
        System.out.print(getDurationString(366737));
    }
}
