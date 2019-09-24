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

    public static final Food[] breakfastFoods = {
            new Food("Eggs", "3 eggs, 1 cheese, 1 meat omelet",
                    8.99, R.drawable.omelet),
            new Food("Pancakes", "3 pancakes, choice of meat, potato",
                    7.95, R.drawable.pancakes),
            new Food("Waffles", "Belgium waffles, whip cream, fresh fruit",
                    7.50, R.drawable.waffles)
    };

    public static final Food[] lunchFoods = {
            new Food ("Soup", "tomatoes, seasoning, basil, choice of bread", 5.95, R.drawable.tomatosoup),
            new Food ("Salad", "lettuce, tomatoes, olives, feta cheese, carrots", 7.85, R.drawable.salad),
            new Food ("Sandwich", "choice of bread, cheese, choice of meat, onions, lettuce", 9.15, R.drawable.sandwich)
    };

    public String toString() {
        return foodName;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getImageResourceID() {
        return imageResourceID;
    }

    public void setImageResourceID(int imageResourceID) {
        this.imageResourceID = imageResourceID;
    }
}
