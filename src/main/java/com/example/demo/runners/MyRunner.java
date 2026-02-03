package com.example.demo.runners;

import com.example.demo.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {

    @Value("${costo.coperto:1.80}")
    private double costoCoperto;

    @Autowired
    private Pizza SalamiPizza;

    @Autowired
    private Drink Wine;

    @Override
    public void run(String... args) throws Exception {

        //usiamo questo runner come fosse il nostro main e qui possiamo procedere alla creazione di elementi come
        //e ordini vari
        Tavolo tavolo1 = new Tavolo(1, 2, StatoTavolo.LIBERO);

        Ordine ordine1 = new Ordine(1, 2, tavolo1, costoCoperto, StatoOrdine.IN_CORSO);

        ordine1.getElementiOrdine().add(SalamiPizza);
        ordine1.getElementiOrdine().add(Wine);

        System.out.println("numero dell'ordine: " + ordine1.getNumeroOrdine());
        System.out.println("numero del tavolo: " + tavolo1.getNumero());
        System.out.println("costo del coperto: " + costoCoperto);
        System.out.println("Totale conto: " + ordine1.costoTotale() + "€");
    }
}
