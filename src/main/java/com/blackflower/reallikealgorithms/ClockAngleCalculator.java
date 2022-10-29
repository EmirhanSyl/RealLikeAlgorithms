package com.blackflower.reallikealgorithms;

import java.util.Scanner;

public class ClockAngleCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hour;
        int minute;

        do {
            System.out.print("Please Input Hour: ");
            hour = sc.nextInt();
        } while (hour < 0 || hour >= 24);
        
        if (hour > 12) {
            hour -= 12;
        }
        
        do {
            System.out.print("Please Input Minute: ");
            minute = sc.nextInt();
        } while (minute < 0 || minute >= 60);
        
        
        double angle = ((11*minute) - (60 * hour)) / 2;
        if (angle < 0) {
            angle *= -1;
        }
        
        System.out.println("The angle between " + hour + " and " + minute + " is: " + angle);
    }

}
