/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Brooks McKinley
 */

package com.brooksmckinley;

import java.util.Scanner;

public class App {

    static double WI_TAX_RATE = 0.055;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is the order amount? ");
        double amount = scan.nextDouble();
        System.out.print("What is the state? ");
        String state = scan.next();

        System.out.println(getTotalReport(amount, state));
    }

    public static String getTotalReport(double amount, String state) {
        if (state.equals("WI")) {
            double taxCents = Math.ceil((amount * 100) * WI_TAX_RATE);
            return String.format("The subtotal is $%.2f.\nThe tax is $%.2f.\nThe total is $%.2f.",
                    amount, taxCents / 100, amount + (taxCents / 100));
        }
        return String.format("The total is $%.2f.", amount);
    }
}