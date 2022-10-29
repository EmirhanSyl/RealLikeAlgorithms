package com.blackflower.reallikealgorithms;

import java.util.Random;
import java.util.Scanner;

public class DungeonWorms {

    static Random random = new Random();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int maxHealth = 100;
        double currentHealth = maxHealth;

        int armor = 20;
        int minAttackPoweer = 9;
        int maxAttackPower = 20;

        double firstMonsterHealth = 50;
        int minAttack_FirstMob = 4;
        int maxAttack_FirstMob = 14;

        while (currentHealth > 0 || firstMonsterHealth > 0) {
            int dice = ThrowDice();
            if (dice >= 30) {
                
            }
            else if (dice >= 20) {
                
            }
            else if (dice > 3) {
                
            }
            else{
                
            }
        }
    }

    public static int ThrowDice() {
        sc.next();
        return random.nextInt(1, 37);
    }
}
