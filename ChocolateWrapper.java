//package Placement Class;
import java.util.Scanner;
public class ChocolateWrapper{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int c=n;
        while(n>=3){
            int ex=n/3;
            c+=ex;
            n=ex+n%3;
        }
        System.out.println(c);
    }
}