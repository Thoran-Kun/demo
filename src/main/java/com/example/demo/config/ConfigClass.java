package com.example.demo.config;

import com.example.demo.entities.Drink;
import com.example.demo.entities.Pizza;
import com.example.demo.entities.PizzeriaMenu;
import com.example.demo.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ConfigClass {

    //-----TOPPINGS
    @Bean
    public Topping Ham() {
        return new Topping("Ham", 0.99, 35);
    }

    @Bean
    public Topping Pineapple() {
        return new Topping("Pineapple", 0.79, 24);
    }

    @Bean
    public Topping Cheese() {
        return new Topping("Cheese", 0.69, 92);
    }

    @Bean
    public Topping Onion() {
        return new Topping("Onion", 0.69, 22);
    }

    @Bean
    public Topping Salami() {
        return new Topping("Salami", 0.99, 86);
    }

    @Bean
    public Topping Tomatoe() {
        return new Topping("Tomatoe", 0.40, 40);
    }

    //---------------- DRINK ----------------
    @Bean
    public Drink Lemonade() {
        return new Drink("Lemonade(0.33L)", 1.29, 128);
    }

    @Bean
    public Drink Water() {
        return new Drink("Water(0.5L)", 1.29, 0);
    }

    @Bean
    public Drink Wine() {
        return new Drink("Wine(0.75, 13%)", 7.49, 607);
    }

    //---------------- PIZZE -------------
    @Bean
    public Pizza Margherita() {
        Pizza p = new Pizza("Margherita", 4.99, 1104);
        p.addTopping(Cheese());
        p.addTopping(Tomatoe());
        return p;
    }

    @Bean
    public Pizza Hawaiian() {
        Pizza p = new Pizza("Hawaiian", 6.49, 1024);
        p.addTopping(Tomatoe());
        p.addTopping(Cheese());
        p.addTopping(Ham());
        p.addTopping(Pineapple());
        return p;
    }

    @Bean
    public Pizza SalamiPizza() {
        Pizza p = new Pizza("Salami", 5.99, 1160);
        p.addTopping(Tomatoe());
        p.addTopping(Cheese());
        p.addTopping(Salami());
        return p;
    }

    @Bean
    public PizzeriaMenu pizzeriaMenu() {
        List<Pizza> pizze = List.of(Margherita(), Hawaiian(), SalamiPizza());
        List<Topping> toppings = List.of(Cheese(), Ham(), Onion(), Pineapple(), Salami());
        List<Drink> drinks = List.of(Lemonade(), Water(), Wine());

        return new PizzeriaMenu(pizze, drinks, toppings);
    }
}
