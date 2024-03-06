import java.util.Scanner;

public class SumProductMinMax3 {
    public static int printThreeNumber(int num1, int num2, int num3){
        System.out.println("1st Integer: " + num1);
        System.out.println("2nd Integer: " + num2);
        System.out.println("3rd Integer: " + num3);
        return 0;
    }
    public static int calaSumThreeNumber(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        System.out.println("The sum is: " + sum);
        return 0;
    }
    public static int calaProductThreeNumber(int num1, int num2, int num3) {
        int product = num1 * num2 * num3;
        System.out.println("The product is: " + product);
        return 0;
    }
    public static int findMinThreeNumber(int num1, int num2, int num3) {
        int min = num1;
        if (min < num2)
            min = num2;
        if (min < num3)
            min = num3;
        System.out.println("The min is: " + min);
        return 0;
    }
    public static int findMaxThreeNumber(int num1, int num2, int num3) {
        int max = num1;
        if(max > num2)
            max = num2;
        if(max > num3)
            max = num3;
        System.out.println("The max is: " + max);
        return 0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        printThreeNumber(num1, num2, num3);
        calaSumThreeNumber(num1, num2, num3);
        calaProductThreeNumber(num1, num2, num3);
        findMinThreeNumber(num1, num2, num3);
        findMaxThreeNumber(num1, num2, num3);

        sc.close();
    }
}
