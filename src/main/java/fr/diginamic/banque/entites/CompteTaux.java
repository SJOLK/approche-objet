package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {

    private double tauxDeRemuneration;
    public double getTauxDeRemuneration() {
        return tauxDeRemuneration;
    }
    public void setTauxDeRemuneration(double tauxDeRemuneration) {
        this.tauxDeRemuneration = tauxDeRemuneration;
    }
    public CompteTaux(String numero, double solde, double tauxDeRemuneration) {
        super(numero, solde);
        this.tauxDeRemuneration = tauxDeRemuneration;
    }

    @Override
    public String toString() {
        return super.toString() + ", tauxDeRemuneration=" + tauxDeRemuneration + "%";
    }
}
