package com.codewithtwins.codility.challenges.prefixsums;

public class C11PassingCars {

    public int solution(int[] A) {
        int eastBoundCarsSeen = 0;
        int passingCars = 0;
        for(int a : A) {
            if(a == 0) {
                eastBoundCarsSeen++;
            } else {
                passingCars = passingCars + eastBoundCarsSeen;
                if(passingCars > 1000000000) {
                    return -1;
                }
            }
        }

        return  passingCars;

    }

    public static void main(String[] args) {
        C11PassingCars pc = new C11PassingCars();
        System.out.println(pc.solution(new int[]{0, 1, 0, 1, 1}));
    }
}
