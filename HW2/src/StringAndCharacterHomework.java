import java.util.Scanner;

public class StringAndCharacterHomework {
    private static Scanner scanner;

    //3.1Exchange Cipher
    public static String exchangeCipher(String inStr){
        StringBuilder result = new StringBuilder();
        inStr =  inStr.toUpperCase();
        int inStrLen = inStr.length();
        for (int i = 0; i < inStrLen; i++){
            char newChar = (char) ('Z'-inStr.charAt(i)+'A');
            result.append(newChar);
        }
        return result.toString();
    }
    public static void testExchangeCipher(){
        System.out.print("Enter a plaintext string: ");
        String inStr = scanner.next();
        System.out.print("The ciphertext string is: " + exchangeCipher(inStr));
    }




    public static void main(String[] args){
        scanner = new Scanner(System.in);
        testExchangeCipher();
    }

}
