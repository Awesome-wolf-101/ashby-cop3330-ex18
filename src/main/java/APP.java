/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Ashby
 */

import java.util.Calendar;
import java.util.Scanner;
import java.lang.Math;

public class APP {


    public static void main(String[] args) {
        final int legalDriveAge = 16;
        System.out.println("Press C to convert from Fahrenheit to Celsius.\n" +
                "Press F to convert from Celsius to Fahrenheit.");
        Scanner sc = new Scanner(System.in);
        String Choice = sc.nextLine();

        if(Choice.equals("C") || Choice.equals("c"))
        {
            System.out.println("Your choice: " + Choice +
                    "\nPlease enter the temperature in Fahrenheit:");
            String TempFar = sc.nextLine();
            double TempFarDouble = Double.parseDouble(TempFar);
            double TempCelcDouble =  (TempFarDouble - 32) * 5 / 9;
            System.out.println("The temperature in Celsius is " + TempCelcDouble + ".");

        }
        else if(Choice.equals("F") || Choice.equals("f"))
        {
            System.out.println("Your choice: " + Choice +
                    "\nPlease enter the temperature in Celsius:");
            String TempCel = sc.nextLine();
            double TempCelDouble = Double.parseDouble(TempCel);
            double TempFarDouble =  (TempCelDouble * 9 / 5) + 32;
            System.out.println("The temperature in Fahrenheit is " + TempFarDouble + ".");
        }
        else
        {
            System.out.println("Choice not valid, please restart the program and try again");
            System.exit(-1);
        }


    }


}
