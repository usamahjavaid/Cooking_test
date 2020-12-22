package sample;

import java.util.ArrayList;



public class Opskrift {
    //data fields
    String navn;
    String navn2;
    String fremgangsmåde;
    int antalPortioner;
    int tilberedningstid;
    ArrayList<String> ingredienser = new ArrayList<>();

    //Constructor
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

    public ArrayList<String> getIngredienser() {
        return ingredienser;
    }

    public void setIngredienser(ArrayList<String> ingredienser) {
        this.ingredienser = ingredienser;
    }
    //Tilføj ingredienser til arraylisten

    public void addIngrediens(Ingrediens ingrediens) {


    }

    public void addIngrediens(String navn, int kalorier) {

        ingredienser.add("Flormelis");
        ingredienser.add("Vand");
        ingredienser.add("Tebrev");
        ingredienser.add("vand");
        ingredienser.add("Citron");
    }


    public void visIngredienser() {


            System.out.println("Du skal til glasur bruge:\n" + "- Flormelis\n" + "- Vand \n");
            System.out.println("Du skal til te bruge:\n" + "- Te\n" + "- Vand\n" + "- Citron\n" + "- Sukker\n");
            //Gennemløb af en array
            for (int i = 0; i < ingredienser.size(); i++) {

                System.out.println(ingredienser.get(i));

        }


    }

    public void visFremgangsmaade(){

        System.out.println("Opskriften for glasur:\n" + "Du blander formelis og sukker, og smører det på kagen\n");

        System.out.println("Opskriften for for te:\n" + "Put teen i kogende vand\n ");

    }

    public void visOpskrift(){

        visIngredienser();

        visFremgangsmaade();
    }




}
