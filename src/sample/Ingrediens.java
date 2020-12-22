package sample;

public class Ingrediens {
    //Datafields
    String navn;
    String flormelis;
    String vand;
    String tebrev;
    String vand2;
    String citron;
    int kalorier;


    //Constructor
    public Ingrediens() {
        flormelis = "Ingrediens er oprettet: Flormelis";
        vand = "Ingrediens er oprettet: Vand\n";
        tebrev = "Ingrediens er oprettet: Tebrev";
        vand2 = "Ingrediens er oprettet: Vand";
        citron = "Ingrediens er oprettet Citron\n";


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

    public String rigPaaKalorier() {

        if (kalorier > 100) {

            System.out.println("Sukker er rig på kalorier");

        }else System.out.println("Citron er ikke rig på kalorier");


        return null;
    }
}
