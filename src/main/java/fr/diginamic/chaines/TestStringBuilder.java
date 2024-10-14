package fr.diginamic.chaines;

public class TestStringBuilder {
    public static void main(String[] args) {
        long debut = System.currentTimeMillis();

        // Utilisation de StringBuilder pour ajouter des nombres
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 100000; i++) {
            sb.append(i);
        }

        long fin = System.currentTimeMillis();
        System.out.println("Temps écoulé avec StringBuilder en millisecondes : " + (fin - debut));

        debut = System.currentTimeMillis();

        // Utilisation de String avec concaténation (+) pour ajouter des nombres
        String str = "";
        for (int i = 1; i <= 100000; i++) {
            str += i;
        }

        fin = System.currentTimeMillis();
        System.out.println("Temps écoulé avec String et + en millisecondes : " + (fin - debut));
    }
}

