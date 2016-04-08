
import noppapeli.Sovelluslogiikka;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;

/**
 *
 * @author tapio
 */
public class SovelluslogiikkaTesti {

    Sovelluslogiikka peli;

    public SovelluslogiikkaTesti() {
        peli = new Sovelluslogiikka();
    }

    /**
     * Ajamalla heitaNoppaaKahdesti-metodin testit 300 kertaa voidaan varmistua
     * siitä, että metodin antama tulos todella pysyy välillä 2-12 kaikilla
     * metodin arpomilla silmälukuyhdistelmillä.
     */
    @Rule
    public RepeatRule repeatRule = new RepeatRule();

    @Test
    @Repeat(times = 300)
    public void silmalukuOnVahintaanKaksi() {
        peli.heitaNoppaaKahdesti();
        assertTrue(2 <= peli.getSilmaluku());
    }

    @Test
    @Repeat(times = 300)
    public void silmalukuOnEnintaanKaksitoista() {
        peli.heitaNoppaaKahdesti();
        assertTrue(12 >= peli.getSilmaluku());
    }

    @Test
    public void arvausOsuiPalauttaaTrueKunArvausOsuu() {
        peli.setArvaus(5);
        peli.setSilamluku(5);
        assertTrue(peli.arvausOsui());
    }

    @Test
    public void arvausOsuiPalauttaaFalseKunArvausEiOsu() {
        peli.setArvaus(5);
        peli.setSilamluku(6);
        assertFalse(peli.arvausOsui());
    }
}
