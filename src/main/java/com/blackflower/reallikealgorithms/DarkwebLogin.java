package com.blackflower.reallikealgorithms;

import java.util.Scanner;


public class DarkwebLogin {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String name_User1 = "admin";
        String passwd_User1 = "passw0rd";
        double bitcoinAmount_User1 = 56879521.45687512;
        
        String name_User2 = "blackHat";
        String passwd_User2 = "walletBlaster";
        double bitcoinAmount_User2 = 8652.546;
        
        String name_User3 = "whiteHat";
        String passwd_User3 = "bugBounderer";
        double bitcoinAmount_User3 = 5.252;
        
        System.out.print("Please enter username: ");
        String username = sc.nextLine();
        System.out.print("Please enter username: ");
        String password = sc.nextLine();
        
        if (username.equals(name_User1) && password.equals(passwd_User1)) {
            System.out.println("Wellcome " + username);
            System.out.println("Your Bitcoin amount in wallet is: " + bitcoinAmount_User1);
        }
        else if (username.equals(name_User2) && password.equals(passwd_User2)) {
            System.out.println("Wellcome " + username);
            System.out.println("Your Bitcoin amount in wallet is: " + bitcoinAmount_User2);
        }
        else if (username.equals(name_User3) && password.equals(passwd_User3)) {
            System.out.println("Wellcome " + username);
            System.out.println("Your Bitcoin amount in wallet is: " + bitcoinAmount_User3);
        }
        else{
            System.out.println("User not found or password incorrect!");
        }
    }
}
