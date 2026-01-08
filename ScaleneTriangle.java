// Scalene of Triangle

import java.util.Scanner;

public class ScaleneTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        double a = sc.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = sc.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = sc.nextDouble();

        if ((a + b) > c && (b + c) > a && (a + c) > b) {
            double s = (a + b + c) / 2.0;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.println("The area is " + area);
        } else {
            System.out.println("Triangle is impossible");
        }
        sc.close();
    }
}
