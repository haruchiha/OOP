import java.util.Scanner;

public class ArrayExercise {
    private static Scanner scanner;   // bien toan cuc

    //2.1 printArray
    public static int[] createArray(Scanner in) {
        System.out.print("Enter the number of items: ");
        int NUM_ITEMS = in.nextInt();
        int[] items = new int[NUM_ITEMS];
        System.out.println("Enter the values of all the items: ");
        for (int i = 0; i < NUM_ITEMS; i++) {
            items[i] = in.nextInt();
        }
        return items;
    }

    public static void printArray(int[] arr) {
        System.out.print("The values are: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    //2.2 GradesStatistics
    public static int[] generateStudentGrade(Scanner in){
        System.out.print("Enter the number of items: ");
        int numStudents = in.nextInt();
        int[] grade = new int[numStudents];
        for (int i = 0; i < numStudents; i++) {
            grade[i] = in.nextInt();
            System.out.println("Enter the grade for student " + (i+1) + ": " + grade[i]);
        }
        return grade;
    }

    public static void simpleGradesStatistics(int[] grades){
        int sum = 0;
        int min = grades[0];
        int max = grades[0];

        for (int grade : grades) {
            sum += grade;
            if (grade < min) {
                min = grade;
            }
            if (grade > max) {
                max = grade;
            }
        }

        double average = (double) sum / grades.length;

        System.out.println("The average: " + String.format("%.2f", average));
        System.out.println("The minium: " + min);
        System.out.println("The maximum: " + max);
    }

    //2.3 HexadecimalToBinary
    public static String hexadecimalToBinary(String hexStr) {
        // Convert hexadecimal string to integer
        int decimal = Integer.parseInt(hexStr, 16);
        // Convert integer to binary string
        String binaryStr = Integer.toBinaryString(decimal);
        return binaryStr;
    }

    public static void testHexadecimalToBinary() {
        System.out.print("Enter a hexadecimal string: ");
        String hexStr = scanner.nextLine();
        String binaryStr = hexadecimalToBinary(hexStr);
        System.out.println("The equivalent binary for hexadecimal " + hexStr + " is: " + binaryStr);
    }

    //2.4 DecimalToHexadecimal
    public static String decimalToHexadecimal(int positiveInteger) {
        // Convert decimal integer to hexadecimal string
        String hexadecimal = Integer.toHexString(positiveInteger).toUpperCase();
        return hexadecimal;
    }

    public static void testDecimalToHexadecimal() {
        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();

        // Check if the input is non-negative
        if (decimalNumber < 0) {
            System.out.println("Please enter a positive decimal number.");
            return;
        }

        String hexadecimalString = decimalToHexadecimal(decimalNumber);
        System.out.println("The equivalent hexadecimal number is: " + hexadecimalString);
    }


    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int[] items = createArray(scanner);
        printArray(items);

        int[] grades = generateStudentGrade(scanner);
        simpleGradesStatistics(grades);

        testHexadecimalToBinary();
        testDecimalToHexadecimal();
    }
}
