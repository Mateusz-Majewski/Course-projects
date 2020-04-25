public class MinutesToYearsDaysCalculator {
    public static final String INVALID_VALUE = "Invalid Value";
    public static void printYearsAndDays (long minutes) {
        if (minutes < 0) {
            System.out.println(INVALID_VALUE);
        } else {
            long hours = minutes / 60;
            long days = hours / 24;
            long years = days / 365;
            System.out.println(minutes + " min = " + years + " y and " + days % 365 + " d");
        }
    }
}
