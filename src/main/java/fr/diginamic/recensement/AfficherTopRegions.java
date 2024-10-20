package fr.diginamic.recensement;

import java.util.*;
import java.util.stream.Collectors;

public class AfficherTopRegions extends MenuService {

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        Map<String, Integer> populations = new HashMap<>();

        // Calculer la population par région
        for (Ville ville : recensement.getVilles()) {
            populations.merge(ville.getNomRegion(), ville.getPopulationTotale(), Integer::sum);
        }

        // Trier par population
        List<Map.Entry<String, Integer>> topRegions = populations.entrySet()
                .stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(10)
                .collect(Collectors.toList());

        System.out.println("Les 10 régions les plus peuplées :");
        for (Map.Entry<String, Integer> entry : topRegions) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
