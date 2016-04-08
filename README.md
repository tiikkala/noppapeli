# Noppapeli #

Käyttäjä syöttää ohjelmalle luvun välillä 2-12, minkä jälkeen ohjelma "heittää" noppaa kaksi kertaa, laskee noppien silmäluvun yhteen ja ilmoittaa onko silmäluku sama kuin käyttäjän arvaus. Ohjelman voi lopettaa syöttämällä 0.

### Ohjelman rakenne ###

Ohjelma koostuu kolmesta luokasta: laskennan toteuttavasta Sovelluslogiikka-luokasta, Tekstikäyttöliittymä-luokasta sekä Noppapeli-pääluokasta, joka kutsuu käyttöliittymäluokkaa.

### Testit ###

Sovelluslogiikka-luokan parille metodille on kirjoitettu yksittötestit JUnit-kirjaston avulla. Testipaketissa sijaitsee myös RepeatRule ja Repat-luokat, joiden avulla on mahdollista ajaa samaa testia monta kertaa. Tämä on hyödyllistä esimerkiksi tapauksissa, joissa metodi sisältää satunnaislukujen luomista, jolloin ajamalla testin monta kertaa voi varmistua siitä, että metodi toimii oikein kaikilla määrätyn joukon luvuilla (tulipahan opiskeltua, kuinka tällaisen voi tehdä, jos joskus olisi todellinen tarve tällaiseen). 

