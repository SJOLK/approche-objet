package entites2;

import entites.AdressePostale;

public class Personne {
    public String nom;
    public String prenom;
    public AdressePostale adressePostale;

    public Personne(String nom, String prenom){
        this.nom = nom;
        this.prenom = prenom;
    }
    public Personne(String nom, String prenom, AdressePostale adressePostale){
        this.nom = nom;
        this.prenom = prenom;
        this.adressePostale = adressePostale;
    }



    //Dans la classe Personne, ajoutez une méthode void qui permet d’afficher (System.out.println) le nom et le prénom avec le nom de famille en majuscules.
    public void afficherNomPrenom() {
        System.out.println(this.prenom + " " + this.nom.toUpperCase());
    }
    //Dans la classe Personne, ajoutez une méthode void qui prend en paramètre un String et permet de modifier la variable d’instance nom de Personne.
    public void setNom(String nouveauNom) {
        this.nom = nouveauNom;
    }
    //Dans la classe Personne, ajoutez une méthode similaire pour modifier le prénom.
    public void setPrenom(String nouveauPrenomom) {
        this.prenom = nouveauPrenomom;
    }
    //Dans la classe Personne, ajoutez une méthode qui prend en paramètre une AdressePostale et permet de modifier l’adresse.
    public void setAdressePostale(AdressePostale nouvelleAdresse) {
        this.adressePostale = nouvelleAdresse;
    }
    //Dans la classe Personne, ajoutez une méthode qui retourne le nom.
    public String getNom() {
        return this.nom;
    }
    //Dans la classe Personne, ajoutez une méthode qui retourne le prénom.
    public  String getPrenom(){
        return this.prenom;
    }
    //Dans la classe Personne, ajoutez une méthode qui retourne l’adresse.
    public AdressePostale getAdressePostale() {
        return this.adressePostale;
    }
}
