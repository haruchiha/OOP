import java.util.Scanner;

public class CircleComputation {
    public static double calcCircleComputation(double radius){
        double diameter = radius * 2;
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;
        System.out.printf("Diameter is : %.2f%n", diameter);
        System.out.printf("Area is : %.2f%n", area);
        System.out.printf("Circumference is :%.2f%n", circumference);
        return 0;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        calcCircleComputation(radius);

        sc.close();
    }
}
