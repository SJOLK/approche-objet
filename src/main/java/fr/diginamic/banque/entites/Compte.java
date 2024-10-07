package fr.diginamic.banque.entites;

public class Compte {

    // Attributs d'instance
    private String numero; // Le numéro de compte
    private double solde;  // Le solde du compte

    // Constructeur
    public Compte(String numero, double solde) {
        this.numero = numero;
        this.solde = solde;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    @Override
    public String toString() {
        return "Compte{numero='" + numero + '\'' + ", solde=" + solde + '}';
    }
}

