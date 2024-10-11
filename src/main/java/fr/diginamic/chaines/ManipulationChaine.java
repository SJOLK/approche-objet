package fr.diginamic.chaines;

import fr.diginamic.entites.Salarie;
public class ManipulationChaine {

    public static void main(String[] args) {
        String chaine = "Durand;Marcel;2 523.5";

        // 1) Utiliser la méthode charAt(int index) pour afficher le premier caractère de la chaine de caractères.
        char premierCaractere = chaine.charAt(0);
        System.out.println("Premier caractère: " + premierCaractere);

        // 2) Utiliser la méthode length() pour afficher la longueur de la chaine de caractères
        int longueur = chaine.length();
        System.out.println("Longueur de la chaine: " + longueur);

        // 3) Utiliser la méthode indexOf(char c) pour afficher l’index du premier « ; » contenu dans la chaine de caractères.
        int indexPremierPointVirgule = chaine.indexOf(';');
        System.out.println("Index du premier point-virgule: " + indexPremierPointVirgule);

        // La méthode substring(int start, int end) permet d’extraire une portion de chaine de caractères comprise entre un index de début (inclus) et un index de fin (exclu).
        //Combinez la méthode substring et indexOf pour extraire le nom de famille de la personne.
        String nomFamille = chaine.substring(0, indexPremierPointVirgule);
        System.out.println("Nom de famille: " + nomFamille);

        // 5) Utiliser la méthode toUpperCase() pour afficher le nom de famille en majuscules
        String nomFamilleMajuscule = nomFamille.toUpperCase();
        System.out.println("Nom de famille en majuscules: " + nomFamilleMajuscule);

        // 6) Utiliser la méthode toLowerCase() pour afficher le nom de famille en minuscules
        String nomFamilleMinuscule = nomFamille.toLowerCase();
        System.out.println("Nom de famille en minuscules: " + nomFamilleMinuscule);

        // 7) Utilisez la méthode split pour découper la chaine de caractères en morceaux. La
        //méthode Le séparateur est le caractère « ; ». Cette méthode retourne un tableau.
        //Affichez le tableau ainsi obtenu.
        String[] morceaux = chaine.split(";");
        System.out.println("Découpage de la chaîne :");
        for (String morceau : morceaux) {
            System.out.println(morceau);
        }

        //9) A partir des 3 morceaux de chaine de caractères précédents, créez une instance de Salarie :
        // 9a)  Consigne : le nombre « 2 523.5» contient un espace qu’il faut supprimer en utilisant la méthode replace(String, String) de la classe String
        String salaireString = morceaux[2].replace(" ", "");
        double salaire = Double.parseDouble(salaireString);

        // 9b) Astuce : pour transformer une chaine de caractères en double, utilisez la méthode static de la classe Double : Double.parseDouble(String)
        Salarie salarie = new Salarie(morceaux[0], morceaux[1], salaire);

        // Afficher les informations du salarié
        salarie.afficher();
    }
}

