package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestListeInt {

    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();
        liste.add(-1);
        liste.add(5);
        liste.add(7);
        liste.add(3);
        liste.add(-2);
        liste.add(4);
        liste.add(8);
        liste.add(5);

        // Affichez tous les éléments de la liste
        System.out.println("Éléments de la liste : " + liste);

        // Affichez la taille de la liste
        System.out.println("Taille de la liste : " + liste.size());

        // Recherchez et affichez le plus grand élément
        Integer maxElement = Collections.max(liste);
        System.out.println("Le plus grand élément de la liste est : " + maxElement);

        // Supprimez le plus petit élément de la liste et affichez le résultat
        Integer minElement = Collections.min(liste);
        liste.remove(minElement);
        System.out.println("Liste après suppression du plus petit élément (" + minElement + ") : " + liste);

        // Recherchez tous les éléments négatifs et modifiez-les de manière à ce qu’ils deviennent positifs.
        for (int i = 0; i < liste.size(); i++) {
            if (liste.get(i) < 0) {
                liste.set(i, Math.abs(liste.get(i)));
            }
        }
        // Affichez enfin la liste résultante
        System.out.println("Liste après conversion des éléments négatifs en positifs : " + liste);
    }
}

