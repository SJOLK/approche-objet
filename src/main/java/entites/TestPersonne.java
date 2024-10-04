package entites;

import entites2.Personne;

public class TestPersonne {

    public static void main(String[] args) {
        AdressePostale adr1 = new AdressePostale();
        adr1.numeroRue = 123;
        adr1.libelleRue = "Route de ganges";
        adr1.codePostale = 34090;
        adr1.ville = "Montpellier";

        Personne perso1 = new Personne();
        perso1.nom = "RHANBOURI";
        perso1.prenom = "Omar";
        perso1.adressePostale = adr1;

        Personne perso2 = new Personne();
        perso2.nom = "RANDO";
        perso2.prenom = "Omar";
        perso2.adressePostale = adr1;
    }
}
