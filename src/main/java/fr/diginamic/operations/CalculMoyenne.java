package fr.diginamic.operations;

import java.util.Arrays;

public class CalculMoyenne {
    private double[] elements;

    public CalculMoyenne() {
        elements = new double[0];
    }
    public void ajout(double valeur) {
        elements = Arrays.copyOf(elements, elements.length + 1);
        elements[elements.length - 1] = valeur;
    }
    public double calcul() {
        if (elements.length == 0) {
            return 0;
        }
        double somme = 0;
        for (double element : elements) {
            somme += element;
        }
        return somme / elements.length;
    }
}
