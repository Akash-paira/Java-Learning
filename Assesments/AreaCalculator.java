package Assesments;
public class AreaCalculator {
    
    public double calculateArea(double side) {
        return side * side;
    }
    public double calculateArea(double length, double width) {
        return length * width;
    }
    public double calculateArea(double radius, boolean isCircle) {
        if (isCircle) {
            return Math.PI * radius * radius;
        } else {
            throw new IllegalArgumentException("Invalid input for circle area calculation.");
        }
    }

    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();

        // Calculate area of square
        double squareArea = calculator.calculateArea(5);
        System.out.println("Area of Square: " + squareArea);

        // Calculate area of rectangle
        double rectangleArea = calculator.calculateArea(4, 6);
        System.out.println("Area of Rectangle: " + rectangleArea);

        // Calculate area of circle
        double circleArea = calculator.calculateArea(3, true);
        System.out.println("Area of Circle: " + circleArea);
    }
}
