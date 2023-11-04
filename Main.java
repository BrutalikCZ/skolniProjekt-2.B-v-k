import java.util.InputMismatchException;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        int rokNarozeni;
        int cilovyVek; //Kolik let uživatel chce, aby mu bylo
        int cisloDni; //Výsledek metody, která převede měsíce na dny a součet se dnem uloží do proměnné
        int zaDni; //Za jak dlouho budou další narozeniny
        int dnesniDatum; //Dnešní datum
        int zaKolikLet; //Kolik je danému člověku LET
        
        //promenné ze scanneru
        

      
        

        System.out.println("Prosím, vložte svůj rok narození");
        Scanner rk = new Scanner(System.in);
        int rok = rk.nextInt();
        System.out.println("Prosím, vložte svůj měsíc narození");
        Scanner mc = new Scanner(System.in);
        int mesic = mc.nextInt();
        System.out.println("Prosím, vložte svůj den narození");
        Scanner dn = new Scanner(System.in);
        int den = dn.nextInt();

        //if[ ]{}


        System.out.println(rok + "" + mesic + "" + den);

        
        //zaKolikLet = rokNarozeni - cilovyVek;

        //System.out.println("Je ti " + (dnesniDatum - rokNarozeni) + " | Další narozeniny budeš mít za " + zaDni + " dní | A jak jsi po mě chtěl, " + cilovyVek + " ti bude za " + zaKolikLet);


    }
}