public class GeometricCalculations {

    public static double rectangleArea(double length, double width) {
        return length * width;
    }


    public static double circleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double triangleArea(double sideA, double sideB, double sideC) {
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }
}


