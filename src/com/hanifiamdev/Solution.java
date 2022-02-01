package com.hanifiamdev;

import java.io.*;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     *
     * Sample input
     * 07:05:45PM
     *
     * Sample output
     * 19:05:45
     */

    public static String timeConversion(String s) {
        // Write your code here
        String[] time = s.split(":");
        Integer jam = Integer.valueOf(time[0]);
        String menit = time[1];
        String detik = time[2].substring(0, 2);
        String period = time[2].substring(2);
        if (period.equals("AM") && jam == 12) {
            jam -= 12;
        } else if (period.equals("PM") && jam != 12) {
            jam += 12;
        }
        return (jam < 10 ? 0 + jam.toString() : jam.toString()) + ":" + menit + ":" + detik;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

