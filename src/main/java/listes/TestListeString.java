package listes;

import java.util.ArrayList;
import java.util.List;

public class TestListeString {

    public static void main(String[] args) {
        List<String> villes = new ArrayList<>();
        villes.add("Nice");
        villes.add("Carcassonne");
        villes.add("Narbonne");
        villes.add("Lyon");
        villes.add("Foix");
        villes.add("Pau");
        villes.add("Marseille");
        villes.add("Tarbes");

        System.out.println("Liste initiale : " + villes);

        String villePlusLongue = "";
        for (String ville : villes) {
            if (ville.length() > villePlusLongue.length()) {
                villePlusLongue = ville;
            }
        }
        System.out.println("La ville avec le plus grand nombre de lettres est : " + villePlusLongue);

        for (int i = 0; i < villes.size(); i++) {
            villes.set(i, villes.get(i).toUpperCase());
        }
        System.out.println("Liste après mise en majuscules : " + villes);

        villes.removeIf(ville -> ville.startsWith("N"));
        System.out.println("Liste après suppression des villes commençant par 'N' : " + villes);
    }
}

