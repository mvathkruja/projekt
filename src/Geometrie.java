public class Geometrie {
    public static double calculateSquareArea(double sideLength) {
        return sideLength * sideLength;
    }

    public static double calculateCylinderSurfaceArea(double radius, double height) {
        return 2 * Math.PI * radius * (radius + height);

    }

    public static double calculateCirclePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }
}
