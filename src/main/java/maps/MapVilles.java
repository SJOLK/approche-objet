package maps;

import java.util.HashMap;
import java.util.Map;

public class MapVilles {
    public static void main(String[] args) {
        HashMap<String, Ville> mapVilles = new HashMap<>();

        mapVilles.put("Nice", new Ville("Nice", 343000));
        mapVilles.put("Carcassonne", new Ville("Carcassonne", 47800));
        mapVilles.put("Narbonne", new Ville("Narbonne", 53400));
        mapVilles.put("Lyon", new Ville("Lyon", 484000));
        mapVilles.put("Foix", new Ville("Foix", 9700));
        mapVilles.put("Pau", new Ville("Pau", 77200));
        mapVilles.put("Marseille", new Ville("Marseille", 850700));
        mapVilles.put("Tarbes", new Ville("Tarbes", 40600));

        // Recherchez et supprimez la ville qui a le moins d’habitants
        String villeMoinsPeuplee = null;
        int minHabitants = Integer.MAX_VALUE;

        for (Map.Entry<String, Ville> entry : mapVilles.entrySet()) {
            Ville ville = entry.getValue();
            if (ville.getNbHabitants() < minHabitants) {
                minHabitants = ville.getNbHabitants();
                villeMoinsPeuplee = entry.getKey();
            }
        }
        if (villeMoinsPeuplee != null) {
            System.out.println("Suppression de la ville : " + villeMoinsPeuplee + " (" + mapVilles.get(villeMoinsPeuplee).getNbHabitants() + " habitants)");
            mapVilles.remove(villeMoinsPeuplee);
        }

        // Affichez l’ensemble des villes restantes.
        System.out.println("\nVilles restantes :");
        for (Ville ville : mapVilles.values()) {
            System.out.println(ville);
        }
    }
}
