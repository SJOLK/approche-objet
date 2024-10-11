package fr.diginamic.entites;

public class Theatre {

    private String nom;
    private int capaciteMax;
    private int totalClientsInscrits;
    private double recetteTotale;

    public Theatre(String nom, int capaciteMax) {
        this.nom = nom;
        this.capaciteMax = capaciteMax;
        this.totalClientsInscrits = 0; // Initialement 0 clients inscrits
        this.recetteTotale = 0; // Recette initiale est 0
    }


    public void inscrire(int nombreClients, double prixPlace) {
        if (totalClientsInscrits + nombreClients <= capaciteMax) {
            totalClientsInscrits += nombreClients;
            recetteTotale += nombreClients * prixPlace;
            System.out.println(nombreClients + " clients inscrits avec succès.");
        } else {

            System.out.println("Erreur : capacité maximale atteinte. Impossible d'inscrire " + nombreClients + " clients.");
        }
    }

    public int getTotalClientsInscrits() {
        return totalClientsInscrits;
    }

    public double getRecetteTotale() {
        return recetteTotale;
    }
}
