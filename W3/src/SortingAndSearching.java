import java.util.Arrays;
import java.util.Scanner;

public class SortingAndSearching {
    private static Scanner scanner;

    //2.1 Linear Search


    //2.3 BUBBLE SORT: so sanh 2 phan tu lien ke
    public static void bubbleSort(int [] array){
        int n = array.length;
        for (int i = 0; i < n-1; i++) {
            int min_idx = i;
            for (int j = i+1; j < n; j++) {
                if (array[j] < array[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }
    }
    public static void testBubbleSort(){
        int[] arr = {9,5,7,4,3,2};
        bubbleSort(arr);
        System.out.println("BubbleSort: " + Arrays.toString(arr));
    }

    //2.4SELECTION SORT
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++){
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++){
                if (arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }
            if (minIndex != i){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
    public static void testSelectionSort(){
        int[] arr = {9,5,7,4,3,2};
        selectionSort(arr);
        System.out.println("SelectionSort: " + Arrays.toString(arr));
    }

    // 2.5 Insertion Sort
    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }
    public static void testInsertionSort(){
        int[] arr = {9,5,7,4,3,2};
        insertionSort(arr);
        System.out.println("InsertionSort: " + Arrays.toString(arr));
    }

}
