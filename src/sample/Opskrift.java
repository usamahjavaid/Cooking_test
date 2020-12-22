package sample;

import java.util.ArrayList;



public class Opskrift {
    String navn;
    String navn2;
    String fremgangsmåde;
    int antalPortioner;
    int tilberedningstid;
    ArrayList<Ingrediens> ingredienser = new ArrayList<>();

    public Opskrift() {
        navn = "Opskrift er oprettet: Glasur";
        navn2 = "Opskrift er oprettet: Te";


    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getFremgangsmåde() {
        return fremgangsmåde;
    }

    public void setFremgangsmåde(String fremgangsmåde) {
        this.fremgangsmåde = fremgangsmåde;
    }

    public int getAntalPortioner() {
        return antalPortioner;
    }

    public void setAntalPortioner(int antalPortioner) {
        this.antalPortioner = antalPortioner;
    }

    public int getTilberedningstid() {
        return tilberedningstid;
    }

    public void setTilberedningstid(int tilberedningstid) {
        this.tilberedningstid = tilberedningstid;
    }

    public ArrayList<Ingrediens> getIngredienser() {
        return ingredienser;
    }

    public void setIngredienser(ArrayList<Ingrediens> ingredienser) {
        this.ingredienser = ingredienser;
    }
}
