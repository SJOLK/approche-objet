package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Date;

public class TestCalendar {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(2016, 4, 19, 23, 59, 30);
        Date dateMai2016 = cal.getTime();

        SimpleDateFormat formateurJour = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(formateurJour.format(dateMai2016));

        Date dateJour = Calendar.getInstance().getTime();
        SimpleDateFormat formateurJourHeure = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(formateurJourHeure.format(dateJour));

        String pattern = "EEEE dd MMMM yyyy HH:mm:ss";
        SimpleDateFormat formateurJourHeureFR = new SimpleDateFormat(pattern, Locale.FRANCE);
        SimpleDateFormat formateurJourHeureRU = new SimpleDateFormat(pattern, Locale.of("ru", "RU"));
        SimpleDateFormat formateurJourHeureCH = new SimpleDateFormat(pattern, Locale.CHINA);
        SimpleDateFormat formateurJourHeureGE = new SimpleDateFormat(pattern, Locale.GERMANY);

        System.out.println(formateurJourHeureFR.format(dateJour));
        System.out.println(formateurJourHeureRU.format(dateJour));
        System.out.println(formateurJourHeureCH.format(dateJour));
        System.out.println(formateurJourHeureGE.format(dateJour));
    }
}

