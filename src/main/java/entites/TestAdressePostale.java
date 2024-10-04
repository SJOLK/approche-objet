package entites;

public class TestAdressePostale {
    public static void main(String[] args) {
        AdressePostale adr1 = new  AdressePostale();
        adr1.numeroRue = 512;
        adr1.libelleRue = "Route de Ganges";
        adr1.codePostale = 34090;
        adr1.ville = "Montpellier";
        AdressePostale adr2 = new  AdressePostale();
        adr2.numeroRue = 13;
        adr2.libelleRue = "Albert I";
        adr2.codePostale = 34095;
        adr2.ville = "Montpellier";
    }
}
