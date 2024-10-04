package entites;

import entites2.Personne;

public class TestPersonne {

    public static void main(String[] args) {
        AdressePostale adr1 = new AdressePostale(512, "Route de Ganges", 34090, "Montpellier");
        Personne perso1 = new Personne("Rhanbouri", "Omar", adr1);
        Personne perso2 = new Personne("Rando","Omar", adr1);

//
//        AdressePostale adr1 = new AdressePostale(512, "Route de Ganges", 34090, "Montpellier");
//        Personne perso1 = new Personne("Rhanbouri", "Omar");
//        perso1.adressePostale = adr1;
//
//        Personne perso2 = new Personne();
//        perso2.nom = "RANDO";
//        perso2.prenom = "Omar";
//        perso2.adressePostale = adr1;
    }
}
