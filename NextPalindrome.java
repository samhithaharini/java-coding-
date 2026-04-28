import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
public class NextPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }
        String numStr = "";
        for (int d : input) {
            numStr = numStr + d;
        }
        BigInteger num = new BigInteger(numStr);
        num = num.add(BigInteger.ONE);
        while (!isPalindrome(num.toString())) {
            num = num.add(BigInteger.ONE);
        }
        String result = num.toString();
        int[] output = new int[result.length()];
        for (int i = 0; i < result.length(); i++) {
            output[i] = result.charAt(i) - '0';
        }
        System.out.println(Arrays.toString(output));
    }

    static boolean isPalindrome(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        return s.equals(rev);
    }
}