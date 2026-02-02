package com.example.demo;

import com.example.demo.entities.PizzeriaMenu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DemoApplication.class);

        //Recupreo coi bean la classe PizzeriaMenu e con essa tutti i suoi metodi all'interno
        PizzeriaMenu menu = ctx.getBean(PizzeriaMenu.class);
        //nella classe esiste il metodo stampa menu
        menu.stampaMenu();
        ctx.close();
    }

}
