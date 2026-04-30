import java.util.*;
public class SmallestPosMissing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        int pos=1;
        while(true){
            boolean found = false;
            for(int i=0;i<n; i++) {
                if(arr[i]==pos) {
                    found=true;
                    break;
                }
            }
            if(found) {
                pos++;
            } else {
                break;
            }
        }
        System.out.println(pos);
    }
}