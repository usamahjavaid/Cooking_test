package sample;

public class Ingrediens {
    String navn;
    String flormelis;
    String vand;
    String tebrev;
    String vand2;
    String citron;
    int kalorier;


    public Ingrediens() {
        flormelis = "Ingrediens er oprettet: Flormelis";
        vand = "Ingrediens er oprettet: Vand\n";
        tebrev = "Ingrediens er oprettet: Tebrev";
        vand2 = "Ingrediens er oprettet: Vand";
        citron = "Ingrediens er oprettet Citron";



    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getKalorier() {
        return kalorier;
    }

    public void setKalorier(int kalorier) {
        this.kalorier = kalorier;
    }
}
