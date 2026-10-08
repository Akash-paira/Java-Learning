package Assesments;

interface MathOperation {
    float compute(float a, float b);
}
class Addition implements MathOperation {
    public float compute(float a, float b) {
        return a + b;
    }
}
class Subtraction implements MathOperation {
    public float compute(float a, float b) {
        return a - b;
    }
}
class Multiplication implements MathOperation {
    public float compute(float a, float b) {
        return a * b;
    }
}
class Division implements MathOperation {
    public float compute(float a, float b) {
        if (b == 0)
            return 0;
        return a / b;
    }
}
public class CalculatorDemo {
    public static void main(String[] args) {
        float a = 20.0f;
        float b = 5.0f;
        System.out.println("=== Mathematical Operations Using Interfaces ===");
        System.out.println("Inputs: a = " + a + ", b = " + b);
        MathOperation op;
        op = new Addition();
        System.out.println("Addition: " + op.compute(a, b));
        op = new Subtraction();
        System.out.println("Subtraction: " + op.compute(a, b));
        op = new Multiplication();
        System.out.println("Multiplication: " + op.compute(a, b));
        op = new Division();
        System.out.println("Division: " + op.compute(a, b));
    }
}