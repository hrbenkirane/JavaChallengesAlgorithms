package com.codewithtwins.inden.challenges;

public class C02PerfectNumber {
    static boolean isPerectNumberSimple(final int number) {
        int sumOfMultifiers = 1;
        for (int i = 2; i <= number / 2 ; i++) {
            if(number % i == 0) {
                sumOfMultifiers += i;
            }
        }
        return sumOfMultifiers == number;
    }
}
