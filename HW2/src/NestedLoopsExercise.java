import java.util.Scanner;

public class NestedLoopsExercise {
    private static Scanner scanner;

    //2.1 square pattern
    public static void squarePattern(int n){
        for (int row = 1; row <= n; row++){
            for (int col = 1; col <= n; col++){
                System.out.print("# ");
            }
            System.out.println();
        }
    }
    public static void testSquarePatter(){
        System.out.print("Enter the size: ");
        int n = scanner.nextInt();
        squarePattern(n);

    }

    //2.2CheckerPattern
    public static void checkerPattern(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row % 2 == 0) {
                    System.out.print(" #");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }
    public static void testCheckPattern(){
        System.out.print("Enter the size: ");
        int n = scanner.nextInt();
        checkerPattern(n);
    }

    //2.3 Time table
    public static void timeTable(int n){

    }

    //2.4 Triangular Pattern
    public static void triangularPatternA(int n){
        for (int row = 1; row <= n; row++){
            for (int col = 1; col <= n; col++){
                if (row >= col)
                    System.out.print("#");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void triangularPatternB(int n){
        for (int row = 1; row <= n; row++){
            for (int col = 1; col <= n; col++){
                if (row + col <= n + 1)
                    System.out.print("#");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void triangularPatternC(int n){
        for (int row = 1; row <= n; row++){
            for (int col = 1; col <= n; col++){
                if (row <= col)
                    System.out.print("#");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void triangularPatternD(int n){
        for (int row = 1; row <= n; row++){
            for (int col = 1; col <= n; col++){
                if (row + col >= n + 1)
                    System.out.print("#");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void testTriangularPattern(){
        System.out.print("Enter the size: ");
        int n = scanner.nextInt();
        System.out.println("triangularPatternA");
        triangularPatternA(n);
        System.out.println("triangularPatterB");
        triangularPatternB(n);
        System.out.println("triangularPatternC");
        triangularPatternC(n);
        System.out.println("triangularPatternD");
        triangularPatternD(n);
    }

    //2.5 Box Pattern
    public static void boxPatternA(int n){
        for (int row = 1; row <= n; row++){
            for (int col = 1; col <= n; col++){
                if (row == 1 || row == n|| col == 1|| col == n)
                    System.out.print("#");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void boxPatternB(int n){
        for (int row = 1; row <= n; row++){
            for (int col = 1; col <= n; col++){
                if (row == 1 || row == n|| row == col)
                    System.out.print("#");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void boxPatternC(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row == 1 || row == n || row == n - col)
                    System.out.print("#");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void boxPatternD(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row == 1 || row == n || row == col || row == n - col)
                    System.out.print("#");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
        public static void testBoxPattern(){
        System.out.print("Enter the size: ");
        int n = scanner.nextInt();
        System.out.println("BoxPattern A:");
        boxPatternA(n);
        System.out.println("BoxPattern B:");
        boxPatternB(n);
        System.out.println("BoxPattern C:");
        boxPatternC(n);
        System.out.println("BoxPattern D:");
        boxPatternD(n);
    }

    //2.6 Hill Parttern
    public static void hillParttetnA(int n){
        for (int row = 1; row <= n; row++){
            for (int col = 1; col <= n; col++){

            }
        }
    }

    public static void main(String[] args){
        scanner = new Scanner(System.in);
        testSquarePatter();
        testCheckPattern();
        testTriangularPattern();
        testBoxPattern();
    }

}
