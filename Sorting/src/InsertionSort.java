import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int[] a, int n) {
        for (int i = 1; i < n; ++i) {
            int next = a[i];
            int j;

            for (j = i - 1; j >= 0 && a[j] > next; --j) {
                a[j + 1] = a[j];
            }
            a[j + 1] = next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        insertionSort(a, n);
        System.out.print("Mang da duoc sap xep theo Insertion Sort la: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
