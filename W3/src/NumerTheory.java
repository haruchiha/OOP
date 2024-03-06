import java.util.Scanner;

public class NumerTheory {
    private static Scanner scanner;

    //3.1 Perfect and Deficient Numbers
    public static boolean isPerfect(int aPosInt){
        int sum = 1;
        for (int i = 2; i < aPosInt; i++){
            if (aPosInt % i == 0)
                sum += i;
        }
        if (sum == aPosInt)
            return true;
        return false;
    }
    public static boolean isDeficient(int aPosInt){
        int sum = 1;
        for (int i = 2; i < aPosInt; i++){
            if (aPosInt % i == 0)
                sum += i;
        }
        if (sum < aPosInt)
            return true;
        return false;
    }
    public static void PerfectNumberList(){
        System.out.print("Enter the upper bound: ");
        int aPosInt = scanner.nextInt();
        System.out.println("There numbers are perfect: ");
        for (int i = 2; i < aPosInt; i++){
            if (isPerfect(i))
                System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("There numbers are neither deficient nor perfect: ");
        for (int i = 2; i < aPosInt; i++){
            if (!isPerfect(i) && !isDeficient(i))
                System.out.print(i + " ");
        }
    }

    //3.2 Prime Numbers
    public static boolean isPrime(int aPosInt){
        if (aPosInt < 2)
            return false;
        for (int i = 2; i < aPosInt; i++){
            if (aPosInt % i == 0)
                return false;
        }
        return true;
    }
    public static void PrimeList(){
        System.out.print("Enter the upper bound: ");
        int n = scanner.nextInt();
        for (int i = 2; i < n; i++){
            if (isPrime(i))
                System.out.println(i + " ");
        }
    }

    //3.3 Prime factor
    public static boolean isProductOfPrimeFactors(int aPosInt){
        int product = 1;
        for (int i = 2; i <= aPosInt; i++) {
            if (isPrime(i) && aPosInt % i == 0) {
                product *= i;
            }
        }
        return product == aPosInt;
    }
    public static void PerfectPrimeFactorList(){
        System.out.print("Enter the upper bound: ");
        int n = scanner.nextInt();
        System.out.println("There numbers are equal to the product: ");
        for (int i = 1; i < n; i++){
            System.out.print(i +" ");
        }
    }

    //3.4 Greatest Common Divisor (GCD)
    public static int gcd(int a, int b){
        while (a != b){
            if (a > b)
                a = a-b;
            else
                b = b-a;
        }
        return b;
    }
    public static void testGCD(){
        System.out.print("Enter the number a: ");
        int a = scanner.nextInt();
        System.out.print("Enter the number b: ");
        int b = scanner.nextInt();
        System.out.println("GCD of a and b is: " + gcd(a,b));
    }

    public static void main(String[] args){
        scanner = new Scanner(System.in);
        PerfectNumberList();
        PrimeList();
        PerfectPrimeFactorList();
        testGCD();
    }

}
