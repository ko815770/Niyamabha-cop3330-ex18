package org.example;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */
public class App {
    public static void main(String[] args) {
        int temp;
        String put;
        System.out.println("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit.");
        Scanner input = new Scanner(System.in);
        put = input.nextLine();
        System.out.println("Please enter the temperature in " + (("c".equals(put) || "C".equals(put)) ? "Celsius" : "Fahrenheit"));
        temp = input.nextInt();
        if ("c".equals(put) || "C".equals(put))
        {
            System.out.println("The temperature in Celsius is " + ((temp - 32) * 5 / 9) + ".");
        }
        else
        {
            System.out.println("The temperature in Fahrenheit is " + ((temp * 9 / 5) + 32) + ".");
        }
    }
}