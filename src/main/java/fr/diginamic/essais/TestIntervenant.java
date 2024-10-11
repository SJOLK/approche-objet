package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {
    public static void main(String[] args) {
        Salarie salarie = new Salarie("Dupont", "Jean", 2500.0);
        //System.out.println("Salaire du salarié: " + salarie.getSalaire());
        salarie.afficherDonnees();

        Pigiste pigiste = new Pigiste("Martin", "Sophie", 15, 100.0);
        //System.out.println("Salaire du pigiste: " + pigiste.getSalaire());
        pigiste.afficherDonnees();
    }
}
