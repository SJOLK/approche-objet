package fr.diginamic.banque.entites;

public class Debit extends Operation {

    public Debit(String date, double montant) {
        super(date, montant);
    }

    @Override
    public String toString() {
        return "Debit{" + super.toString() + '}';
    }
    @Override
    public String getType() {
        return "DEBIT";
    }
}

