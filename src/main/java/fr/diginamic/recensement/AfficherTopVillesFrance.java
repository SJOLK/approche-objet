package fr.diginamic.recensement;

import java.util.*;
import java.util.stream.Collectors;

public class AfficherTopVillesFrance extends MenuService {

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        List<Ville> topVilles = recensement.getVilles().stream()
                .sorted(Comparator.comparingInt(Ville::getPopulationTotale).reversed())
                .limit(10)
                .collect(Collectors.toList());

        System.out.println("Les 10 villes les plus peuplées de France :");
        for (Ville ville : topVilles) {
            System.out.println(ville.getNomCommune() + " : " + ville.getPopulationTotale());
        }
    }
}
