package tri;

public class Ville implements Comparable<Ville>{
    private String nom;
    private int nbHabitants;

    public Ville(String nom, int nbHabitants) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbHabitants() {
        return nbHabitants;
    }

    public void setNbHabitants(int nbHabitants) {
        this.nbHabitants = nbHabitants;
    }

//    @Override
//    public int compareTo(Ville autreVille) {
//        return this.nom.compareTo(autreVille.getNom());
//    }
    public int compareTo(Ville autreVille) {
        // Comparer le nombre d'habitants des deux villes
        return Integer.compare(this.nbHabitants, autreVille.getNbHabitants());
    }
    @Override
    public String toString() {

        return nom + ", " + nbHabitants + " hab.";
    }
}