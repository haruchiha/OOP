package hus.oop.integration;

public class TrapezoidRule implements Integrator {
    private double precision;
    private int maxIterations;

    public TrapezoidRule(double precision, int maxIterations) {
        this.precision = precision;
        this.maxIterations = maxIterations;
    }

    /**
     * Phương thức tính xấp xỉ giá trị tích phân. Giá trị xấp xỉ được chấp nhận nếu phép tính đạt độ chính xác đã cho,
     * hoặc có số vòng vượt quá ngưỡng quy định.
     * Độ chính xác được xác định như sau, chọn n0 tùy ý, sau đó tính I_n với n = n0, 2n0, 4n0, ...
     * Việc tính toán dừng lại khi |I_2n - In|/3 < eps (precision), hoặc số lần chia đôi vượt quá ngưỡng quy định (maxIterations).
     * @param poly
     * @param lower
     * @param upper
     * @return
     */
    @Override
    public double integrate(Polynomial poly, double lower, double upper) {
        int n0 = 1; // Starting with one interval
        double I_n = integrate(poly, lower, upper, n0);
        double I_2n;

        int iterations = 0;
        while (iterations < maxIterations) {
            n0 *= 2;
            I_2n = integrate(poly, lower, upper, n0);
            if (Math.abs(I_2n - I_n) / 3 < precision) {
                return I_2n;
            }
            I_n = I_2n;
            iterations++;
        }
        return I_n; // Return the best estimate after maxIterations
    }

    /**
     * Phương thức tính xấp xỉ giá trị tích phân với numOfSubIntervals khoảng phân hoạch đều.
     * @param poly
     * @param lower
     * @param upper
     * @param numOfSubIntervals
     * @return giá trị xấp xỉ giá trị tích phân.
     */
    private double integrate(Polynomial poly, double lower, double upper, int numOfSubIntervals) {
        double intervalWidth = (upper - lower) / numOfSubIntervals;
        double sum = 0.5 * (poly.evaluate(lower) + poly.evaluate(upper));

        for (int i = 1; i < numOfSubIntervals; i++) {
            double x = lower + i * intervalWidth;
            sum += poly.evaluate(x);
        }

        return intervalWidth * sum;
    }
}
