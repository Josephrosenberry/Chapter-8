// ******************************************************************
// TestFib.java
//
// A simple driver that uses the Fib class to compute the
// nth element of the Fibonacci sequence.
// ******************************************************************
import java.util.Scanner;
public class TestFib
{
    public static void main(String[] args)
    {
        System.out.println("\f");
        int n, fib, fib2;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        n = scan.nextInt();
        fib2 = Fib.fib2(n);
        System.out.println("Fib2(" + n + ") is " + fib2);
        fib = Fib.fib1(n);
        System.out.println("Fib(" + n + ") is " + fib);
    }
} 