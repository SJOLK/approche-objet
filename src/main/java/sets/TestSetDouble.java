package sets;

import java.util.HashSet;

public class TestSetDouble {
    public static void main(String[] args) {
        HashSet<Double> set = new HashSet<>();
        set.add(1.5);
        set.add(8.25);
        set.add(-7.32);
        set.add(13.3);
        set.add(-12.45);
        set.add(48.5);
        set.add(0.01);

        //Affichez tous les éléments de la collection
        System.out.println("Éléments du HashSet : " + set);

        //Recherchez le plus grand élément de la collection
        double maxElement = Double.NEGATIVE_INFINITY;
        for (Double element : set) {
            if (element > maxElement) {
                maxElement = element;
            }
        }
        System.out.println("Le plus grand élément de la collection est : " + maxElement);

        //Supprimez le plus petit élément de la collection
        double minElement = Double.POSITIVE_INFINITY;
        for (Double element : set) {
            if (element < minElement) {
                minElement = element;
            }
        }
        set.remove(minElement);
        System.out.println("Le plus petit élément " + minElement + " a été supprimé.");

        //Affichez enfin le contenu de la collection ainsi modifiée
        System.out.println("Contenu de la collection après modification : " + set);
    }
}

