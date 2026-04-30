import java.util.*;
public class MinNoOfOp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        int sum=0;
        for(int i=0;i<n;i++) {
            if(arr[i]<min) {
                min=arr[i];
            }
            sum+=arr[i];
        }
        int t=min*n;
        int op=sum-t;
        System.out.println(op);
    }
}
