package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

public class TestBanque {

    public static void main(String[] args) {
        // Créez une instance de la classe Compte avec un numéro et un solde
        Compte compte = new Compte("123a56c89", 1500.25);

        // Affichez l’instance créée avec System.out.println(…)
        System.out.println(compte);
    }
}
