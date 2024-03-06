import java.util.Scanner;

public class DecisionAndLoopsHomework {
    private static Scanner scanner;

    //1.1 Number guess
    public static void guessNumber(){
        int SECRET_NUMBER  = (int) Math.random()*100;
        System.out.println("Key in your guess: " + SECRET_NUMBER);
        int numTrial = 0;
        int n;

        while (true){
            n = scanner.nextInt();
            numTrial++;
            if (n > SECRET_NUMBER) {
                System.out.println("Try lower");
            }
            else if(n < SECRET_NUMBER) {
                System.out.println("Try higher");
            }
            else
                System.out.println("You got it in " + numTrial + " trials");
        }
    }


    //1.2 Word Guess


    public static void main(String[] args){
        scanner = new Scanner(System.in);
        guessNumber();
    }
}
