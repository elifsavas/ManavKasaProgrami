import java.util.Scanner ;

public class Main {
    public static void main(String[] args) {

        double a = 2.14 , e = 3.67 , d = 1.11 , m = 0.95 , p = 5 ;
        double kgA, kgE, kgD, kgM, kgP, tutar ;

        Scanner input = new Scanner(System.in) ;

        System.out.print("Armut (kg): ");
        kgA = input.nextDouble() ;

        System.out.print("Elma (kg):");
        kgE = input.nextDouble() ;

        System.out.print("Domates (kg):");
        kgD = input.nextDouble() ;

        System.out.print("Muz (kg):");
        kgM = input.nextDouble() ;

        System.out.print("Patlıcan (kg):");
        kgP = input.nextDouble();

        tutar = ( (a*kgA) + (e*kgE) + (d*kgD) + (m*kgM) + (p*kgP) );
        System.out.println("Toplam:" + tutar + " TL");
    }
}
