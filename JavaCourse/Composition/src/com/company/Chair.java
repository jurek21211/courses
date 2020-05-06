package com.company;

public class Chair {
    private int size;
    private boolean hasTheBack;

    public Chair(int size, boolean hasTheBack) {
        this.size = size;
        this.hasTheBack = hasTheBack;
    }

    public int getSize() {
        return size;
    }

    public boolean hasTheBack() {
        return hasTheBack;
    }
}
