package entites;

public class AdressePostale {
    int numeroRue;
    String libelleRue;
    int codePostale;
    String ville;

    AdressePostale(int numeroRue, String libelleRue,int codePostale,String ville){
        this.numeroRue = numeroRue;
        this.libelleRue = libelleRue;
        this.codePostale = codePostale;
        this.ville = ville;
    }

}
