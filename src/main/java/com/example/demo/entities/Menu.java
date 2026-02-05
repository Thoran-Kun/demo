package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;


@Getter
@Setter
@AllArgsConstructor
@ToString
@Component
public abstract class Menu {
    private String name;
    private double price;
    private int calories;

}
