package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

import java.util.Scanner;

public class TestOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le premier nombre: ");
        double a = scanner.nextDouble();
        System.out.print("Entrez le deuxième nombre: ");
        double b = scanner.nextDouble();
        System.out.print("Entrez l'opérateur (+, -, *, /): ");
        char operateur = scanner.next().charAt(0);
        try {
            double resultat = Operations.calcul(a, b, operateur);
            System.out.println("Résultat de l'opération: " + a + " " + operateur + " " + b + " = " + resultat);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}
