package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ApplicationRecensement {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        // Chemin du fichier CSV contenant les données du recensement
        Path pathFile = Paths.get("D:/diginamic-classes/recensement.csv");

        // Lecture des villes à partir du fichier
        ArrayList<Ville> villes = lireFichier(pathFile);

        // Création de l'objet Recensement
        Recensement recensement = new Recensement(villes);

        int choix = 0;
        do {
            System.out.println("Menu : ");
            System.out.println("1. Population d'une ville donnée");
            System.out.println("2. Population d'un département donné");
            System.out.println("3. Population d'une région donnée");
            System.out.println("4. Afficher les 10 régions les plus peuplées");
            System.out.println("5. Afficher les 10 départements les plus peuplés");
            System.out.println("6. Afficher les 10 villes les plus peuplées d'un département");
            System.out.println("7. Afficher les 10 villes les plus peuplées d'une région");
            System.out.println("8. Afficher les 10 villes les plus peuplées de France");
            System.out.println("9. Sortir");
            choix = scanner.nextInt();
            scanner.nextLine();  // Pour capturer la nouvelle ligne

            switch (choix) {
                case 1:
                    MenuService rechercheVille = new RecherchePopulationVille();
                    rechercheVille.traiter(recensement, scanner);
                    break;
                case 2:
                    MenuService rechercheDepartement = new RecherchePopulationDepartement();
                    rechercheDepartement.traiter(recensement, scanner);
                    break;
                case 3:
                    MenuService rechercheRegion = new RecherchePopulationRegion();
                    rechercheRegion.traiter(recensement, scanner);
                    break;
                case 4:
                    MenuService afficherTopRegions = new AfficherTopRegions();
                    afficherTopRegions.traiter(recensement, scanner);
                    break;
                case 5:
                    MenuService afficherTopDepartements = new AfficherTopDepartements();
                    afficherTopDepartements.traiter(recensement, scanner);
                    break;
                case 6:
                    MenuService afficherTopVillesDepartement = new AfficherTopVillesDepartement();
                    afficherTopVillesDepartement.traiter(recensement, scanner);
                    break;
                case 7:
                    MenuService afficherTopVillesRegion = new AfficherTopVillesRegion();
                    afficherTopVillesRegion.traiter(recensement, scanner);
                    break;
                case 8:
                    MenuService afficherTopVillesFrance = new AfficherTopVillesFrance();
                    afficherTopVillesFrance.traiter(recensement, scanner);
                    break;
                case 9:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix non valide.");
            }
        } while (choix != 9);

        scanner.close();
    }

    // Méthode pour lire le fichier CSV et construire la liste des villes
    public static ArrayList<Ville> lireFichier(Path pathFile) throws IOException {
        ArrayList<Ville> villes = new ArrayList<>();
        List<String> lines = Files.readAllLines(pathFile, StandardCharsets.UTF_8);

        for (int i = 1; i < lines.size(); i++) {  // Commence à 1 pour ignorer l'en-tête
            String line = lines.get(i);
            String[] tokens = line.split(";");

            // On extrait les données pertinentes
            String codeRegion = tokens[0];  // Code de la région
            String nomRegion = tokens[1];  // Nom de la région
            String codeDepartement = tokens[2];  // Code du département
            String codeCommune = tokens[5];  // Code de la commune
            String nomCommune = tokens[6];  // Nom de la commune
            int populationTotale = Integer.parseInt(tokens[9].replaceAll(" ", ""));  // Population totale sans espaces

            // Ajout de la ville à la liste avec toutes les données nécessaires
            Ville ville = new Ville(codeRegion, nomRegion, codeDepartement, codeCommune, nomCommune, populationTotale);
            villes.add(ville);
        }

        System.out.println("Fichier de recensement chargé avec succès.");
        return villes;
    }
}
