package hus.oop.integration;

public class IntegrationCalculatorTestDrive {
    public static void main(String[] args) {
        /*
         TODO

         - Viết chương trình test các chức năng của đa thức và các phương pháp tính tích phân.

         - Lưu kết quả chạy chương trình vào file text có tên <TenSinhVien_MaSinhVien_Integration>.txt
           (ví dụ, NguyenVanA_123456_Integration.txt)
         - Nộp file kết quả chạy chương trình (file text trên) cùng với các file source code.
         */
        testPolynomial();
        testIntegrationCalculator();
    }

    public static void testPolynomial() {
        /*
         TODO

         - Tạo ra các đá thức kiểu ArrayPolynomial và ListPolynomial.
         - Viết chương trình test các chức năng của đa thức (thêm phần tử vào đa thức, xóa phần tử trong đa thức,
           sửa hệ số tại một phần tử, cộng 2 đa thức, trừ 2 đa thức, nhân 2 đa thức, tính giá trị của đa thức khi biết
           giá trị của x).
         - In kết quả ra terminal mỗi lần thực hiện các chức năng.
         */

        // Tạo ra các đa thức kiểu ArrayPolynomial và ListPolynomial
        ArrayPolynomial arrayPoly = new ArrayPolynomial();
        ListPolynomial listPoly = new ListPolynomial();

        // Thêm phần tử vào đa thức
        arrayPoly.insertAtEnd(2).insertAtEnd(3).insertAtEnd(4); // 2 + 3x + 4x^2
        listPoly.insertAtEnd(2).insertAtEnd(3).insertAtEnd(4);

        // In kết quả sau khi thêm phần tử
        System.out.println("ArrayPolynomial: " + arrayPoly);
        System.out.println("ListPolynomial: " + listPoly);

        // Sửa hệ số tại một phần tử
        arrayPoly.set(5, 1); // 2 + 5x + 4x^2
        listPoly.set(5, 1);

        // In kết quả sau khi sửa hệ số
        System.out.println("ArrayPolynomial (after set): " + arrayPoly);
        System.out.println("ListPolynomial (after set): " + listPoly);

        // Cộng 2 đa thức
        ArrayPolynomial arrayPoly2 = new ArrayPolynomial();
        arrayPoly2.insertAtEnd(1).insertAtEnd(1); // 1 + x
        ListPolynomial listPoly2 = new ListPolynomial();
        listPoly2.insertAtEnd(1).insertAtEnd(1);

        ArrayPolynomial sumArrayPoly = arrayPoly.plus(arrayPoly2);
        ListPolynomial sumListPoly = listPoly.plus(listPoly2);

        // In kết quả sau khi cộng 2 đa thức
        System.out.println("ArrayPolynomial (sum): " + sumArrayPoly);
        System.out.println("ListPolynomial (sum): " + sumListPoly);

        // Trừ 2 đa thức
        ArrayPolynomial diffArrayPoly = arrayPoly.minus(arrayPoly2);
        ListPolynomial diffListPoly = listPoly.minus(listPoly2);

        // In kết quả sau khi trừ 2 đa thức
        System.out.println("ArrayPolynomial (diff): " + diffArrayPoly);
        System.out.println("ListPolynomial (diff): " + diffListPoly);

        // Nhân 2 đa thức
        ArrayPolynomial prodArrayPoly = arrayPoly.multiply(arrayPoly2);
        ListPolynomial prodListPoly = listPoly.multiply(listPoly2);

        // In kết quả sau khi nhân 2 đa thức
        System.out.println("ArrayPolynomial (prod): " + prodArrayPoly);
        System.out.println("ListPolynomial (prod): " + prodListPoly);

        // Tính giá trị của đa thức khi biết giá trị của x
        double x = 2.0;
        double arrayPolyValue = arrayPoly.evaluate(x);
        double listPolyValue = listPoly.evaluate(x);

        // In kết quả giá trị của đa thức
        System.out.println("ArrayPolynomial (value at x=2): " + arrayPolyValue);
        System.out.println("ListPolynomial (value at x=2): " + listPolyValue);

    }

    public static void testIntegrationCalculator() {
        /*
         TODO

         - Tạo một đa thức.
         - Viết demo chương trình tính tích phân xác định của đa thức theo các phương pháp đã cho (MidpointRule, TrapezoidRule, SimpsonRule) sử dụng
           IntegrationCalculator. Các phương pháp tính tích phân có thể thay đổi ở thời gian chạy chương trình.
         - In ra thông tin phương pháp sử dụng, đa thức, và giá trị tích phân của đa thức.
         */
        // Tạo một đa thức
        ArrayPolynomial poly = new ArrayPolynomial();
        poly.insertAtEnd(1).insertAtEnd(0).insertAtEnd(1); // 1 + x^2

        // Tạo các phương pháp tích phân
        Integrator midpointRule = new MidpointRule(0.0001, 100);
        Integrator trapezoidRule = new TrapezoidRule(0.0001, 100);
        Integrator simpsonRule = new SimpsonRule(0.0001, 100);

        // Tạo đối tượng IntegrationCalculator với phương pháp MidpointRule
        IntegrationCalculator calculator = new IntegrationCalculator(midpointRule, poly);

        // Tính tích phân với MidpointRule
        double resultMidpoint = calculator.integrate(0, 1);
        System.out.println("MidpointRule - Polynomial: " + poly + ", Integral: " + resultMidpoint);

        // Đổi phương pháp tích phân sang TrapezoidRule
        calculator.setIntegrator(trapezoidRule);
        double resultTrapezoid = calculator.integrate(0, 1);
        System.out.println("TrapezoidRule - Polynomial: " + poly + ", Integral: " + resultTrapezoid);

        // Đổi phương pháp tích phân sang SimpsonRule
        calculator.setIntegrator(simpsonRule);
        double resultSimpson = calculator.integrate(0, 1);
        System.out.println("SimpsonRule - Polynomial: " + poly + ", Integral: " + resultSimpson);
    }
}
