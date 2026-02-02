package com.example.demo.entities;

public class Topping extends Menu {
    public Topping(String name, double price, int calories) {
        super(name, price, calories);
    }

    @Override
    public String toString() {
        return "Topping: " + getName() +
                "Prezzo: " + getPrice() + "€, Calories: " + getCalories();
    }
}
