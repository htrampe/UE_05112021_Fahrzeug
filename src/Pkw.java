public class Pkw extends Fahrzeug {
    
    boolean siebenSitzer;

    public Pkw(boolean siebenSitzer, String marke, String typ, int ps, double preis) {
        super(marke, typ, ps, preis);
        this.siebenSitzer = siebenSitzer;
    }

}
