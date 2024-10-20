package fr.diginamic.recensement;

public class Region {
    private String codeRegion;
    private String nomRegion;
    private int populationTotale;

    public Region(String codeRegion, String nomRegion, int populationTotale) {
        this.codeRegion = codeRegion;
        this.nomRegion = nomRegion;
        this.populationTotale = populationTotale;
    }

    public String getCodeRegion() {
        return codeRegion;
    }

    public String getNomRegion() {
        return nomRegion;
    }

    public int getPopulationTotale() {
        return populationTotale;
    }

    public void ajouterPopulation(int population) {
        this.populationTotale += population;
    }
}
