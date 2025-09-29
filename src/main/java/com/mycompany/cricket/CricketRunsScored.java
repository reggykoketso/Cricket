package com.mycompany.cricket;

/**
 * Concrete subclass of Cricket.
 */
public class CricketRunsScored extends ICricket {

    public CricketRunsScored(String batsman, String stadium, int runs) {
        super(batsman, stadium, runs);
    }

    // printReport prints batsman name, stadium and total runs scored
    public void printReport() {
        System.out.println();
        System.out.println("BATSMAN RUNS SCORED REPORT");
        System.out.println("**********");
        System.out.println("CRICKET PLAYER: " + getBatsman());
        System.out.println("STADIUM: " + getStadium());
        System.out.println("TOTAL RUNS SCORED: " + getRunsScored());
    }
}
