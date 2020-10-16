package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n");
        float n = sc.nextFloat();
        System.out.println("Enter the number m");
        float m = sc.nextFloat();
        new Main().closerTo(n,m);
    }

    public void closerTo(float n, float m) {
        float xn = 10 - n;
        float xm = 10 - m;
        if (xn < xm) {
            System.out.println("Number " + n + " closer to 10");
        }else if (xm<xn){
            System.out.println("Number " + m + " closer to 10");
        } else {
            System.out.println("Numbers " + n + " and " + m + "are equal");
        }
    }
}
