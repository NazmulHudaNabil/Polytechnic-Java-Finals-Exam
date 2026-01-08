// Sum of two numbers entered by user


import java.util.Scanner;
public class SumOfNumbers {
    public static void main(String[] args) {
        int a, b, sum;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        a = scanner.nextInt(); 
        System.out.print("Enter the second number: ");
        b = scanner.nextInt();  
        sum = a + b;
        System.out.println("The sum of a and b is: " + sum);
        scanner.close();
    }
}
