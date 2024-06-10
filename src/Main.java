// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Beispielaufrufe der Funktionen
        double rectangleLength = 5.0;
        double rectangleWidth = 3.0;
        System.out.println("Flächeninhalt des Rechtecks: " + GeometricCalculations.rectangleArea(rectangleLength, rectangleWidth));

        double circleRadius = 4.0;
        System.out.println("Umfang des Kreises: " + GeometricCalculations.circleCircumference(circleRadius));

        double sideA = 3.0;
        double sideB = 4.0;
        double sideC = 5.0;
        System.out.println("Flächeninhalt des Dreiecks: " + GeometricCalculations.triangleArea(sideA, sideB, sideC));
    }
}
