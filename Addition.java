// java code to find the sum of two numbers entered by the user using Scanner class
import java.util.Scanner;

public class Addition {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value:");
        int a = scan.nextInt();
        System.out.println("Enter value:");
        int b = scan.nextInt();
        int c = a+b;
        System.out.println("Result: a + b = " + c);
    }
}
