package com.hackerrank;

public class TimeConversion {

    static String timeConversion(String s) {
        String newFormatTime;
        String strHours = s.substring(0,2);
        String noAMPM = s.substring(0, s.length() - 2);
        String noHours = noAMPM.substring(2);
        int hours = Integer.parseInt(strHours);

        if (s.contains("PM")) {
            String strProcessedHours;
            if (hours == 12) {
                strProcessedHours = Integer.toString(hours);
            } else {
                strProcessedHours = Integer.toString(hours + 12);
            }
            newFormatTime = strProcessedHours + noHours;
        } else if (hours == 12) {
            newFormatTime = "00" + noHours;
        } else {
            newFormatTime = noAMPM;
        }
        return newFormatTime;
    }

    public static void main(String[] args)  {
        String s = "07:05:45PM";
        String result = timeConversion(s);
        System.out.println("Result = " + result);
    }
}
