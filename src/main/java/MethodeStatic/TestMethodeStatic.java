package MethodeStatic;

public class TestMethodeStatic {

    public static void main(String[] args) {
        // Ddéclarez une variable de type chaine de caractères qui contient un nombre entier.
        String chaine = "12";

        // Utilisez une méthode de la classe java.lang.Integer qui permet de convertir une chaîne de caractères en entier.
        int nombre = Integer.parseInt(chaine);

        // Affichez le nombre converti
        System.out.println("Le nombre converti est : " + nombre);

        // Déclarez maintenant 2 variables de type int a et b
        int a = 15;
        int b = 25;

        // Utilisez une méthode de la classe Integer qui calcule le nombre maximum entre a et b.
        int max = Integer.max(a, b);

        // affichez le résultat de l’appel de cette méthode
        System.out.println("Le maximum entre " + a + " et " + b + " est : " + max);
    }
}

