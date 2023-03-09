package Figury;

public class Trojkat {
    class Trojkat implements Figury {
        private double a,b;

        public Trojkat(double a, double b){
            this.a = a;
            this.b = b;
        }

        @Override
        public double obwod(){
            return a+b+a*2;

        }

        @Override
        public double powieszchnia(){
            return  a*b/2;
        }

    }
}
