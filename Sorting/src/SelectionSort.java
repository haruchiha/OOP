import java.util.Scanner;

public class SelectionSort {
    public static void selectionSort(int []a, int n){
        for(int i = n-1; i >= 1; --i){
            int maxIdx = i;
            for (int j = 0; j < i; ++j){
                if(a[j] >= a[maxIdx])
                    maxIdx = j;
            }

            int temp = a[maxIdx];
            a[maxIdx] = a[i];
            a[i] = temp;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        selectionSort(a,n);
        System.out.print("Mang da duoc sap xep theo Selection Sort la: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
