package maps;

import java.util.HashMap;

public class CreationEtManipulationMap {
    public static void main(String[] args) {

        HashMap<Integer, String> mapVilles = new HashMap<>();

        mapVilles.put(13, "Marseille");
        mapVilles.put(34, "Montpellier");
        mapVilles.put(44, "Nantes");
        mapVilles.put(75, "Paris");
        mapVilles.put(31, "Toulouse");


        // Ajouter dans mapVilles les informations pour Lille, Lyon et Bordeaux
        mapVilles.put(59, "Lille");
        mapVilles.put(69, "Lyon");
        mapVilles.put(33, "Bordeaux");

        // Mettre en place une boucle pour afficher l'ensemble des clés contenues dans la map
        System.out.println("Liste des clés (numéros de département) :");
        for (Integer key : mapVilles.keySet()) {
            System.out.println(key);
        }

        // Mettre en place une boucle pour afficher l'ensemble des valeurs contenues dans la map
        System.out.println("\nListe des valeurs (noms des préfectures) :");
        for (String value : mapVilles.values()) {
            System.out.println(value);
        }

        // Afficher la taille de la map
        System.out.println("\nTaille de la map : " + mapVilles.size());
    }
}

