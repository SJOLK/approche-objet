package fr.diginamic.banque.entites;

public class Credit extends Operation {

    public Credit(String date, double montant) {
        super(date, montant);
    }

    @Override
    public String toString() {
        return "Credit{" + super.toString() + '}';
    }
    @Override
    public String getType() {
        return "CREDIT";
    }
}
