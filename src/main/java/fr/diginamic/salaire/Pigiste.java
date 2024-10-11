package fr.diginamic.salaire;

public class Pigiste extends Intervenant {
    private int joursTravailles;
    private double remunerationJournaliere;

    public Pigiste(String nom, String prenom, int joursTravailles, double remunerationJournaliere) {
        super(nom, prenom);
        this.joursTravailles = joursTravailles;
        this.remunerationJournaliere = remunerationJournaliere;
    }

    @Override
    public double getSalaire() {
        return joursTravailles * remunerationJournaliere;
    }

    @Override
    protected String getStatut() {
        return "Pigiste";
    }
}

