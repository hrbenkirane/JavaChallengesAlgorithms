package com.codewithtwins.codility.challenges.primeandcompositenumbers;

public class C28CountFactors {

    public int solution(int N) {
        int factors = 0;
        for (int i = 1; i <= Math.sqrt(N); i++) {
            if( N % i == 0) {
                if( i < Math.sqrt(N)) {
                    factors += 2;
                } else {
                    factors++;
                }
            }
        }
        return factors;
    }

    public static void main(String[] args) {
        System.out.println(new C28CountFactors().solution(24));
    }
}
