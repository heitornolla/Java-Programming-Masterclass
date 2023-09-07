public class Main {
    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65, 45));
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid data: " + seconds + " must be positive";
        }

        return getDurationString(seconds / 60, seconds % 60);
    }

    public static String getDurationString(int minutes, int seconds) {
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        if (minutes < 0) {
            return "Invalid data: " + minutes + "must be positive";
        }

        if (seconds < 0 || seconds > 59) {
            return "Invalid data: " + seconds + " must be between 0 and 59";
        }

        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }
}