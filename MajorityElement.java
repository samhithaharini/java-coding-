import java.util.*;
public class MajorityElement {
        public static int findMajority(int[] nums) {
        int candidate=0;
        int count=0;
        for (int num:nums) {
            if (count==0) {
                candidate=num;
            }
            count+=(num==candidate)?1:-1;
        }
        count=0;
        for(int num:nums) {
            if(num==candidate) count++;
        }
        return (count>nums.length / 2) ? candidate : -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int majority=findMajority(arr);
        System.out.println(majority);
    }
}
