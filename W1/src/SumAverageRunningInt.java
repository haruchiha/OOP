import java.util.Scanner;

public class SumAverageRunningInt {
    public static double calcSumAverange(int num){
        double sum = ((double)num+1)/2;
        return sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(calcSumAverange(num));

        sc.close();
    }
}
