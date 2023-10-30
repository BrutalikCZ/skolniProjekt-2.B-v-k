import java.util.InputMismatchException;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> mesiceNaDny = new HashMap<>();
        mesiceNaDny.put("leden", 31);
        mesiceNaDny.put("unor", 28); 
        mesiceNaDny.put("brezen", 31);
        mesiceNaDny.put("duben", 30);
        mesiceNaDny.put("kveten", 31);
        mesiceNaDny.put("cerven", 30);
        mesiceNaDny.put("cervenec", 31);
        mesiceNaDny.put("srpen", 31);
        mesiceNaDny.put("zari", 30);
        mesiceNaDny.put("rijen", 31);
        mesiceNaDny.put("listopad", 30);
        mesiceNaDny.put("prosinec", 31);

        
        String nazevMesice = "leden";

        
        int pocetDni = mesiceNaDny.get(nazevMesice);

       
        System.out.println("Měsíc " + nazevMesice + " má " + pocetDni + " dní.");
    }
}
l");
 


