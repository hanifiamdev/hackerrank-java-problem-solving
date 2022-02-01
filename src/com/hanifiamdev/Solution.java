package com.hanifiamdev;

import java.io.*;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     *
     * 7
     * 3 2 4 1 3 3 4   // nilai terbesar adalah 4 dan jumlahnya 2
     * 2               // Maka hasil 2
     */

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        int max = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < candles.size(); i++) {

            if (max < candles.get(i)) {
                count = 1;
                max = candles.get(i);
            } else if (max == candles.get(i)) {
                count++;
            }

        }
        return count;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> candles = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.birthdayCakeCandles(candles);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

