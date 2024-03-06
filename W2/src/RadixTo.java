import com.sun.security.auth.UnixNumericGroupPrincipal;

public class RadixTo {
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

    public static int radixNToDecimal(String number, int radix){
        if (!isValidNumber(number, radix))
            return Integer.MIN_VALUE;

        final String DIGITS = "0123456789abcdef";
        int decimal = 0;
        for (int i = 0; i < number.length(); i++){
            decimal = decimal * radix + DIGITS.indexOf(number.charAt(i));
        }
        return decimal;
    }

    public static boolean isValidNumber(String number, int radix){
        final String DIGITS = "0123456789abcdef";
        for (int i = 0; i < number.length(); i++){
            if ((DIGITS.indexOf(number.charAt(i)) < 0)
                    || (DIGITS.indexOf(number.charAt(i)) >= radix)){
                return false;
            }
        }
        return true;
    }

    public static int HexadecimalToDecimal(String number){
        return radixNToDecimal(number, 16);
    }

    public static int radix7ToDecimal(String number){
        return radixNToDecimal(number, 7);
    }
}
