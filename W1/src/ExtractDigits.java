import java.util.Scanner;
public class ExtractDigits {
    public static int extractNumber(int n){
        while (n > 0){
            System.out.print(n % 10 + " ");
            n /= 10;
        }
        return 0;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        extractNumber(num);

        sc.close();
    }
}
