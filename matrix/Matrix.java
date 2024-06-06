package hus.oop.matrix;
import java.util.Arrays;

public class Matrix {
    protected double[][] data;
    

    public Matrix(int rows, int columns) {
        data = new double[rows][columns];
        initRandom(rows, columns);
    }

    private void initRandom(int rows, int columns) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                data[i][j] = Math.random() * 10 + 1;
            }
        }
    }

    public double get(int row, int col) {
        return data[row][col];
    }

    public void set(int row, int col, double value) {
        data[row][col] = value;
    }

    public Matrix getSortedMatrix() {
        double[] temp = new double[data.length * data[0].length];
        int index = 0;
        for (double[] row : data) {
            for (double value : row) {
                temp[index++] = value;
            }
        }
        Arrays.sort(temp);
        Matrix sortedMatrix = new Matrix(data.length, data[0].length);
        index = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                sortedMatrix.set(i, j, temp[index++]);
            }
        }
        return sortedMatrix;
    }

    public Matrix add(Matrix that) {
        if (data.length != that.data.length || data[0].length != that.data[0].length) {
            throw new IllegalArgumentException("Matrix dimensions must be the same for addition.");
        }

        Matrix result = new Matrix(data.length, data[0].length);
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                result.set(i, j, data[i][j] + that.get(i, j));
            }
        }
        return result;
    }

    public Matrix minus(Matrix that) {
        if (data.length != that.data.length || data[0].length != that.data[0].length) {
            throw new IllegalArgumentException("Matrix dimensions must be the same for subtraction.");
        }

        Matrix result = new Matrix(data.length, data[0].length);
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                result.set(i, j, data[i][j] - that.get(i, j));
            }
        }
        return result;
    }

    public Matrix multiply(Matrix that) {
        if (data[0].length != that.data.length) {
            throw new IllegalArgumentException("Matrix dimensions are not compatible for multiplication.");
        }

        Matrix result = new Matrix(data.length, that.data[0].length);
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < that.data[0].length; j++) {
                double sum = 0;
                for (int k = 0; k < data[0].length; k++) {
                    sum += data[i][k] * that.get(k, j);
                }
                result.set(i, j, sum);
            }
        }
        return result;
    }

    public Matrix scaled(int value) {
        Matrix result = new Matrix(data.length, data[0].length);
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                result.set(i, j, data[i][j] * value);
            }
        }
        return result;
    }

    public Matrix transpose() {
        Matrix transposedMatrix = new Matrix(data[0].length, data.length);
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                transposedMatrix.set(j, i, data[i][j]);
            }
        }
        return transposedMatrix;
    }

    public Matrix gaussianElimination() {
        double[][] newData = new double[data.length][data[0].length];
    for (int i = 0; i < data.length; i++) {
        System.arraycopy(data[i], 0, newData[i], 0, data[0].length);
    }

    for (int i = 0; i < data.length; i++) {
        for (int j = i + 1; j < data.length; j++) {
            double factor = newData[j][i] / newData[i][i];
            for (int k = 0; k < data[0].length; k++) {
                newData[j][k] -= factor * newData[i][k];
            }
        }
    }
    
    Matrix result = new Matrix(data.length, data[0].length);
    result.data = newData;
    return result;
    }


    // Implement other methods as needed

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (double[] row : data) {
            for (double value : row) {
                sb.append(value).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}