// Quadratic Equation Solver

import java.util.Scanner;
public class QuadraticEquation {
    public static void main(String[] args) {
        double a, b, c, d, x1 = 0, x2 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        a = sc.nextDouble();
        System.out.print("Enter the value of b: ");
        b = sc.nextDouble();
        System.out.print("Enter the value of c: ");
        c = sc.nextDouble();
        d = b * b - 4 * a * c;
        double sqrt = Math.sqrt(d);
        if (d == 0) {
            System.out.println("Root is :" + (-b / (2 * a)));
        } else if (d > 0) {
            x1 = (-b + sqrt) / (2 * a);
            x2 = (-b - sqrt) / (2 * a);
            System.out.println("Roots are: " + x1 + " and " + x2);
        } else {
            System.out.println("Roots are complex and different.");
        }
        sc.close();
    }
}