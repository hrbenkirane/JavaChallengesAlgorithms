package com.codewithtwins.inden.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03PrimesNumber {
    static List<Integer> calcPrimesUpTo(final int maxValue) {
        final boolean [] isPotentiallyPrime = new boolean[maxValue+1];
        Arrays.fill(isPotentiallyPrime, true);
        for (int i = 2; i <= maxValue / 2; i++) {
            if(isPotentiallyPrime[i]) {
                eraseMultiplesOfCurrent(isPotentiallyPrime, i);
            }
        }
        return buildPrimesList(isPotentiallyPrime);
    }

    private static List<Integer> buildPrimesList(final boolean[] isPotentiallyPrime) {
        final List<Integer> primes = new ArrayList<>();
        for (int i = 2; i < isPotentiallyPrime.length; i++) {
            if(isPotentiallyPrime[i]) {
                primes.add(i);
            }
        }
        return primes;
    }

    private static void eraseMultiplesOfCurrent(final boolean[] values, final int i) {
        for (int n = i+i; n < values.length ; n = n + i) {
            values[n] = false;
            System.out.println("Eliminating " + n);
        }
    }

}
