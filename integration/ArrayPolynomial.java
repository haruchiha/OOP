package hus.oop.integration;

import java.util.Arrays;

public class ArrayPolynomial extends AbstractPolynomial {
    private static final int DEFAULT_CAPACITY = 8;
    private double[] coefficients;
    private int size;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public ArrayPolynomial() {
        this.coefficients = new double[DEFAULT_CAPACITY];
        this.size = 0;
    }

    /**
     * Lấy hệ số của đa thức tại phần tử index.
     * @return hệ số tại phần tử index.
     */
    @Override
    public double coefficient(int index) {
        if (index < 0 || index >= size) {
            return 0;
        }
        return coefficients[index];
    }

    /**
     * Lấy mảng các hệ số của đa thức.
     * @return mảng các hệ số của đa thức.
     */
    @Override
    public double[] coefficients() {
        return Arrays.copyOf(coefficients, size);
    }

    /**
     * Thêm một phần tử có hệ số coefficient vào đầu đa thức.
     * @param coefficient
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial insertAtStart(double coefficient) {
        if (size >= coefficients.length) {
            enlarge();
        }
        System.arraycopy(coefficients, 0, coefficients, 1, size);
        coefficients[0] = coefficient;
        size++;
        return this;
    }

    /**
     * Thêm một phần tử có hệ số coefficient vào cuối đa thức.
     * @param coefficient
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial insertAtEnd(double coefficient) {
        if (size >= coefficients.length) {
            enlarge();
        }
        coefficients[size] = coefficient;
        size++;
        return this;
    }

    /**
     * Thêm một phần tử có hệ số coefficient vào vị trí index.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial insertAtPosition(double coefficient, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if (size >= coefficients.length) {
            enlarge();
        }
        System.arraycopy(coefficients, index, coefficients, index + 1, size - index);
        coefficients[index] = coefficient;
        size++;
        return this;
    }

    /**
     * Thay đổi hệ số của đa thức tại phần tử index.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial set(double coefficient, int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        coefficients[index] = coefficient;
        return this;
    }

    /**
     * Lấy bậc của đa thức.
     * @return bậc của đa thức.
     */
    @Override
    public int degree() {
        return size - 1;
    }

    /**
     * Tính giá trị của đa thức khi biết giá trị của x.
     * @return giá trị của đa thức.
     */
    @Override
    public double evaluate(double x) {
        double result = 0;
        for (int i = 0; i < size; i++) {
            result += coefficients[i] * Math.pow(x, i);
        }
        return result;
    }

    /**
     * Lấy đạo hàm của đa thức.
     * @return Đa thức kiểu ArrayPolynomial là đa thức đạo hàm của đa thức hiện tại.
     */
    @Override
    public ArrayPolynomial derivative() {
        ArrayPolynomial derivative = new ArrayPolynomial();
        for (int i = 1; i < size; i++) {
            derivative.insertAtEnd(coefficients[i] * i);
        }
        return derivative;
    }

    /**
     * Cộng một đa thức khác vào đa thức hiện tại.
     * @param another
     * @return đa thức mới là tổng hai đa thức.
     */
    public ArrayPolynomial plus(Polynomial another) {
        ArrayPolynomial result = new ArrayPolynomial();
        int maxSize = Math.max(this.size, another.degree() + 1);
        for (int i = 0; i < maxSize; i++) {
            double sum = this.coefficient(i) + another.coefficient(i);
            result.insertAtEnd(sum);
        }
        return result;
    }

    /**
     * Cộng một đa thức khác vào đa thức hiện tại.
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial plusTo(Polynomial another) {
        int maxSize = Math.max(this.size, another.degree() + 1);
        if (maxSize > coefficients.length) {
            coefficients = Arrays.copyOf(coefficients, maxSize);
        }
        for (int i = 0; i < maxSize; i++) {
            coefficients[i] = this.coefficient(i) + another.coefficient(i);
        }
        size = maxSize;
        return this;
    }

    /**
     * Trừ đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức mới là hiệu hai đa thức.
     */
    public ArrayPolynomial minus(Polynomial another) {
        ArrayPolynomial result = new ArrayPolynomial();
        int maxSize = Math.max(this.size, another.degree() + 1);
        for (int i = 0; i < maxSize; i++) {
            double difference = this.coefficient(i) - another.coefficient(i);
            result.insertAtEnd(difference);
        }
        return result;
    }

    /**
     * Trừ đa thức hiện tại cho đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial minusFrom(Polynomial another) {
        int maxSize = Math.max(this.size, another.degree() + 1);
        if (maxSize > coefficients.length) {
            coefficients = Arrays.copyOf(coefficients, maxSize);
        }
        for (int i = 0; i < maxSize; i++) {
            coefficients[i] = this.coefficient(i) - another.coefficient(i);
        }
        size = maxSize;
        return this;
    }

    /**
     * Nhân đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức mới là đa thức nhân của hai đa thức.
     */
    public ArrayPolynomial multiply(Polynomial another) {
        ArrayPolynomial result = new ArrayPolynomial();
        for (int i = 0; i <= this.degree() + another.degree(); i++) {
            result.insertAtEnd(0);
        }
        for (int i = 0; i <= this.degree(); i++) {
            for (int j = 0; j <= another.degree(); j++) {
                double product = this.coefficient(i) * another.coefficient(j);
                result.set(result.coefficient(i + j) + product, i + j);
            }
        }
        return result;
    }

    /**
     * Nhân đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial multiplyBy(Polynomial another) {
        ArrayPolynomial result = this.multiply(another);
        this.coefficients = result.coefficients;
        this.size = result.size;
        return this;
    }

    /**
     * Thêm kích thước để lưu đa thức khi cần thiết.
     */
    private void enlarge() {
        coefficients = Arrays.copyOf(coefficients, coefficients.length * 2);
    }
}
