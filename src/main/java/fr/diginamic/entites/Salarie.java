package fr.diginamic.entites;

public class Salarie {
    private String nom;
    private String prenom;
    private double salaire;

    public Salarie(String nom, String prenom, double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
    }

    public void afficher() {
        System.out.println("Nom: " + nom + ", Prénom: " + prenom + ", Salaire: " + salaire);
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

}
