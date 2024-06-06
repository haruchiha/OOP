package hus.oop.matrix;
import java.util.Arrays;

public class SquareMatrix extends Matrix {

    public SquareMatrix(int size) {
        super(size, size);
    }

    public double[] principalDiagonal() {
        double[] diagonal = new double[data.length];
        for (int i = 0; i < data.length; i++) {
            diagonal[i] = data[i][i];
        }
        return diagonal;
    }

    public double[] secondaryDiagonal() {
        double[] diagonal = new double[data.length];
        for (int i = 0; i < data.length; i++) {
            diagonal[i] = data[i][data.length - 1 - i];
        }
        return diagonal;
    }
}