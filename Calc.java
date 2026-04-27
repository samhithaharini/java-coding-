import java.util.Scanner;

public class Calc {
    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calc calculator = new Calc();
        System.out.print("Enter first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt();
        System.out.println("Result of add(" + num1 + ", " + num2 + ") = " + calculator.add(num1, num2));
        System.out.print("Enter first integer: ");
        int num3 = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int num4 = scanner.nextInt();
        System.out.print("Enter third integer: ");
        int num5 = scanner.nextInt();
        System.out.println("Result of add(" + num3 + ", " + num4 + ", " + num5 + ") = " + calculator.add(num3, num4, num5));
        System.out.print("Enter first double value: ");
        double num6 = scanner.nextDouble();
        System.out.print("Enter second double value: ");
        double num7 = scanner.nextDouble();
        System.out.println("Result of add(" + num6 + ", " + num7 + ") = " + calculator.add(num6, num7));
    }
}
