package hus.oop.integration;

import java.util.ArrayList;
import java.util.List;

public class ListPolynomial extends AbstractPolynomial {
    private List<Double> coefficients;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public ListPolynomial() {
        this.coefficients = new ArrayList<>();
    }

    /**
     * Lấy hệ số của đa thức tại vị trí index.
     * @return hệ số tại vị trí index
     */
    @Override
    public double coefficient(int index) {
        if (index < 0 || index >= coefficients.size()) {
            return 0;
        }
        return coefficients.get(index);
    }

    /**
     * Lấy các hệ số của đa thức.
     * @return mảng các hệ số
     */
    @Override
    public double[] coefficients() {
        double[] result = new double[coefficients.size()];
        for (int i = 0; i < coefficients.size(); i++) {
            result[i] = coefficients.get(i);
        }
        return result;
    }

    /**
     * Thêm phần tử có hệ số coefficient vào đầu đa thức.
     * @param coefficient
     * @return đa thức hiện tại
     */
    public ListPolynomial insertAtStart(double coefficient) {
        coefficients.add(0, coefficient);
        return this;
    }

    /**
     * Thêm phần tử có hệ số coefficient vào cuối đa thức.
     * @param coefficient
     * @return đa thức hiện tại
     */
    public ListPolynomial insertAtEnd(double coefficient) {
        coefficients.add(coefficient);
        return this;
    }

    /**
     * Thêm phần tử có hệ số coefficient vào vị trí index.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại
     */
    public ListPolynomial insertAtPosition(double coefficient, int index) {
        coefficients.add(index, coefficient);
        return this;
    }

    /**
     * Sửa hệ số của phần tử index là coefficient.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại
     */
    public ListPolynomial set(double coefficient, int index) {
        if (index >= 0 && index < coefficients.size()) {
            coefficients.set(index, coefficient);
        }
        return this;
    }

    /**
     * Lấy ra bậc của đa thức.
     * @return bậc của đa thức
     */
    @Override
    public int degree() {
        return coefficients.size() - 1;
    }

    /**
     * Tính giá trị của đa thức khi biết giá trị của x.
     * @return giá trị của đa thức
     */
    @Override
    public double evaluate(double x) {
        double result = 0;
        for (int i = 0; i < coefficients.size(); i++) {
            result += coefficients.get(i) * Math.pow(x, i);
        }
        return result;
    }

    /**
     * Lấy đạo hàm của đa thức.
     * @return Đa thức kiểu ListPolynomial là đa thức đạo hàm của đa thức ban đầu.
     */
    @Override
    public ListPolynomial derivative() {
        ListPolynomial derivative = new ListPolynomial();
        for (int i = 1; i < coefficients.size(); i++) {
            derivative.insertAtEnd(coefficients.get(i) * i);
        }
        return derivative;
    }

    /**
     * Cộng đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức mới là tổng hai đa thức
     */
    public ListPolynomial plus(Polynomial another) {
        ListPolynomial result = new ListPolynomial();
        int maxDegree = Math.max(this.degree(), another.degree());
        for (int i = 0; i <= maxDegree; i++) {
            double sum = this.coefficient(i) + another.coefficient(i);
            result.insertAtEnd(sum);
        }
        return result;
    }

    /**
     * Cộng đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại
     */
    public ListPolynomial plusTo(Polynomial another) {
        int maxDegree = Math.max(this.degree(), another.degree());
        for (int i = 0; i <= maxDegree; i++) {
            double sum = this.coefficient(i) + another.coefficient(i);
            if (i < coefficients.size()) {
                coefficients.set(i, sum);
            } else {
                coefficients.add(sum);
            }
        }
        return this;
    }

    /**
     * Trừ đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức mới là hiệu hai đa thức
     */
    public ListPolynomial minus(Polynomial another) {
        ListPolynomial result = new ListPolynomial();
        int maxDegree = Math.max(this.degree(), another.degree());
        for (int i = 0; i <= maxDegree; i++) {
            double difference = this.coefficient(i) - another.coefficient(i);
            result.insertAtEnd(difference);
        }
        return result;
    }

    /**
     * Trừ đa thức hiện tại cho đa thức khác.
     * @param another
     * @return đa thức hiện tại
     */
    public ListPolynomial minusFrom(Polynomial another) {
        int maxDegree = Math.max(this.degree(), another.degree());
        for (int i = 0; i <= maxDegree; i++) {
            double difference = this.coefficient(i) - another.coefficient(i);
            if (i < coefficients.size()) {
                coefficients.set(i, difference);
            } else {
                coefficients.add(difference);
            }
        }
        return this;
    }

    /**
     * Nhân đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức mới là đa thức nhân của hai đa thức
     */
    public ListPolynomial multiply(Polynomial another) {
        ListPolynomial result = new ListPolynomial();
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
     * @return đa thức hiện tại
     */
    public ListPolynomial multiplyBy(Polynomial another) {
        ListPolynomial result = this.multiply(another);
        this.coefficients = result.coefficients;
        return this;
    }
}
