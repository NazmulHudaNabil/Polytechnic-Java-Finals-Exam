// Calculate the area of a circle


import java.util.Scanner;
public class CircleArea {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of radius: ");
        double r = sc.nextDouble();
        double area = 3.1416 * r * r;
        System.out.println("The area of circle is: " + area);
        sc.close();
    }
}