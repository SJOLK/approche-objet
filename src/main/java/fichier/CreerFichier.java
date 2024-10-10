package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CreerFichier {
    public static void main(String[] args) throws IOException {
        Path pathFile = Paths.get("D:/diginamic-classes/recensement.csv");
        Path pathCible = Paths.get("D:/diginamic-classes/recensement_100lignes.csv");
        List<String> lines = Files.readAllLines(pathFile, StandardCharsets.UTF_8);
        List<String> first100Lines = lines.subList(0, Math.min(100, lines.size()));
        Files.write(pathCible, first100Lines, StandardCharsets.UTF_8);
        System.out.println("Le fichier contenant les 100 premières lignes a été créé.");
    }
}
