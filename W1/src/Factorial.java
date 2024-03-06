public class Factorial {
    public static long calFactorial(int num){
        long factorial = 1;
        for ( int i = 2; i <= num; i++){
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args){

        System.out.println("The factorial of 20 is " + calFactorial(20));
    }
}
