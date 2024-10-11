package fr.diginamic.maison;

public abstract class Piece {
    protected double superficie;
    protected int etage;

    public Piece(double superficie, int etage) {
        if (superficie > 0 && etage >= 0) {
            this.superficie = superficie;
            this.etage = etage;
        } else {
            throw new IllegalArgumentException("La superficie et l'étage doivent être positifs.");
        }
    }

    public double getSuperficie() {
        return superficie;
    }

    public int getEtage() {
        return etage;
    }

    public abstract String getType();
}
