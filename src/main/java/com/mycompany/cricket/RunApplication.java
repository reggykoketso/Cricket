package com.mycompany.cricket;

import java.util.Scanner;

public class RunApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("The cricketer name: ");
        String batsman = sc.nextLine();

        System.out.print("Enter the stadium: ");
        String stadium = sc.nextLine();

        System.out.print("Enter the total runs scored by " + batsman + " at " + stadium + ": ");
        int runs = sc.nextInt();

        CricketRunsScored cr = new CricketRunsScored(batsman, stadium, runs);
        cr.printReport();

        sc.close();
    }
}