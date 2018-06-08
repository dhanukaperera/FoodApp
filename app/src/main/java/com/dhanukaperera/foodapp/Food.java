package com.dhanukaperera.foodapp;

/**
 * Created by dhanukaperera on 6/8/18.
 */

public class Food {

    private String name;
    private String description;
    private int imageID;

    public static final Food[] foods ={
            new Food("Pizza","Cheese Pizza with spicy vegetables",R.drawable.pizza),
            new Food("Burger","Double sized Veg Buger",R.drawable.burger),
            new Food("Sandwich","Cheese and Onion cream ",R.drawable.sandwich)
    };

    public Food(String name, String description,Integer imageID) {
        this.name = name;
        this.description = description;
        this.imageID = imageID;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

   public String toString(){
        return this.name;
   }

    public int getImageID() {
        return imageID;
    }
}
