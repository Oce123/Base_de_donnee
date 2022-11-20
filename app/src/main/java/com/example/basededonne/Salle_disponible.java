package com.example.basededonne;

public class Salle_disponible {
    int id;
    String numero;
    double heure;

    public Salle_disponible(int id, String numero, double heure) {
        this.id = id;
        this.numero = numero;
        this.heure = heure;
    }

    public Salle_disponible(String numero, double heure) {
        this.numero = numero;
        this.heure = heure;
    }

    public Salle_disponible() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getHeure() {
        return heure;
    }

    public void setHeure(double heure) {
        this.heure = heure;
    }
}
