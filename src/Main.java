import Figury.Kolo;
import Figury.Prostokat;
import Figury.Trojkat;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Figury> figury = new ArrayList<>();

        System.out.println("Podaj długość boku a ");
        System.out.println("Podaj długość boku b ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        figury.add(new Trojkat(a,b));

        System.out.println("Podaj długość boku a prostokąta ");
        System.out.println("Podaj długość boku b prostokąta ");
        double ap = scanner.nextDouble();
        double bp = scanner.nextDouble();
        figury.add(new Prostokat(ap,bp));

        System.out.println("podaj promień koła");
        double promien = scanner.nextDouble();
        figury.add(new Kolo(promien));



    }
}