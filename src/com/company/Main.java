package com.company;

public class Main {

    public static void main(String[] args) {
        printYearsAndDays(-1); //return invalid value
        printYearsAndDays(525600); //return 1y and 0d
        printYearsAndDays(1051200); //return 2y and 0d
        printYearsAndDays(561600); //return 2y and 0d
        printYearsAndDays(0); //return 0y and 0d
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");

        } else {

            long years = minutes / 525600;
            long remainingMinutes = minutes % 525600;
            long days = remainingMinutes/1440;
            System.out.println(minutes + " min = " +years +" y and " + days + " d");

        }
    }
}
