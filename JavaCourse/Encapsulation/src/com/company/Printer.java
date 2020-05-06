package com.company;

public class Printer {
    private int tonerLevel = 100, numberOfPrintedPages;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, boolean duplexPrinter) {
        if((tonerLevel >= 0) && (tonerLevel <= 100))
            this.tonerLevel = tonerLevel;
        this.duplexPrinter = duplexPrinter;
        this.numberOfPrintedPages = 0;
    }

    public void print(int numberOfPages){
        for (int i = 0; i < numberOfPages; i++){
            tonerLevel -= 1;
            numberOfPrintedPages += 1;
        }
    }

    public void fillUpToner(int amount){
        if ((tonerLevel + amount) > 100)
            tonerLevel = 100;
        else
            tonerLevel += amount;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPrintedPages() {
        return numberOfPrintedPages;
    }

    public boolean isDuplexPrinter() {
        return duplexPrinter;
    }
}
