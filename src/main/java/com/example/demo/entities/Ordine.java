package com.example.demo.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
public class Ordine {
    private int numeroOrdine;
    private int numeroCoperti;
    private LocalDateTime oraAcquisizione;
    private List<Menu> elementiOrdine = new ArrayList<>();
    private Tavolo tavolo;
    private double costoCoperto;
    private StatoOrdine statoOrdine;

    public Ordine(int numeroOrdine, int numeroCoperti, Tavolo tavolo, double costoCoperto, StatoOrdine statoOrdine) {
        this.numeroOrdine = numeroOrdine;
        this.numeroCoperti = numeroCoperti;
        this.tavolo = tavolo;
        this.costoCoperto = costoCoperto;
    }

    public double costoTotale() {
        double prezzoTotale = elementiOrdine.stream()
                .mapToDouble(elemento -> elemento.getPrice()).sum();
        return prezzoTotale + (costoCoperto * numeroCoperti);
    }
}
