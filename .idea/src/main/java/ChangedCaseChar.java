package main.java;

import java.util.Scanner;

public class ChangedCaseChar {
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

        //change case
        for (i = 0; i < n; i++){
           char[] changedCase=strings[i].toCharArray();
            System.out.println("Lenght is:"+changedCase.length);
           for (int j = 0; j < changedCase.length; j++){
               char ch= changedCase[j];
               if(Character.isUpperCase(ch)==true){
                   changedCase[j] = Character.toLowerCase(changedCase[j]);
               }else changedCase[j] = Character.toUpperCase(changedCase[j]);
           }
           strings[i]= String.valueOf(changedCase);
        }

        //display changed case
        for (i = 0; i < n; i++){
            System.out.println(strings[i]);
        }

    }
}
