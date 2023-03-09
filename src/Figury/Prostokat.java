package Figury;

import Interfejs.Figury;

public class Prostokat implements Figury {
    private double a,b;
    public class Prostokat(double a, double b){
        this.a = a;
        this.b = b;
    }

    @Override
    public double powieszchnia(){
        return a*b;
    }

    @Override
    public double obwod(){
        return a+a+b+b;
    }


}
