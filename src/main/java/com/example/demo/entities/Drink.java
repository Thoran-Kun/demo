package com.example.demo.entities;

public class Drink extends Menu {

    public Drink(String name, double price, int calories) {
        super(name, price, calories);
    }

    @Override
    public String toString() {
        return "Drink: " + getName() +
                " (" + getCalories() + " kcal) - " + getPrice() + "€";
    }
}
