package com.hanifiamdev;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     *
     *
     * Test :
     * 6
     * -4 3 -9 0 4 1
     * 0.500000
     * 0.333333
     * 0.166667
     */

    public static void plusMinus(List<Integer> arr) {

        // Write your code here
        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == 0) zero += 1;
            else if (arr.get(i) > 0) positive += 1;
            else negative += 1;
        }
        DecimalFormat df = new DecimalFormat("0.000000");
        System.out.println(df.format(Double.valueOf(positive) / arr.size()));
        System.out.println(df.format(Double.valueOf(negative) / arr.size()));
        System.out.println(df.format(Double.valueOf(zero) / arr.size()));

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
