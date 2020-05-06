package com.company;

import java.awt.*;

public class Room {
    private Chair theChair;
    private Table theTable;
    private Door theDoor;
    private Floor theFloor;

    public Room(Chair theChair, Table theTable, Door theDoor, Floor theFloor) {
        this.theChair = theChair;
        this.theTable = theTable;
        this.theDoor = theDoor;
        this.theFloor = theFloor;
    }
}
