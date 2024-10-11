package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Théâtre de Comedie", 100);

        theatre.inscrire(50, 20);
        theatre.inscrire(30, 15);
        // Là il faut avoir une erreur
        theatre.inscrire(25, 25);

        System.out.println("Total de clients inscrits : " + theatre.getTotalClientsInscrits());
        System.out.println("Recette totale du théâtre : " + theatre.getRecetteTotale() + "€");
    }
}
