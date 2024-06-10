class GeometryCalculator {

    // Funktion zur Berechnung des Flächeninhalts eines Rechtecks
    public static double berechneRechteckFläche(double länge, double breite) {
        return länge * breite;
    }

    // Funktion zur Berechnung des Umfangs eines Rechtecks
    public static double berechneRechteckUmfang(double länge, double breite) {
        return 2 * (länge + breite);
    }

    // Funktion zur Berechnung des Flächeninhalts eines Kreises
    public static double berechneKreisFläche(double radius) {
        return Math.PI * radius * radius;
    }

    // Funktion zur Berechnung des Umfangs eines Kreises
    public static double berechneKreisUmfang(double radius) {
        return 2 * Math.PI * radius;
    }
}


