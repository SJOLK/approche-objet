package sets;

import java.util.HashSet;

public class TestPays {
    public static void main(String[] args) {
        HashSet<Pays> paysSet = new HashSet<>();

        paysSet.add(new Pays("USA", 331002651, 69400));
        paysSet.add(new Pays("France", 65273511, 40200));
        paysSet.add(new Pays("Allemagne", 83783942, 46200));
        paysSet.add(new Pays("UK", 67886011, 42600));
        paysSet.add(new Pays("Italie", 60244639, 34000));
        paysSet.add(new Pays("Japon", 126476461, 40700));
        paysSet.add(new Pays("Chine", 1439323776, 10500));
        paysSet.add(new Pays("Russie", 145912025, 10700));
        paysSet.add(new Pays("Inde", 1380004385, 2100));

        System.out.println("Liste des pays initial :");
        for (Pays pays : paysSet) {
            System.out.println(pays);
        }

        // Recherchez le pays avec le PIB/habitant le plus important
        Pays paysMaxPibHabitant = null;
        for (Pays pays : paysSet) {
            if (paysMaxPibHabitant == null || pays.getPibParHabitant() > paysMaxPibHabitant.getPibParHabitant()) {
                paysMaxPibHabitant = pays;
            }
        }
        System.out.println("\nLe pays avec le PIB/habitant le plus élevé est : " + paysMaxPibHabitant);

        // Recherchez le pays avec le PIB total le plus important
        Pays paysMaxPibTotal = null;
        for (Pays pays : paysSet) {
            if (paysMaxPibTotal == null || pays.getPibTotal() > paysMaxPibTotal.getPibTotal()) {
                paysMaxPibTotal = pays;
            }
        }
        System.out.println("\nLe pays avec le PIB total le plus élevé est : " + paysMaxPibTotal);

        // Modifiez le contenu du HashSet pour mettre en majuscule le pays qui a le PIB total le plus petit
        Pays paysMinPibTotal = null;
        for (Pays pays : paysSet) {
            if (paysMinPibTotal == null || pays.getPibTotal() < paysMinPibTotal.getPibTotal()) {
                paysMinPibTotal = pays;
            }
        }

        if (paysMinPibTotal != null) {
            String nomMajuscule = paysMinPibTotal.getNom().toUpperCase();
            paysSet.remove(paysMinPibTotal);
            paysSet.add(new Pays(nomMajuscule, paysMinPibTotal.getNbHabitants(), paysMinPibTotal.getPibParHabitant()));
        }

        // Supprimez le pays dont le PIB total est le plus petit
        paysSet.remove(paysMinPibTotal);

        // Affichez l’ensemble des pays ainsi modifiés avec leur nom, nombre d’habitants et PIB total
        System.out.println("\nListe des pays après modifications :");
        for (Pays pays : paysSet) {
            System.out.println(pays);
        }
    }
}

