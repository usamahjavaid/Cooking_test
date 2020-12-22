package sample;

public class SimpleTest {


    public static void main(String[] args) {



        System.out.println("Velkommen til min opskrifts-applikation-dummy\n" );
        System.out.println("************************");
        System.out.println("* Opretter opskrifter *");
        System.out.println("************************\n");

        Opskrift glasurOpskrift = new Opskrift();
        System.out.println(glasurOpskrift.navn);
        Ingrediens flormelis = new Ingrediens();
        System.out.println(flormelis.flormelis);
        Ingrediens vand = new Ingrediens();
        System.out.println(vand.vand);

        Opskrift teOpskrift = new Opskrift();
        System.out.println(teOpskrift.navn2);
        Ingrediens tebrev = new Ingrediens();
        System.out.println(tebrev.tebrev);
        Ingrediens vand2 = new Ingrediens();
        System.out.println(vand2.vand2);
        Ingrediens citron = new Ingrediens();
        System.out.println(citron.citron);

        System.out.println("************************");
        System.out.println("* Viser opskrifter *");
        System.out.println("************************\n");

        glasurOpskrift.visIngredienser();


    }


    public void blankLine(){

        System.out.println();
        System.out.println();
    }
}
