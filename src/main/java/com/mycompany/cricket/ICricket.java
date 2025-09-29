package com.mycompany.cricket;


public abstract class ICricket implements Cricket {
    protected String batsman;
    protected String stadium;
    protected int runs;

    // Constructor that accepts batsman's name, stadium name and total runs
    public ICricket(String batsman, String stadium, int runs) {
        this.batsman = batsman;
        this.stadium = stadium;
        this.runs = runs;
    }

    @Override
    public String getBatsman() {
        return batsman;
    }

    @Override
    public String getStadium() {
        return stadium;
    }

    @Override
    public int getRunsScored() {
        return runs;
    }
}