package sets;

import java.util.HashSet;
public class TestSetString {
    public static void main(String[] args) {
        HashSet<String> pays = new HashSet<>();
        pays.add("USA");
        pays.add("France");
        pays.add("Allemagne");
        pays.add("UK");
        pays.add("Italie");
        pays.add("Japon");
        pays.add("Chine");
        pays.add("Russie");
        pays.add("Inde");

        System.out.println("Liste initiale des pays : " + pays);

        //Recherchez le pays dans cette liste qui a le plus grand nombre de lettres
        String paysPlusLong = "";
        for (String paysActuel : pays) {
            if (paysActuel.length() > paysPlusLong.length()) {
                paysPlusLong = paysActuel;
            }
        }
        System.out.println("Le pays avec le plus grand nombre de lettres est : " + paysPlusLong);

        //Supprimez ce pays
        pays.remove(paysPlusLong);
        System.out.println("Le pays " + paysPlusLong + " a été supprimé.");

        //Affichez enfin le contenu de la collection ainsi modifiée
        System.out.println("Contenu de la collection après modification : " + pays);
    }
}
