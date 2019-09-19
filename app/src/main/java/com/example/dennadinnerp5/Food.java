package com.example.dennadinnerp5;

public class Food {
    private String foodName;
    private String description;
    private double price;
    private int imageResourceID;

    public Food(String foodName, String description,
                double price, int imageResourceID) {
        this.foodName = foodName;
        this.description = description;
        this.price = price;
        this.imageResourceID = imageResourceID;
    }

}
