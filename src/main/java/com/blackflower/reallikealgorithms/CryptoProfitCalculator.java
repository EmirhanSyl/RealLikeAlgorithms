package com.blackflower.reallikealgorithms;

import java.util.Scanner;


public class CryptoProfitCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double firstBitcoinPrice = 19411;        
        double lastBitcoinPrice = 20441.7;
        
        double firstEtheriumPrice = 1337.37;        
        double lastEtheriumPrice = 1529.28;
        
        System.out.print("Please input your Bitcoin amount: ");
        double bitcoinAmount = sc.nextDouble();
        
        System.out.print("Please input your Etherium amount: ");
        double etheriumAmount = sc.nextDouble();
        
        double bitcoinProfit = (lastBitcoinPrice * bitcoinAmount) - (firstBitcoinPrice * bitcoinAmount);
        double bitcoinProfitPercentage = (bitcoinProfit * 100) / (firstBitcoinPrice * bitcoinAmount);
        
        double etheriumProfit = (lastEtheriumPrice - firstEtheriumPrice) * etheriumAmount;
        double etheriumProfitPercentage = (etheriumProfit * 100) / (firstEtheriumPrice * etheriumAmount);
        
        System.out.println("Your earnings from bitcoin between September and October: " + bitcoinProfit + "$ and " + bitcoinProfitPercentage + "%");
        System.out.println("Your earnings from etherium between September and October: " + etheriumProfit + "$ and " + etheriumProfitPercentage + "%");
    }
}
