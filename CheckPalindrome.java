import java.util.Scanner;
public class CheckPalindrome {
    public static boolean isPalindrome(int n){
        int r=0;
        int t=n;
        while(t!=0){
            int d=t%10;
            r=r*10+d;
            t/=10;
        }
        if(r==n){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean isPal=isPalindrome(n);
        if(isPal){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}
