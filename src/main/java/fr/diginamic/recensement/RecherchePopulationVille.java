package fr.diginamic.recensement;

import java.util.Scanner;

public class RecherchePopulationVille extends MenuService {

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.println("Veuillez entrer le nom de la ville dont vous voulez connaître la population :");
        String nomVilleRecherchee = scanner.nextLine();

        boolean villeTrouvee = false;
        for (Ville ville : recensement.getVilles()) {
            // Utilisation de getNomCommune() pour récupérer le nom de la ville
            if (ville.getNomCommune().equalsIgnoreCase(nomVilleRecherchee)) {
                System.out.println("Population de " + ville.getNomCommune() + " : " + ville.getPopulationTotale());
                villeTrouvee = true;
                break;
            }
        }

        if (!villeTrouvee) {
            System.out.println("La ville " + nomVilleRecherchee + " n'a pas été trouvée dans le recensement.");
        }
    }
}
