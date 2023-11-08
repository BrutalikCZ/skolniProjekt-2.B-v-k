import java.util.InputMismatchException;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

public class main {


// nemam tuseni jestli to bude fungovat protoze mi blblo visualko takze to neslo testovat (pokud se najde chyba tak to muze nas bug tester matej spravit :) )
             // Získání aktuálního data
        Date currentDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        dnesniDatum = Integer.parseInt(sdf.format(currentDate));

        // Výpočet věku
        jeTiLet = (dnesniDatum / 10000) - rokNarozeni;

        // Výpočet počtu dní do narozenin
        int dnesniMesic = (dnesniDatum / 100) % 100;
        int dnesniDen = dnesniDatum % 100;

        int narozeninyMesic = mesic;
        int narozeninyDen = den;

        if (narozeninyMesic < dnesniMesic || (narozeninyMesic == dnesniMesic && narozeninyDen < dnesniDen)) {
            narozeninyMesic += 12; // Pokud jsou narozeniny v tomto roce již za námi, posuneme je na příští rok.
        }

        int rozdilDni = (narozeninyMesic - dnesniMesic) * 30 + (narozeninyDen - dnesniDen);
        
        // Zpráva podle podmínky
        if (rozdilDni == 0) {
            System.out.println("Veselé narozeniny dnes!");
        } else if (rozdilDni <= 30) {
            System.out.println("Veselé narozeniny za " + rozdilDni + " dní");
        } else {
            System.out.println("Vaše narozeniny budou za " + rozdilDni + " dní");


    }

}
}
