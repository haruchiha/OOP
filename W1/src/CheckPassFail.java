import java.util.Scanner;

public class CheckPassFail {
    public static int checkPassFail(int mark){
        System.out.println("the mark is " + mark);
        if (mark >= 50)
            System.out.println("PASS");
        else
            System.out.println("FAIL");
        System.out.println("DONE");
        return 0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int mark = sc.nextInt();
        checkPassFail(mark);

        sc.close();
    }
}
