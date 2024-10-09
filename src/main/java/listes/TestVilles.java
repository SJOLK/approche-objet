package listes;

import java.util.ArrayList;
import java.util.List;

public class TestVilles {

    public static void main(String[] args) {

        List<Ville> villes = new ArrayList<>();
        villes.add(new Ville("Nice", 343000));
        villes.add(new Ville("Carcassonne", 47800));
        villes.add(new Ville("Narbonne", 53400));
        villes.add(new Ville("Lyon", 484000));
        villes.add(new Ville("Foix", 9700));
        villes.add(new Ville("Pau", 77200));
        villes.add(new Ville("Marseille", 850700));
        villes.add(new Ville("Tarbes", 40600));


        System.out.println("\nListe initiale des villes : " + villes);

        //Recherchez et affichez la ville la plus peuplée
        Ville villePlusPeuplee = villes.get(0);
        for (Ville ville : villes) {
            if (ville.getNbHabitants() > villePlusPeuplee.getNbHabitants()) {
                villePlusPeuplee = ville;
            }
        }
        System.out.println("\nLa ville la plus peuplée est : " + villePlusPeuplee);

        //Supprimez la ville la moins peuplée
        Ville villeMoinsPeuplee = villes.get(0);
        for (Ville ville : villes) {
            if (ville.getNbHabitants() < villeMoinsPeuplee.getNbHabitants()) {
                villeMoinsPeuplee = ville;
            }
        }
        villes.remove(villeMoinsPeuplee);
        System.out.println("\nListe après suppression de la ville la moins peuplée (" + villeMoinsPeuplee + ") : " + villes);

        //Modifiez les villes de plus de 100 000 habitants en mettant leur nom en majuscules
        for (int i = 0; i < villes.size(); i++) {
            if (villes.get(i).getNbHabitants() > 100000) {
                String nomMajuscule = villes.get(i).getNom().toUpperCase();
                villes.get(i).setNom(nomMajuscule); // Assurez-vous d'avoir un setter dans la classe Ville
            }
        }

        //Affichez enfin la liste résultante
        System.out.println("\nListe finale des villes : " + villes);
    }
}
