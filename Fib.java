// ******************************************************************
// Fib.java
//
// A utility class that provide methods to compute elements of the
// Fibonacci sequence.
// ******************************************************************
public class Fib
{
    //--------------------------------------------------------------
    // Recursively computes fib(n)
    //--------------------------------------------------------------
    public static int fib1(int n)
    {
        System.out.println("In fib(" + n + ")");
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else
            return fib1(n - 1) + fib1(n - 2);
    }
    public static int fib2(int n){
        int[] temp = new int[n];
        temp[0] = 0;
        temp[1] = 1;
        for (int i = 2; i < n; i++)
            temp[i] = temp[n-1] + temp[n-2];
         return temp[n-1];
        
    }
}