package fr.diginamic.recensement;

import java.util.Scanner;

public class RecherchePopulationRegion extends MenuService {

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.println("Veuillez entrer le nom de la région dont vous voulez connaître la population :");
        String nomRegion = scanner.nextLine();

        int populationTotale = 0;

        // Parcourir toutes les villes pour calculer la population de la région
        for (Ville ville : recensement.getVilles()) {
            if (ville.getNomRegion().equalsIgnoreCase(nomRegion)) {
                populationTotale += ville.getPopulationTotale();
            }
        }

        if (populationTotale == 0) {
            System.out.println("Aucune région trouvée avec le nom : " + nomRegion);
        } else {
            System.out.println("Population de la région " + nomRegion + " : " + populationTotale);
        }
    }
}
