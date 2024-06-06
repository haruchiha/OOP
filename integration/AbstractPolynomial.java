package hus.oop.integration;

public abstract class AbstractPolynomial implements Polynomial {
    /**
     * Mô tả đa thức theo định dạng [a0 + a1x + a2x^2 + ... + anx^n]
     * @return String mô tả về đa thức.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        double[] coefficients = coefficients();
        for (int i = 0; i < coefficients.length; i++) {
            if (coefficients[i] != 0) {
                if (sb.length() > 0) {
                    sb.append(" + ");
                }
                sb.append(coefficients[i]);
                if (i > 0) {
                    sb.append("x");
                    if (i > 1) {
                        sb.append("^").append(i);
                    }
                }
            }
        }
        return sb.toString();
    }

    /**
     * Lấy đạo hàm đa thức.
     * @return mảng các phần tử là hệ số của đa thức đạo hàm.
     */
    public double[] differentiate() {
        double[] coefficients = coefficients();
        if (coefficients.length <= 1) {
            return new double[]{0};
        }
        double[] derivativeCoefficients = new double[coefficients.length - 1];
        for (int i = 1; i < coefficients.length; i++) {
            derivativeCoefficients[i - 1] = coefficients[i] * i;
        }
        return derivativeCoefficients;
    }

}
