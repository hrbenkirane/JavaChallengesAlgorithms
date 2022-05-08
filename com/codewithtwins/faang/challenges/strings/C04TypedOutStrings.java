package com.codewithtwins.faang.challenges.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class C04TypedOutStrings {

    public String builString(String s) {
        List<String> builtArray = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if(!s.substring(i, i+1).equals("#")) {
                builtArray.add(s.substring(i, i+1));
            } else {
                if(builtArray.size() > 0) {
                    builtArray.remove(builtArray.size() - 1);
                }
            }
        }
        return builtArray.stream().collect(Collectors.joining());
    }

    public boolean backspaceCompare(String S, String T) {
        final String finalS = builString(S);
        final String finalT = builString(T);

        if(finalS.length() != finalT.length()) {
            return false;
        } else {
            for (int i = 0; i < finalS.length(); i++) {
                if(!finalS.substring(i, i+1).equals(finalT.substring(i, i+1))) {
                    return false;
                }

            }
        }
        return true;
    }

    public boolean optimizeBackSpaceCompare(String S, String T) {
        int p1 = S.length() -1;
        int p2 = T.length() -1;

        while( p1 >= 0 || p2 >= 0) {
            if(S.substring(p1, p1+1).equals("#") || T.substring(p2, p2+1).equals("#")) {
                if(S.substring(p1, p1+1).equals("#")) {
                    int backCount = 2;
                    while(backCount > 0) {
                        p1--;
                        backCount--;
                        if(S.substring(p1, p1+1).equals("#")) {
                            backCount += 2;
                        }
                    }
                }
                if(T.substring(p2, p2+1).equals("#")) {
                    int backCount = 2;
                    while(backCount > 0) {
                        p2--;
                        backCount--;
                        if(T.substring(p2, p2+1).equals("#")) {
                            backCount += 2;
                        }
                    }
                }
            } else {
                if(!S.substring(p1, p1+1).equals(T.substring(p2, p2+1))) {
                    return false;
                } else {
                    p1--;
                    p2--;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(new C04TypedOutStrings().optimizeBackSpaceCompare("abc##d", "abzz###d"));
        System.out.println(new C04TypedOutStrings().builString("abzz###d"));
        System.out.println(new C04TypedOutStrings().builString("abc##d"));
    }





}
