package com.example;
public class SecondsAndMinutes {


    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(-41));
        System.out.println(getDurationString(65, 9));
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0 ){
            return "Invalid value";
        }
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        String results = hours + "h " + remainingMinutes + "m " + remainingSeconds  + "s";
         getDurationString(seconds, seconds);
         return results;
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes <0 || seconds <0 || seconds >59) {
            return "Invalid value";                 
        }
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;                
        String results = hours + "h " + remainingMinutes + "m " + seconds  + "s";
        return results;
    }
}