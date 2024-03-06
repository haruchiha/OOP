import java.util.Scanner;
public class HarmonicSum {
    public static double calcHarmonicSumLeftToRight(int num){
        double sumlr = 0;
        for(int i = 1; i <= num; i++){
            sumlr += 1.0/i;
        }
        System.out.println("Sum from left to right: " + sumlr);
        return sumlr;
    }
    public static double calcHarmonicSumRightToLeft(int num){
        double sumrl = 0;
        for(int i = num; i >= 1; i--){
            sumrl += 1.0/i;
        }
        System.out.println("Sum from right to left: " + sumrl);
        return sumrl;
    }

    public static int compareTwoSum(int num){
        double absolute_difference = calcHarmonicSumLeftToRight(num) - calcHarmonicSumRightToLeft(num);
        System.out.println("Absolute difference between the two sums: " + Math.abs(absolute_difference));
        return 0;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        compareTwoSum(num);

        sc.close();
    }
}
