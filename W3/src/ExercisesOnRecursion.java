import java.util.Scanner;

public class ExercisesOnRecursion {
    private static Scanner scanner;
    //1.1 Factorial
    public static int factorial(int n){
        if (n == 0)
            return 1;
        return n * factorial(n-1);
    }
    public static void testFactorial(){
        int n = scanner.nextInt();
        System.out.println("Factorial (" + n + ") = " + factorial(n));
    }

    //1.2 Fibonacci
     public static int fibonacci(int n){
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return factorial(n-1) + factorial(n-2);
     }
     public static void testFibonacci(){
         int n = scanner.nextInt();
         System.out.println("Fibonacci (" + n + ") = " + fibonacci(n));
     }

     //1.4 GCD
     public static int gcd(int a, int b){
         if (b != 0)
             return gcd(b, a % b);
         return a;
     }
     public static void testGcd(){
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd(a,b));
     }


     public static void main(String[] args){
        scanner = new Scanner(System.in);
        testFactorial();
        testFibonacci();
        testGcd();
     }
}
