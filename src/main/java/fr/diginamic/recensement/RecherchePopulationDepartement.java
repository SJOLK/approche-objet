package fr.diginamic.recensement;

import java.util.Scanner;

public class RecherchePopulationDepartement extends MenuService {

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.println("Veuillez entrer le code du département dont vous voulez connaître la population :");
        String codeDepartement = scanner.nextLine();

        int populationTotale = 0;

        // Parcourir toutes les villes pour calculer la population du département
        for (Ville ville : recensement.getVilles()) {
            if (ville.getCodeDepartement().equals(codeDepartement)) {
                populationTotale += ville.getPopulationTotale();
            }
        }

        if (populationTotale == 0) {
            System.out.println("Aucun département trouvé avec le code : " + codeDepartement);
        } else {
            System.out.println("Population du département " + codeDepartement + " : " + populationTotale);
        }
    }
}
