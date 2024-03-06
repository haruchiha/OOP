import java.util.Scanner;

public class StringAndCharacterExercise {
    private static Scanner scanner;   // bien toan cuc

    //1.1 ReverseString
    public static String reverseString(String inStr) {
        StringBuilder result = new StringBuilder();
        int intStrLen = inStr.length();
        for (int charIdx = intStrLen - 1; charIdx >= 0; charIdx--) {
            result.append(inStr.charAt(charIdx));
        }
        return result.toString();
    }

    public static void testReverseString() {
        // Enter the String input:
        String inStr = scanner.nextLine();

        System.out.println("Enter a String: " + inStr);
        // reverseString(input)
        String result = reverseString(inStr);
        // print
        System.out.println("The reverse of the String " + inStr + " is " + result);
    }

    //1.2
    public static int countNumber(String originString){
        int numOfNumber = 0;
        for (int i = 0; i <= originString.length(); i++){
            if (originString.charAt(i) > '0' && originString.charAt(i) < '9')
                numOfNumber++;
        }
        return numOfNumber;
    }

//    public static int countVowel(String originString){
//        int numOfVowel = 0;
//        originString = originString.toUpperCase();
//        for (int i = 0; i <= originString.length(); i++){
//            if (originString.charAt(i) > '' && originString.charAt(i) < '9')
//
//        }
//    }

