package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

    public static void main(String[] args) {
        // Test avec 3 éléments et calculer la moyenne
        CalculMoyenne cm1 = new CalculMoyenne();
        cm1.ajout(15);
        cm1.ajout(25);
        cm1.ajout(35);
        System.out.println("Moyenne du premier test : " + cm1.calcul()); // Devrait afficher 20.0

        // Test avec des éléments différents et calculer la moyenne
        CalculMoyenne cm2 = new CalculMoyenne();
        cm2.ajout(5);
        cm2.ajout(15);
        cm2.ajout(25);
        cm2.ajout(35);
        System.out.println("Moyenne du deuxième test : " + cm2.calcul()); // Devrait afficher 20.0

        // Test avec un seul élément
        CalculMoyenne cm3 = new CalculMoyenne();
        cm3.ajout(100);
        System.out.println("Moyenne du troisième test : " + cm3.calcul()); // Devrait afficher 100.0

        // Test avec aucun élément
        CalculMoyenne cm4 = new CalculMoyenne();
        System.out.println("Moyenne du quatrième test : " + cm4.calcul()); // Devrait afficher 0.0
    }
}
