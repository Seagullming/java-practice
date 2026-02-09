public class SecondsAndMinutes {

    public static String getDurationString(int seconds) {
        if (seconds < 0 ){
            return "Invalid value";
        }
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        int hours = minutes / 60;
            
         getDurationString(seconds, seconds);
         return results;
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes <0 || seconds <0 || seconds >59) {
            return "Invalid value";
        }
    }
}