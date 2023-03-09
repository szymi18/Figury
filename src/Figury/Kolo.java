package Figury;

import Interfejs.Figury;

public class Kolo implements Figury{
    private  double promienKola;

    public Koło(double promienKola) {
        this.promienKola = promienKola;
    }

    @Override
    public  double obwod(){
        return 2*3.14*promienKola;
    }

    @Override
    public double powieszchnia(){
        return 3.14 * (powieszchnia*promienKola);
    }

}
