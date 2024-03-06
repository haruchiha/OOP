import java.util.Scanner;
public class ComputePI {
    public static double calcNumberPi(int n){
        double sum = 0;
        for ( int i = 1; i <= n; i++){
            if(i % 4 == 1)
                sum += 1/(double)i;
            if(i % 4 == 3)
                sum -= 1/(double)i;
        }
        System.out.println(4*sum);
        return 0;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        calcNumberPi(num);

        sc.close();
    }
}
