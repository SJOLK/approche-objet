package entites;

import entites2.Personne;

public class TestPersonne {

    public static void main(String[] args) {
        AdressePostale adr1 = new AdressePostale(512, "Route de Ganges", 34090, "Montpellier");
        Personne perso1 = new Personne("Rhanbouri", "Omar", adr1);
        Personne perso2 = new Personne("Rando","Omar", adr1);

        perso1.afficherNomPrenom();
        System.out.println("Adresse initiale de perso1 : " + perso1.getAdressePostale());
        AdressePostale adr2 = new AdressePostale(23, "Albert I", 75008, "Paris");

        perso1.setNom("TRIO");
        perso1.setPrenom("Issam");
        System.out.println("Nouveau nom et prenom :");
        perso1.afficherNomPrenom();
        perso1.setAdressePostale(adr2);
        System.out.println("Nouvelle adresse de perso1 : " + perso1.getAdressePostale());
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
