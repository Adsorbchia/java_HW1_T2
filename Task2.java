package org.example.hw3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int sum=0;
        for (int i = 1; i < n; i++) {
            int b = sc.nextInt();
            if (a>0 && b<0){
                sum+=a;
            }
            a=b;
        }
        System.out.println(sum);
        sc.close();
    }
}

