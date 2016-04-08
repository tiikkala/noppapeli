package noppapeli;

import java.util.Scanner;

public class Tekstikayttoliittyma {

    private final Scanner lukija;
    private final Sovelluslogiikka peli;

    public Tekstikayttoliittyma() {
        this.lukija = new Scanner(System.in);
        this.peli = new Sovelluslogiikka();
    }

    public void aloita() {
        while (true) {
            System.out.println("Arvaa kahden nopan yhteenlaskettu silmäluku tai lopeta peli syöttämällä 0: ");
            int arvaus = Integer.parseInt(lukija.nextLine());
            try {
                if (arvaus == 0) {
                    break;
                }
                if (arvaus < 2 || arvaus > 12) {
                    System.out.println(virheellinenSyote());
                    continue;
                }
                peli.setArvaus(arvaus);
            } catch (NumberFormatException e) {
                System.out.println(virheellinenSyote());
                continue;
            }
            peli.heitaNoppaaKahdesti();
            System.out.println("Tulos oli " + peli.getSilmaluku());
            if (peli.arvausOsui()) {
                System.out.println("Arvasit oikein!");
            } else {
                System.out.println("Arvasit väärin!");
            }
        }
    }

    private String virheellinenSyote() {
        return "Anna luku välillä 2-12!";
    }
}
