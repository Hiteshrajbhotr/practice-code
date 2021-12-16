package com.company.controller;

import java.util.Scanner;

public class CodeTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Two number:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int c = a+b;
        System.out.println("Add upto: "+ c);
    }
}
