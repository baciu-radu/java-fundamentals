package main.java;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class StringToUppercase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, i;
        System.out.println("n=");
        n = in.nextInt();
        String [] strings = new String[n];
        String s2[]=new String[strings.length];
        for (i = 0; i < n; i++){
            System.out.println("strings["+i+"]=");
            strings[i] = in.next();
        }

//        display initial values
        for (String str: strings){
            System.out.println(str);
        }

//        //change case
        for (i = 0; i < n; i++){
            System.out.println(strings[i].toUpperCase());
        }


    }
}
