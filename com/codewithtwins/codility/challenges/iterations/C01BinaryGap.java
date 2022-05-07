package com.codewithtwins.codility.challenges;

public class C01BinaryGap {

    public int solution(int N) {

        String bString = Integer.toBinaryString(N);
        boolean started = false;
        int counter = 0;
        int maxCounter = 0;

        for (int i = 0; i < bString.length(); i++) {
            char c = bString.charAt(i);
            if(c == '1') {
                if(started) {
                    if(counter > maxCounter) {
                        maxCounter = counter;
                    }
                }
                counter = 0;
                started = true;
            }
            if(c == '0') {
                counter++;
            }
        }
        return maxCounter;
    }

    public static void main(String[] args) {
        C01BinaryGap gb = new C01BinaryGap();
        int solution = gb.solution(529);
        System.out.println(solution);
    }
}
