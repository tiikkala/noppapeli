package noppapeli;

import java.util.Random;

public class Sovelluslogiikka {
    
    private int arvaus;
    private int silmaluku;
    Random arpoja;
    
    public Sovelluslogiikka() {
        arpoja = new Random();
    }
    
    public void setArvaus(int arvaus) {
        this.arvaus = arvaus;
    }
    
    public int getSilmaluku() {
        return this.silmaluku;
    }
    
    public void setSilamluku(int silmaluku) {
        this.silmaluku = silmaluku;
    }
    
    public void heitaNoppaaKahdesti() {
        // alustetaan silmäluvuksi kaksi
        int tulos = 2;
        // metodit arpovat kaksi lukua välillä 0-5
        tulos += arpoja.nextInt(6);
        tulos += arpoja.nextInt(6);
        this.setSilamluku(tulos);
    }
    
    public boolean arvausOsui() {
        return this.silmaluku == this.arvaus;
    }
}
