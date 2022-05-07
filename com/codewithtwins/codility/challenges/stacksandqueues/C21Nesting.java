package com.codewithtwins.codility.challenges.stacksandqueues;

public class C21Nesting {
    public int solution(String S) {
        int counter = 0;
        for (int i = 0; i < S.length(); i++) {
            if(S.substring(i, i+1).equals("(")) {
                counter++;
            } else {
                counter--;
            }
            if(counter < 0) {
                return 0;
            }

        }
        return counter == 0 ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(new C21Nesting().solution("())"));
        System.out.println(new C21Nesting().solution("(()))"));
        System.out.println(new C21Nesting().solution("(())"));
    }


}
