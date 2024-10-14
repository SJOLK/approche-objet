package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDates {

    public static void main(String[] args) {
        // Créez une instance de la classe java.util.Date à la date du jour en utilisant un de ses constructeurs
        Date dateDuJour = new Date();
        SimpleDateFormat sdfJourMoisAnnee = new SimpleDateFormat("dd/MM/yyyy");
        // Affichez l’instance ainsi créée au format suivant :  jour/mois/année (sans la partie heure)
        System.out.println("Date du jour (jour/mois/année) : " + sdfJourMoisAnnee.format(dateDuJour));

        // Créez une instance de la classe Date à la date du 19/05/2016 à 23 :59 :30 secondes
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2016);
        calendar.set(Calendar.MONTH, Calendar.MAY); // Les mois commencent à 0, donc MAY est le mois 4
        calendar.set(Calendar.DAY_OF_MONTH, 19);
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 30);
        Date dateSpecific = calendar.getTime();

        SimpleDateFormat sdfAnneeMoisJourHeure = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        // Affichez l’instance ainsi créée au format suivant : année/mois/jour heure:minute:seconde
        System.out.println("Date spécifique (année/mois/jour heure:minute:seconde) : " + sdfAnneeMoisJourHeure.format(dateSpecific));

        // Créez une instance de Date contenant la date/heure système et affichez-la au même format que ci-dessus.
        Date dateSysteme = new Date();
        System.out.println("Date système actuelle (année/mois/jour heure:minute:seconde) : " + sdfAnneeMoisJourHeure.format(dateSysteme));
    }
}

