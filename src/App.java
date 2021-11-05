import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Fahrzeug> fahrzeuge = new ArrayList<Fahrzeug>();

        fahrzeuge.add(new Pkw(false, "VW", "Polo", 74, 4900.0));
        fahrzeuge.add(new Pkw(true, "VW", "Touran", 165, 29900.0));
        fahrzeuge.add(new Pkw(true, "VW", "Tiguan", 86, 12900.0));
        
        
        // Punktnotation an dem jeweiligen Objekt .getPs()
        // IF-Abfrage - Verglichen wird PS
        // ArrayList durchgehen - iterieren - OK

        Fahrzeug maxAuto = fahrzeuge.get(0);
        for(Fahrzeug f : fahrzeuge){
            if( f.getPs() > maxAuto.getPs() ){
                maxAuto = f;
            }
        }

        System.out.println("Die höchste PS-Zahl lautet " + maxAuto.getPs() + " und ist ein " + maxAuto.getMarke() + " " + maxAuto.getTyp());
        
    }
}
