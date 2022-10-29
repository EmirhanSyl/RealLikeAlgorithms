package com.blackflower.reallikealgorithms;

import java.util.Scanner;
import java.util.Random;

public class MontyHallProblemSimulation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int carDoor = random.nextInt(1, 4);

        System.out.println("Welcome To The Competition!");

        int selectedDoor;
        do {
            System.out.print("Please Choose your door: ");
            selectedDoor = sc.nextInt();
        } while (selectedDoor < 1 || selectedDoor > 3);

        System.out.println("Good luck :)");

        int eleminatedDoor;

        do {
            eleminatedDoor = random.nextInt(1, 4);
        } while (selectedDoor == eleminatedDoor);

        if (eleminatedDoor == carDoor) {
            System.out.println("Loser! You missed the car :=)");
        }
        else{
            System.out.println("Congratz, you are in round 2 -_-");
            
            int doorDecision;
            do {
                System.out.print("Do you wanna change your door? (1 = Yes), (0 = No): ");
                doorDecision = sc.nextInt();
            } while (doorDecision < 0 && doorDecision > 1);
            
            
            if ((selectedDoor == carDoor && doorDecision == 0) || (selectedDoor != carDoor && doorDecision == 1)) {
                System.out.println("Okay okay take your car and get out...");
            }
            else if ((selectedDoor == carDoor && doorDecision == 1) || (selectedDoor != carDoor && doorDecision == 0)) {
                System.out.println("Loser! You missed the car :=)");
            }
        }
    }
}
