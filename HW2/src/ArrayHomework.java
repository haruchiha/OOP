import java.util.Scanner;

public class ArrayHomework {
    private static Scanner scanner;

    //4.1 print array in stars
    public static void printArrayInStars(Scanner in){
        System.out.print("Enter the number of items: ");
        int NUM_ITEMS = scanner.nextInt();
        System.out.print("Enter the value of all items: ");
        int[] item = new int[NUM_ITEMS];
        for (int i = 0; i < NUM_ITEMS; i++){
            item[i] = scanner.nextInt();
        }

        for (int idx = 0; idx < NUM_ITEMS; idx++){
            System.out.print(idx + ": ");
            for (int starNo = 1; starNo <= item[idx]; starNo++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //4.2 matrices 2d arrays

    public static void main(String[] args){
        scanner = new Scanner(System.in);
        printArrayInStars(scanner);
    }
}
