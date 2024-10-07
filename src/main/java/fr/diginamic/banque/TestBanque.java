package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {

    public static void main(String[] args) {
        Compte[] comptes = new Compte[2];
        comptes[0] = new Compte("12C3F6789", 1500.25);
        comptes[1] = new CompteTaux("98CB2L321", 2000.75, 1.5);
        for (int i = 0; i < comptes.length; i++) {
            System.out.println(comptes[i]);
        }
    }
}

