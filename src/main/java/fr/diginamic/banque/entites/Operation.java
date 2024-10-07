package fr.diginamic.banque.entites;

public abstract class Operation {

    private String date;    // Date de l'opération
    private double montant; // Montant de l'opération

    public Operation(String date, double montant) {
        this.date = date;
        this.montant = montant;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }
    public abstract String getType();
    @Override
    public String toString() {
        return "Operation: " + "date='" + date + '\'' + ", montant=" + montant + '€';
    }
}
