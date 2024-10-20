package fr.diginamic.recensement;

import java.util.*;
import java.util.stream.Collectors;

public class AfficherTopVillesDepartement extends MenuService {

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.println("Veuillez entrer le code du département dont vous voulez afficher les villes :");
        String codeDepartement = scanner.nextLine();

        List<Ville> villesDepartement = recensement.getVilles().stream()
                .filter(ville -> ville.getCodeDepartement().equals(codeDepartement))
                .sorted(Comparator.comparingInt(Ville::getPopulationTotale).reversed())
                .limit(10)
                .collect(Collectors.toList());

        System.out.println("Les 10 villes les plus peuplées du département " + codeDepartement + " :");
        for (Ville ville : villesDepartement) {
            System.out.println(ville.getNomCommune() + " : " + ville.getPopulationTotale());
        }
    }
}
