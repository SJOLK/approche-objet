package fr.diginamic.recensement;

import java.util.*;
import java.util.stream.Collectors;

public class AfficherTopVillesRegion extends MenuService {

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.println("Veuillez entrer le nom de la région dont vous voulez afficher les villes :");
        String nomRegion = scanner.nextLine();

        List<Ville> villesRegion = recensement.getVilles().stream()
                .filter(ville -> ville.getNomRegion().equalsIgnoreCase(nomRegion))
                .sorted(Comparator.comparingInt(Ville::getPopulationTotale).reversed())
                .limit(10)
                .collect(Collectors.toList());

        System.out.println("Les 10 villes les plus peuplées de la région " + nomRegion + " :");
        for (Ville ville : villesRegion) {
            System.out.println(ville.getNomCommune() + " : " + ville.getPopulationTotale());
        }
    }
}
