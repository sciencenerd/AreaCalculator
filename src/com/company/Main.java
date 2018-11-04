package com.company;

public class Main {

    public static void main(String[] args) {
//        printYearsAndDays(-1); //return invalid value
//        printYearsAndDays(525600); //return 1y and 0d
//        printYearsAndDays(1051200); //return 2y and 0d
        printYearsAndDays(1051200); //return 1y and 25d
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");

        } else {

            long hours = minutes/60;
            long days = hours/24;
            long years = days/365;
            long remainingDays = days % 365;
            System.out.println(minutes + " min = " +years +" y and " + remainingDays + " d");

        }
    }
}