    //1.3 PhoneKeyPad
    public static String phoneKeyPad(String inStr) {
        int inStrLen = inStr.length();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < inStrLen; i++) {
            switch (inStr.charAt(i)) {
                case 'a':
                case 'b':
                case 'c':
                    result.append(2);
                    break;
                case 'd':
                case 'e':
                case 'f':
                    result.append(3);
                    break;
                case 'g':
                case 'h':
                case 'i':
                    result.append(4);
                case 'j':
                case 'k':
                case 'l':
                    result.append(55);
                    break;
                case 'm':
                case 'n':
                case 'o':
                    result.append(6);
                    break;
                case 'p':
                case 'q':
                case 'r':
                case 's':
                    result.append(7);
                    break;
                case 't':
                case 'u':
                case 'v':
                    result.append(8);
                    break;
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    result.append(9);
                    break;
                case ' ':
                    result.append(0);
                default: {
                    break;
                }
            }
        }
        return result.toString();
    }
    public static void testPhoneKeyPad () {
        // Enter the String input:
        String inStr = scanner.next().toLowerCase();

        System.out.println("Enter a String: " + inStr);
        // reverseString(input)
        String result = phoneKeyPad(inStr);
        // print
        System.out.println("The phone number is:" + result);
    }

    //1.4 Caesar’s Code
    public static String cipherCaesarCode(String inStr){
        int inStrLen = inStr.length();
        String inString = inStr.toUpperCase();
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < inStrLen; i++){
            char charCaesar = inString.charAt(i);
            charCaesar += 3;
            result.append(charCaesar);
        }
        return result.toString();
    }

    public static void testCipherCaesarCode(){
        //enter the string
        String inStr = scanner.next();
        System.out.println("Enter a plaintext string: " + inStr);
        String result = cipherCaesarCode(inStr);
        System.out.println("The ciphertext string is:" + result);

    }

    //1.5 Decipher Caesar’s Code
    public static String decipherCaesarCode(String inStr){
        int inStrLen = inStr.length();
        String inString = inStr.toUpperCase();
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < inStrLen; i++){
            char charCaesar = inString.charAt(i);
            charCaesar -= 3 ;
            result.append(charCaesar);
        }
        return result.toString();
    }

    public static void testDecipherCaesarCode(){
        //enter the string
        String inStr = scanner.next();
        System.out.println("Enter a ciphertext string: " + inStr);
        String result = decipherCaesarCode(inStr);
        System.out.println("The plaintext string is:" + result);
    }

    //1.6 CheckHexString
    public static boolean isHexString(String hexStr){
        int hexStrLen = hexStr.length();
        hexStr.toUpperCase();

        for (int i = 0; i < hexStrLen; i++){
            char inChar = hexStr.charAt(i);
            if (!((inChar >= '0' && inChar <= '9') || (inChar >= 'A' && inChar <= 'F'))){
                return false;
            }
        }
        return true;
    }

    public static void testHexString(){
        String hexStr = scanner.next();
        System.out.println("Enter a hex string: " + hexStr);
        if (isHexString(hexStr)){
            System.out.println(hexStr + " is a hex string");
        }
        else
            System.out.println(hexStr + " is not a hex string");
    }

    //1.7 BinaryToDecimal
    public static int binaryToDecimal(String binStr){
        int result = 0;
        int temp = 1;
        for (int i = binStr.length()-1; i >= 0; i--){
            int digit = binStr.charAt(i) - '0'; // Convert character to integer value
            result += digit * temp; // Accumulate the contribution of the current digit
            temp *= 2;
//            result = ((int) binStr.charAt(i)-48)*temp;
//            temp *= 2;
        }
        return result;
    }

    public static boolean isBinary(String binStr){
        for (int i = 0; i < binStr.length(); i++) {
            char inChar = binStr.charAt(i);
            if (!(inChar == '0' || inChar == '1')) {
                return false;
            }
        }
        return true;
    }

    public static void testBinaryToDecimal(){
        String binStr = scanner.next();
        System.out.println("Enter the Binary string: " + binStr);
        if (isBinary(binStr)){
            System.out.println("The equivalent decimal number for binary " + binStr + " is " + binaryToDecimal(binStr));
        }
        else
            System.out.println("Error: invalid binary string " + binStr);
    }

    //1.8 HexadecimalToDecimal
    public static int hexadecimalToDecimal(String inStr) {
        int inStrLeg = inStr.length();
        int decimalNum = 0;
        for (int charIdx = 0; charIdx < inStrLeg; charIdx++) {
            char inChar = inStr.charAt(charIdx);
            int powHex = (int) Math.pow(16, inStrLeg - charIdx - 1);
            if (inChar >= '0' && inChar <= '9') {
                decimalNum += powHex * (inChar - 48);
            } else {
                decimalNum += (powHex * (inChar - 87));
            }
        }
        return decimalNum;
    }

    public static void testHexadecimalToDecimal() {
        System.out.print("Enter a Hexadecimal string: ");
        String inStr = scanner.next().toLowerCase();
        boolean check = isHexString(inStr);
        if (!check) {
            System.out.println("error: invalid hexadecimal string \"" + inStr + "\"");
        } else {
            int decimalNum = hexadecimalToDecimal(inStr);
            System.out.println("The equivalent decimal number for hexadecimal \"" + inStr + "\" is: " + decimalNum);
        }
    }

    //1.9 OctalToDecimal
    public static int octalToDecimal(String inStr) {
        int inStrLeg = inStr.length();
        int decimalNum = 0;
        for (int charIdx = 0; charIdx < inStrLeg; charIdx++) {
            decimalNum += (Math.pow(8, inStrLeg - charIdx - 1) * (inStr.charAt(charIdx) - 48));
        }
        return decimalNum;
    }

    public static void testOctalToDecimal() {
        System.out.print("Enter a Octal string: ");
        String inStr = scanner.next();
        boolean check = true;
        for (int charIdx = 0; charIdx < inStr.length(); charIdx++) {
            if (!(inStr.charAt(charIdx) >= '0' && inStr.charAt(charIdx) <= '7')) {
                check = false;
                break;
            }
        }
        if (!check) {
            System.out.println("error: invalid octal string \"" + inStr + "\"");
        } else {
            int decimalNum = octalToDecimal(inStr);
            System.out.println("The equivalent decimal number \"" + inStr + "\" is: " + decimalNum);
        }
    }

    //chuyen he co so bat ky sang co so 10
    public static int evaluatPolyUsingIterativeAlgorithm(int[] poly, int x){
        int polyValue = 0;
        int term = 1;
        for (int i = 0; i < poly.length; i++){
            polyValue += poly[i]*term;
            term *= x;
        }
        return polyValue;
    }

    public static int evaluatePolyUsingHornerAlogrithm(int[] poly, int x){
        int polyValue = 0;
        for (int i = 0; i < poly.length; i++){
            polyValue = polyValue * x + poly[i];
        }
        return polyValue;
    }
    public static void main (String[]args){
        scanner = new Scanner(System.in);
        testReverseString();
        testPhoneKeyPad();
        testCipherCaesarCode();
        testDecipherCaesarCode();
        testHexString();
        testBinaryToDecimal();
        testHexadecimalToDecimal();
        testOctalToDecimal();
    }

}