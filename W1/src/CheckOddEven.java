import java.util.Scanner;
public class CheckOddEven {
    public static int checkOddEven(int num){
        if ( num % 2 == 0)
            System.out.println("even number");
        else
            System.out.println("odd number");
        return 0;
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("This number is " + num);
        checkOddEven(num);
        System.out.println("BYE");

        sc.close();
    }


}
