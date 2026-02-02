package com.example.demo.entities;

import java.util.List;

public class PizzeriaMenu {
    private List<Pizza> pizzaList;
    private List<Drink> drinkList;
    private List<Topping> toppingList;

    public PizzeriaMenu(List<Pizza> pizzaList, List<Drink> drinkList, List<Topping> toppingList) {
        this.pizzaList = pizzaList;
        this.drinkList = drinkList;
        this.toppingList = toppingList;
    }

    public void stampaMenu() {
        System.out.println("---------- MENU PIZZERIA -----------");
        System.out.println("PIZZE: ");
        pizzaList.forEach(pizza -> System.out.println(pizza));

        System.out.println("\nBEVANDE: ");
        drinkList.forEach(drink -> System.out.println(drink));

        System.out.println("\nTOPPINGS: ");
        toppingList.forEach(topping -> System.out.println(topping));
    }
}
