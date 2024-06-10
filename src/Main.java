// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        double länge = 5.0;
        double breite = 3.0;
        double radius = 2.5;


        System.out.println("Flächeninhalt Rechteck: " + GeometryCalculator.berechneRechteckFläche(länge, breite));
        System.out.println("Umfang Rechteck: " + GeometryCalculator.berechneRechteckUmfang(länge, breite));
        System.out.println("Flächeninhalt Kreis: " + GeometryCalculator.berechneKreisFläche(radius));
        System.out.println("Umfang Kreis: " + GeometryCalculator.berechneKreisUmfang(radius));
    }
}
