package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LectureFichier {
    public static void main(String[] args) throws IOException {
        Path pathFile = Paths.get("D:/diginamic-classes/recensement.csv");
        Path outputfile = Paths.get("D:/diginamic-classes/villes_plus_de_25000.csv");
        ArrayList<Ville> villes = new ArrayList<>();
        List<String> lines = Files.readAllLines(pathFile, StandardCharsets.UTF_8);
        for (int i = 1; i < lines.size(); i++) {
            String line = lines.get(i);
            String[] tokens = line.split(";");

            String nomVille = tokens[6];
            String codeDepartement = tokens[2];
            String nomRegion = tokens[1];
            int populationTotale = Integer.parseInt(tokens[9].replaceAll(" ", ""));

            Ville ville = new Ville(nomVille, codeDepartement, nomRegion, populationTotale);

            villes.add(ville);
        }

        List<Ville> villesPlusDe25000 = new ArrayList<>();
        for (Ville ville : villes) {
            if (ville.getPopulationTotale() > 25000) {
                villesPlusDe25000.add(ville);
            }
        }
        List<String> lignesDeSortie = new ArrayList<>();
        lignesDeSortie.add("Nom;Code département;Nom de la région;Population totale");

        for (Ville ville : villesPlusDe25000) {
            lignesDeSortie.add(ville.getNom() + ";" + ville.getCodeDepartement() + ";" + ville.getNomRegion() + ";" + ville.getPopulationTotale());
        }

        Files.write(outputfile, lignesDeSortie, StandardCharsets.UTF_8);
        System.out.println("Fichier de sortie généré avec succès : " + outputfile);

        for (int i = 0; i < 10 && i < villes.size(); i++) {
            System.out.println(villes.get(i));
        }
    }
}
