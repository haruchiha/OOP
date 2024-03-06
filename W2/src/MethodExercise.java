import java.util.Arrays;
import java.util.Scanner;

public class MethodExercise {
    private static Scanner scanner;

    //3.1 Exponent
    public static int exponent(int base, int exp){
        if (exp == 0)
            return 1;
        if (exp < 0)
            return (1/base)*(exponent(base,-(exp+1)));
        if (exp % 2 != 0)
            return base * exponent(base, exp-1);

        return exponent(base*base, exp/2);
    }

    public static void testExponent(){
        System.out.print("Enter the base: ");
        int base = scanner.nextInt();
        System.out.print("Enter the exp: ");
        int exp = scanner.nextInt();
        int result = exponent(base, exp);
        System.out.println(base + " raises to the power of " + exp + " is: " + result);
    }

    //3.2 HasEight
    public static boolean hasEight(int number){
        while (number > 0){
            int mod = number % 10;
            number = number/10;
            if (mod == 8)
                return true;
                break;
        }
        return false;
    }
    public static void testMagicSum(){
        final int SENTINEL = -1;
        int number;
        int sum = 0;
        System.out.print("Enter a positive number integer: ");
        number = scanner.nextInt();
        while (number != SENTINEL){
            System.out.print("Enter a positive number integer: ");
            number = scanner.nextInt();
            if(hasEight(number))
                sum += number;
        }
        System.out.print("The magic sum is: " + sum);
    }

    //3.3 print array
    public static void print(int[] array){
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    public static void testprint(){
        System.out.print("Enter the length of the array: ");
        int number = scanner.nextInt();
        int []array = new int[number];
        for (int i = 0; i < number; i++){
            array[i] = scanner.nextInt();
        }
        print(array);
    }

//    public static void printDoubleArray(double[] array) {
//        System.out.print("[");
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i]);
//            if (i < array.length - 1) {
//                System.out.print(", ");
//            }
//        }
//        System.out.println("]");
//    }
//
//    public static void print(float[] array) {
//        System.out.print("[");
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i]);
//            if (i < array.length - 1) {
//                System.out.print(", ");
//            }
//        }
//        System.out.println("]");
//    }
    //2.4 Array to String
    public static String arrayToString(int[] array){
        StringBuilder result = new StringBuilder();
        result.append("[");
        for (int i = 0; i < array.length; i++) {
            result.append(array[i]);
            if (i < array.length - 1) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }
    public static void testArrayToString(){
        System.out.print("Enter the length of the array: ");
        int number = scanner.nextInt();
        int []array = new int[number];
        for (int i = 0; i < number; i++){
            array[i] = scanner.nextInt();
        }
        System.out.print("Enter the array: ");
        arrayToString(array);
    }

    //3.5 contains
    public static boolean contains(int[] array, int key){
        for (int num : array){
            if (num == key)
                return true;
        }
        return false;
    }
    public static void testContains(){
        System.out.print("Enter the key: ");
        int key = scanner.nextInt();
        System.out.print("Enter the length of the array: ");
        int number = scanner.nextInt();
        System.out.print("Enter the array: ");
        int []array = new int[number];
        for (int i = 0; i < number; i++){
            array[i] = scanner.nextInt();
        }
        boolean result = contains(array,key);
        System.out.print("Array contains " + key + " is " + result);
    }

    //3.6 search
    public static int search(int[] array, int key){
        for (int i = 0; i < array.length; i++){
            if (array[i] == key)
                return i;
        }
        return -1;
    }
    public static void testSearch(){
        System.out.print("Enter the key: ");
        int key = scanner.nextInt();
        System.out.print("Enter the length of the array: ");
        int number = scanner.nextInt();
        System.out.print("Enter the array: ");
        int []array = new int[number];
        for (int i = 0; i < number; i++){
            array[i] = scanner.nextInt();
        }
        int result = search(array,key);
        System.out.print("Index of " + key + " in array is " + result);
    }

    //3.7 equals
    public static boolean equals(int[] array1, int[] array2){
        if (array1.length != array2.length)
            return false;
        return Arrays.equals(array1,array2);
    }
    public static void testEquals(){
        System.out.print("Enter the length of the array1: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the array1: ");
        int []array1 = new int[number1];
        for (int i = 0; i < number1; i++){
            array1[i] = scanner.nextInt();
        }

        System.out.print("Enter the length of the array2: ");
        int number2 = scanner.nextInt();
        System.out.print("Enter the array: ");
        int []array2 = new int[number2];
        for (int i = 0; i < number2; i++){
            array2[i] = scanner.nextInt();
        }

        System.out.print("Array 1 and array 2  are equal is " + equals(array1,array2));
    }

    //3.8 copy
    public static int[] copyOf(int[] array) {
        int[] copiedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copiedArray[i] = array[i];
        }
        return copiedArray;
    }

    public static void testCopyOf(){
        System.out.print("Enter the length of the array1: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the array1: ");
        int []array1 = new int[number1];
        for (int i = 0; i < number1; i++){
            array1[i] = scanner.nextInt();
        }

        System.out.print("Copied of Array1: " + copyOf(array1));
    }

    //3.9 swap
    public static boolean swap(int[] array1, int[] array2){
        if (array1.length != array2.length)
            return false;
        for (int i = 0; i < array1.length; i++){
            int temp = array1[i];
            array1[i] = array2[i];
            array2[i] = temp;
        }
        return true;
    }
    public static void testSwap(){
        System.out.print("Enter the length of the array1: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the array1: ");
        int []array1 = new int[number1];
        for (int i = 0; i < number1; i++){
            array1[i] = scanner.nextInt();
        }

        System.out.print("Enter the length of the array2: ");
        int number2 = scanner.nextInt();
        System.out.print("Enter the array: ");
        int []array2 = new int[number2];
        for (int i = 0; i < number2; i++){
            array2[i] = scanner.nextInt();
        }

        System.out.println("Original Arrays:");
        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));

        boolean result = swap(array1, array2);

        System.out.println("\nAfter Swap:");
        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
        System.out.println("Swap Successful: " + result);
    }

    //3.10 reverse
    public static void reverse(int[] array){
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }
    }
    public static void testReverse(){
        System.out.print("Enter the length of the array1: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the array1: ");
        int []array1 = new int[number1];
        for (int i = 0; i < number1; i++){
            array1[i] = scanner.nextInt();
        }

        System.out.println("Original Arrays: " + Arrays.toString(array1));
        reverse(array1);
        System.out.println("Reversed Arrays:" + Arrays.toString(array1));
    }



    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        testExponent();
        testMagicSum();
        testprint();
        testArrayToString();
        testContains();
        testSearch();
        testEquals();
        testCopyOf();
        testSwap();
        testReverse();
    }

}
