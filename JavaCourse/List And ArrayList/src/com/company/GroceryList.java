package com.company;

import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceries = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceries.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceries.size() + " item in your grocery list");

        for (int i = 0; i < groceries.size(); i++) {
            System.out.println((i + 1) + ". " + groceries.get(i));
        }
    }
    public void modifyGroceryItem(int position, String newItem) {
        groceries.set(position, newItem);
    }

    public void removeGroceryItem(int position){
        String theItem = groceries.get(position);
        groceries.remove(position);
        System.out.println(theItem + " has been removed");
    }

    public String findItem(String itemName) {
        int position = groceries.indexOf(itemName);
        if (position >= 0) {
            return groceries.get(position);
        }
        return null;
    }
}
