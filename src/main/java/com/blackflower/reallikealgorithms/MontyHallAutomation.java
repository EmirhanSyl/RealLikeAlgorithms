package com.blackflower.reallikealgorithms;

import java.util.Random;

public class MontyHallAutomation {
    public static void main(String[] args) {
        
        Random random = new Random();
        
        int iterationCount = 10000000;
        int changeWin = 0;
        int stabilityWin = 0;
        
        int i = 0;
        while(i < iterationCount) {
            int carDoor = random.nextInt(3);            
            int selectedDoor = random.nextInt(3);
            
            int eleminatedDoor;
            do {
                eleminatedDoor = random.nextInt(3);
            } while (eleminatedDoor == selectedDoor || eleminatedDoor == carDoor);
            
            
            int doorDecision = random.nextInt(2);
            
            if (selectedDoor == carDoor && doorDecision == 0) {
                stabilityWin++;
                i++;
                System.out.println("Iteration " + i);
            }
            else if (selectedDoor != carDoor && doorDecision == 1) {
                changeWin++;
                i++;
                System.out.println("Iteration " + i);
            }
            
        }
        
        double finalResult = (double)changeWin / stabilityWin;
        System.out.println(finalResult);
    }
}
