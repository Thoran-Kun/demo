package com.example.demo.entities;

import java.util.ArrayList;
import java.util.List;

public class Pizza extends Menu {

    private List<Topping> toppings = new ArrayList<>();

    public Pizza(String name, double price, int calories) {
        super(name, price, calories);
    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
        double nuovoPrezzo = this.getPrice() + topping.getPrice();
        int nuoveCalorie = this.getCalories() + topping.getCalories();

        this.setPrice(nuovoPrezzo);
        this.setCalories(nuoveCalorie);
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Pizza: " + getName() + " {" +
                "toppings=" + toppings +
                ", prezzo=" + getPrice() +
                ", calorie=" + getCalories() +
                '}';
    }
}
