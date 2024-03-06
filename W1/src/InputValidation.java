import java.util.Scanner;

public class InputValidation {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        boolean isValid = false;


        while(isValid == false) {
            int num = sc.nextInt();
            System.out.println("Enter a number between 0−10 or 90−100: " + num);
            if ((num >= 0 && num <= 10) || (num >= 90 && num <= 100 ) ) {
                System.out.printf("You have entered : %d", num);
                isValid = true;
            } else {
                System.out.println("Invalid input, try again... ");
            }
        }

        /*
        do{
            int num = sc.nextInt();
            System.out.println("Enter a number between 0−10 or 90−100: " + num);
            if ((num >= 0 && num <= 10) || (num >= 90 && num <= 100 ) ) {
                System.out.println("You have entered :" + num);
                isValid = true;
            }
            else
                System.out.println("Invalid input, try again... ");
        }while(!isValid);
        */

        sc.close();
    }
}