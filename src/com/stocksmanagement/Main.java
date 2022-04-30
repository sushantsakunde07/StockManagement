package com.stocksmanagement;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws InputMismatchException, IndexOutOfBoundsException, NumberFormatException, IOException {
        Stock stock = new Stock();
        File file = new File("C:\\Users\\satot\\eclipse-workspace\\JavaProject\\StockManagementSystem\\src\\StockList.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String string;
        int totalValue = 0;
        System.out.println("*-------------StockReport--------------*");
        while ((string = bufferedReader.readLine()) != null) {
            try {
                StringTokenizer stringTokenizer = new StringTokenizer(string);
                stock.shareName = stringTokenizer.nextToken();
                stock.sharePrice = Float.parseFloat(stringTokenizer.nextToken());
                stock.numberOfShares = Integer.parseInt(stringTokenizer.nextToken());

                stock.setValueOfShare((stock.sharePrice * stock.numberOfShares));
                System.out.println("Name of share: " + stock.shareName);
                System.out.println("Share price: " + stock.sharePrice);
                System.out.println("Number of share: " + stock.numberOfShares);
                System.out.println("Value of share: " + stock.getValueOfShare());
                System.out.println(" ");
            }
            // Catch block to handle NumberFormatException
            catch (NumberFormatException e) {
                // Print the message if exception occured
                System.out.println("NumberFormatException occured");
            }
            totalValue = (int) (totalValue + stock.getValueOfShare());
        }
        System.out.println("Total value of stocks : " + totalValue);
        System.out.println("*--------------------------------------*");

    }
}
