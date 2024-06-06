package hus.oop.matrix;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class MatrixTestDrive {
    public static void main(String[] args) {
        /* TODO
        Yêu cầu

        Sinh ngẫu nhiên một số tự nhiên nằm trong đoạn [5, 10], lưu vào biến n.
        Tạo ra 2 ma trận vuông có cùng kích thước n. Trong đó các phần tử của ma trận được khởi tạo bằng cách sinh ngẫu nhiên
        có giá trị nằm trong đoạn [1, 10].

        Viết code thực hiện test các chức năng sau của các ma trận:
          - In ra 2 ma trận và 2 ma trận chuyển vị tương ứng.
          - In ra các đường chéo chính và đường chéo phụ của 2 ma trận.
          - In ra ma trận là ma trận tổng của 2 ma trận.
          - In ra ma trận là ma trận là hiệu của ma trận thứ nhất cho ma trận thứ 2.
          - In ra ma trận là ma trận tích của 2 ma trận.
          - In ra một ma trận dạng hình thang theo hàng (row echelon form) dùng phép khử Gauss của 2 ma trận.

         Lưu kết quả chạy chương trình trên terminal vào file text theo tên <TenSinhVien_MaSinhVien_Matrix.txt>
         (Ví dụ, NguyenVanA_123456_Matrix.txt).
         Nén các file source code và file text kết quả vào file <TenSinhVien_MaSinhVien_Matrix.zip>, nộp lên classroom.
         */

         int n = (int) (Math.random() * 6) + 5; // Sinh ngẫu nhiên số tự nhiên trong đoạn [5, 10]

        SquareMatrix matrix1 = new SquareMatrix(n);
        SquareMatrix matrix2 = new SquareMatrix(n);

        // In ra 2 ma trận và 2 ma trận chuyển vị tương ứng
        System.out.println("Matrix 1:");
        System.out.println(matrix1.toString());
        System.out.println("Transpose of Matrix 1:");
        System.out.println(matrix1.transpose().toString());

        System.out.println("Matrix 2:");
        System.out.println(matrix2.toString());
        System.out.println("Transpose of Matrix 2:");
        System.out.println(matrix2.transpose().toString());

        // In ra các đường chéo chính và đường chéo phụ của 2 ma trận
        System.out.println("Principal diagonal of Matrix 1: " + Arrays.toString(matrix1.principalDiagonal()));
        System.out.println("Secondary diagonal of Matrix 1: " + Arrays.toString(matrix1.secondaryDiagonal()));

        System.out.println("Principal diagonal of Matrix 2: " + Arrays.toString(matrix2.principalDiagonal()));
        System.out.println("Secondary diagonal of Matrix 2: " + Arrays.toString(matrix2.secondaryDiagonal()));

        // In ra ma trận là ma trận tổng của 2 ma trận
        System.out.println("Sum of Matrix 1 and Matrix 2:");
        System.out.println(matrix1.add(matrix2).toString());

        // In ra ma trận là ma trận hiệu của ma trận thứ nhất cho ma trận thứ 2
        System.out.println("Difference of Matrix 1 and Matrix 2:");
        System.out.println(matrix1.minus(matrix2).toString());

        // In ra ma trận là ma trận tích của 2 ma trận
        System.out.println("Product of Matrix 1 and Matrix 2:");
        System.out.println(matrix1.multiply(matrix2).toString());

        // In ra ma trận dạng hình thang theo hàng (row echelon form) dùng phép khử Gauss của 2 ma trận
        System.out.println("Row echelon form of Matrix 1:");
        System.out.println(matrix1.gaussianElimination().toString());
        System.out.println("Row echelon form of Matrix 2:");
        System.out.println(matrix2.gaussianElimination().toString());

        
    }
}
