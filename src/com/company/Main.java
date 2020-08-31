package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int MONTHS_IN_YEAR = 12;
        int PERCENT = 100;
        int Principle = 0;
        float monthlyInterestRate;
        byte periods;
        int numberOfPayments;

        Scanner scanner = new Scanner(System.in);

        //taking input of principle from the user...
        while (true) {
            System.out.println("Principle: ");
            Principle = scanner.nextInt();

            if (Principle >= 1000 && Principle <= 1000000)
                break;
            System.out.println("enter a number between 1000 to 1000000");
        }
        System.out.println("Principle: " + Principle);


        //taking input of annual interest from the user...
        while (true) {
            System.out.println("Annual Interest rate: ");
            Scanner scanner2 = new Scanner(System.in);
            float inputInterest = (float) scanner2.nextDouble();

            monthlyInterestRate = (inputInterest / MONTHS_IN_YEAR) / PERCENT;
            if (inputInterest >= 1 && inputInterest <= 30)
                break;
            System.out.println("enter a number between 1 and 30");
        }
        System.out.println("Monthly Interest rate: " + monthlyInterestRate);


        //taking input of periods from the user...
        while (true) {
            System.out.println("Periods in Years");
            Scanner scPeriods = new Scanner(System.in);
            periods = (byte) scPeriods.nextInt();
            if (periods >= 1 && periods <= 30)
                break;
            System.out.println("enter a number between 1 and 30");

        }
        System.out.println("Periods(Years): " + periods);

        //number payments per month.
        numberOfPayments = periods * MONTHS_IN_YEAR;

        double mortgage = Principle *
                (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments)
                        / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1));

        //conversion into currency...
        System.out.println("Mortgage: " + NumberFormat.getCurrencyInstance().format(mortgage));
        System.out.println("\"Thank You Have a Gud Day...\"");
    }
}
