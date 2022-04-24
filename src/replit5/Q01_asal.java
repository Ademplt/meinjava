package replit5;

import java.util.ArrayList;
import java.util.List;

public class Q01_asal {
    public static void main(String[] args) {
        /*
        Write a program that accepts an integer as input and prints first 10 prime
        numbers greater than input Check numbers if they are even or not in a return method.

        Input : 5

        Output : [7, 11, 13, 17, 19, 23, 29, 31, 37, 41]
         */

        List<Integer> asalList = new ArrayList<>();
        int input = 5;

        while (asalList.size() < 10) {
            int count = 0;
            for (int i = 2; i < input; i++) {
                if (input % i == 0) {
                    count++;

                }

            }
                if (count == 0) {
                    asalList.add(input);
            }

            input++;
        }
        System.out.println(asalList);
    }


}


