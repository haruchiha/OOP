import java.util.Scanner;
public class ReverseInt {
    public static int calcReverseInt(int n){
        System.out.println("Enter a positive integer: " + n);
        int ans = 0;
        while (n > 0){
            int mod = n % 10;
            ans = ans*10 + mod;
            n /= 10;
        }
        System.out.println("The reverse is: " + ans);
        return 0;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        calcReverseInt(num);

        sc.close();
    }
}
