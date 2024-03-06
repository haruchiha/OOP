import java.util.Scanner;

public class Fibonacci {
    public static int calcFibonacci(int n){
        if (n == 1)
            return 1;
        if (n == 2)
            return 1;
        return calcFibonacci(n-1)+ calcFibonacci(n-2);
    }

    public static int printFibonacci(int n){
        System.out.println("The first " + n + " Fibonacci numbers are :");
        for( int i = 1; i <= n; i++){
            System.out.print(calcFibonacci(i) + " ");
        }
        return 0;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printFibonacci(num);

        sc.close();
    }
}
