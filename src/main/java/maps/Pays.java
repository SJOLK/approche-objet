package maps;

public class Pays {
    private String nom;
    private long nombreHabitants;
    private String continent;

    // Constructeur
    public Pays(String nom, long nombreHabitants, String continent) {
        this.nom = nom;
        this.nombreHabitants = nombreHabitants;
        this.continent = continent;
    }

    // Getters et setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public long getNombreHabitants() {
        return nombreHabitants;
    }

    public void setNombreHabitants(long nombreHabitants) {
        this.nombreHabitants = nombreHabitants;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }
}
