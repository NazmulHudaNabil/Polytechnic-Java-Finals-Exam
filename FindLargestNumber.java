// Find the Largest number

public class FindLargestNumber {
    public static void main(String[] args) {
        int a = 10, b =5, c = 15;
        if (a > b && a > c) {
            System.out.println("The largest number is: " + a);
        } else if (b > a && b > c) {
            System.out.println("The largest number is: " + b);
        } else {
            System.out.println("The largest number is: " + c);
            
        }
    }
}
