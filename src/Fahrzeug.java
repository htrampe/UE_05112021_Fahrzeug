public class Fahrzeug {

    String _marke;
    String _typ;
    int _ps;
    double _preis;

    public Fahrzeug(String marke, String typ, int ps, double preis){
        setMarke(marke);
        setPreis(preis);
        setPs(ps);
        setTyp(typ);
    }

    public void printData(String extraData){
        System.out.println(getMarke());
        System.out.println(getPreis());
        System.out.println(getPs());
        System.out.println(getTyp());
        System.out.println(extraData);
    }

    public void setMarke(String marke) {
        this._marke = marke;
    }

    public void setPreis(double _preis) {
        this._preis = _preis;
    }

    public void setPs(int _ps) {
        this._ps = _ps;
    }

    public void setTyp(String _typ) {
        this._typ = _typ;
    }

    public String getMarke() {
        return _marke;
    }

    public double getPreis() {
        return _preis;
    }

    public int getPs() {
        return _ps;
    }

    public String getTyp() {
        return _typ;
    }
     
    
}
