package com.codewithtwins.codility.challenges.primeandcompositenumbers;

public class C30MinPerimeterRectangle {
    public int solution(int N) {
        for (int i = (int)Math.ceil(Math.sqrt(N)); i >=1 ; i--) {
            if(((double)N/i) % 1 == 0) {
                return i*2 + ((N/i) * 2);
            }

        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(new C30MinPerimeterRectangle().solution(30));
    }
}
