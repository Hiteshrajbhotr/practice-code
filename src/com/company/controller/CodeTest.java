package com.company.controller;

import java.util.Scanner;

public class CodeTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Two number:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Subtract result: "+ subtractTwoNum(a,b));
    }

    public static int subtractTwoNum(int a,int b){
        int c = a-b;
        return c;
    }
}
