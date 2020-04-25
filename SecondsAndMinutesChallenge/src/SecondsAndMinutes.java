public class SecondsAndMinutes {
    public static void main(String[] args) {
        System.out.println(getDurationString(131, 5));
        System.out.println(getDurationString(191));
    }
    public static String getDurationString (int minutes, int seconds) {
        if ((minutes <= 0) || (seconds <= 0 || seconds >= 59)) {
            return "Invalid value";
        } else {
            int hours = minutes / 60;
            return hours + "h " + minutes % 60 + "m " + seconds + "s";
        }
    }
    public static String getDurationString (int seconds) {
        if (seconds <= 0) {
            return "Invalid value";
        } else {
            int minutes = seconds / 60;
            seconds = seconds % 60;
            getDurationString(minutes,seconds);
            return getDurationString(minutes,seconds);
        }
    }
}
