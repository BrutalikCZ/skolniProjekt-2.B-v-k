import java.util.InputMismatchException;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
public class Main {
    private static final Scanner vstup = new Scanner(System.in);
    public static void main(String args[])throws ParseException {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd MM yyyy");
        String str = formatter.format(date);
        System.out.println(date);

        System.out.print(": "+str);
        int vek, rokNarozeni = 0, zaJakDlouho;
        int year = 2023;
        //Zajiťuje aktuální rok a měsíc


        try {
            rokNarozeni = vstup.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Zadaný vstup nevypadá jako platný rok");
            System.out.println("Musíme to skončit");
            System.exit(1);
        }
        //Chytá možné chyby, třeba vstup písmen, místo čísel a sám se vypne.

        vek = year - rokNarozeni;
        zaJakDlouho = 18 - vek;

        // Kontrola jestly data dávají smysl
        if (rokNarozeni > year) {
            System.out.println("Myslím že tu máme cestovatele časem, opravdu jsi myslel že ti uvěřím že ses narodil v roce " + rokNarozeni + "?");
            System.exit(0);
        }
        if (rokNarozeni < 1910) {
            System.out.println("Vrať se do hrobu, ve " + vek + " bys neměl existovat.");
            System.exit(0);
        }
        if (vek > 60) {
            System.out.println("Wau, wau brácho. Trochu brzdi na starý kolena s tím pitím, jo?");
        } else if (vek > 17) {
            System.out.println("Gratuluji, můžeš legálně pít. Jenom to prosím nepřežeň :D");
        } else {
            String oznaceniRoku = " let";
            if (zaJakDlouho < 2) {
                oznaceniRoku = " rok";
            } else if (zaJakDlouho < 4) {
                oznaceniRoku = " roky";
            }
            System.out.println("Je mi líto, příteli. Pít bohužel ještě nemůžeš. Tak příště... za " + zaJakDlouho + oznaceniRoku +" se uvidíme. \n-Tvoje Pivo");
        }
        //Tenhle blok vypisuje samotnou zprávu. I se správným tvarem slova "rok"!

        //Main.main(new String[] {"a","b","c"}); (Když se odkomentuje, sám se program zase zapne. Nevím jak to zastavit)
    }
}
