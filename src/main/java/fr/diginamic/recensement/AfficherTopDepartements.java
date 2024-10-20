package fr.diginamic.recensement;

import java.util.*;
import java.util.stream.Collectors;

public class AfficherTopDepartements extends MenuService {

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        Map<String, Integer> populations = new HashMap<>();

        // Calculer la population par département
        for (Ville ville : recensement.getVilles()) {
            populations.merge(ville.getCodeDepartement(), ville.getPopulationTotale(), Integer::sum);
        }

        // Trier par population
        List<Map.Entry<String, Integer>> topDepartements = populations.entrySet()
                .stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(10)
                .collect(Collectors.toList());

        System.out.println("Les 10 départements les plus peuplés :");
        for (Map.Entry<String, Integer> entry : topDepartements) {
            System.out.println("Département " + entry.getKey() + " : " + entry.getValue());
        }
    }
}
