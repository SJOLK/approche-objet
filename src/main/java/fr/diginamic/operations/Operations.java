package fr.diginamic.operations;

public class Operations {
    public static double calcul(double a, double b, char operateur) {
        switch (operateur) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b != 0) {
                    return a / b;
                } else {
                    throw new IllegalArgumentException("Division par zéro non autorisée.");
                }
            default:
                throw new IllegalArgumentException("Opérateur non reconnu : " + operateur);
        }
    }
}
