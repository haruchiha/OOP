import java.util.Scanner;

public class MathLibraryHomework {
    private static Scanner scanner;

    //5.1 Trigonometric Series
    public static double sin(double x, int numTerms){
        double result = 0.0;
        double subValue = 1.00;
        int sign = 1;
        for (int i = 1; i < numTerms; i++) {
            subValue *= x / i;
            if (i % 2 == 1) {
                result += (sign * subValue);
                sign *= -1;
            }
        }
        return result;
    }

    public static double cos(double x, int numTerms){
        double result = 0;
        double subValue = 1.00;
        int sign = 1;
        for (int i = 1; i < numTerms; i++) {
            subValue *= x / i;
            if (i == 1) {
                result += 1;
                sign *= -1;
            } else if (i % 2 == 0) {
                result += (sign * subValue);
                sign *= -1;
            }
        }
        return result;
    }
    public static void testTrigonometric(){
        System.out.print("Enter the number of x: ");
        int x = scanner.nextInt();
        System.out.print("Enter the number of numTerm: ");
        int numTerm = scanner.nextInt();
        System.out.print("The value of sin(x): " + sin(x, numTerm));
        System.out.print("The value of cos(x): " + cos(x, numTerm));
    }

    //5.2 exponential series

    //5.3 FactorialInt
    public static void factorialInt(){
        int maxValue = Integer.MAX_VALUE;
        int factorial = 1;
        int idx = 1;

        while (factorial <= maxValue / idx) {
            factorial *= idx;
            System.out.println("The factorial of " + idx + " is " + factorial);
            idx++;
        }

        System.out.println("The factorial of " + idx + " is out of range");
    }

    //5.4 fibonacciInt
    public static void fibonacciInt() {
        int[] Fibo = new int[100];
        int maxValue = Integer.MAX_VALUE;
        Fibo[0] = 1;
        Fibo[1] = 1;
        int idx = 2;

        while ((maxValue - Fibo[idx-1]) > Fibo[idx-2]) {
            Fibo[idx] = Fibo[idx - 1] + Fibo[idx - 2];
            idx++;
        }

        for (int i = 0; i < idx; i++) {
            System.out.println("F(" + i + ") = " + Fibo[i]);
        }

        System.out.println("F(" + (idx) + ") is out of range");
    }


    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        testTrigonometric();
        factorialInt();
        fibonacciInt();
    }
}
