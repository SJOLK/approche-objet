package maps;

import java.util.HashMap;

public class FusionMap {
    public static void main(String[] args) {
        // Création map1
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Rouge");
        map1.put(2, "Vert");
        map1.put(3, "Orange");

        // Création map2
        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(4, "Blanc");
        map2.put(5, "Bleu");
        map2.put(6, "Orange");


        //Créer une map3 qui contient l'ensemble des données de map1 et map2
        HashMap<Integer, String> map3 = new HashMap<>();

        map3.putAll(map1);
        map3.putAll(map2);

        System.out.println("Contenu de map3 après fusion :");
        for (Integer key : map3.keySet()) {
            System.out.println("Clé : " + key + ", Valeur : " + map3.get(key));
        }
    }
}

