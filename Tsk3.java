package org.example.hw3;

import java.util.Scanner;

public class Tsk3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String aa = sc.nextLine();
        String bb = sc.nextLine();
        System.out.println(addBinary(aa,bb));
    }
   public static String addBinary(String str1, String str2){
        char [] arrayA = str1.toCharArray();
        char [] arrayB = str2.toCharArray();
        int res = 0;
        int i = arrayA.length -1;
        int j = arrayB.length -1;
        StringBuilder str = new StringBuilder();
        while (i>=0 && j>=0){
            int a  = arrayA[i]-'0';
            int b = arrayB[j]-'0';
            int sum = a+b+res;
            res=sum/2;
            str.append(sum%2);
            i--;
            j--;
        }
        while (i>=0){
            int a  = arrayA[i]-'0';
            int sum = a+res;
            res=sum/2;
            str.append(sum%2);
            i--;

        }
        while (j>=0){
            int b = arrayB[j]-'0';
            int sum = b+res;
            res=sum/2;
            str.append(sum%2);
            j--;
        }
        if (res!=0){
            str.append(res);
        }return str.reverse().toString();
   }
}

