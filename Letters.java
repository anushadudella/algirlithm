package com.simplerjava;

import java.util.Scanner;

public class Letters {

    public static void main(String[] args) {

        String alpha = "abcdefghijklmnopqrstuvwxyz";
        String keyphrase = "akzhqkhsgl"; //input.nextLine();
        System.out.println(keyphrase);
        String modifiedAlpha = "abcdefzghijklmnopqrstuvwxy" ; //input.nextLine();
        String actualLetter = "";
        String actualLetter1 = "";
        for(int i = 0; i < keyphrase.length(); i++){
            String letter = keyphrase.substring(i,i+1);
            int pos = modifiedAlpha.indexOf(letter);
            actualLetter1 =  actualLetter1 + alpha.substring(pos,pos +1);

        }
        System.out.println(actualLetter1);

    }
}
