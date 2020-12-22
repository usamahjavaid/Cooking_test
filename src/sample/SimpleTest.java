package sample;

public class SimpleTest {


    public static void main(String[] args) {



        System.out.println("Velkommen til min opskrifts-applikation-dummy\n" );

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






    }


    public void blankLine(){

        System.out.println();
        System.out.println();
    }
}
