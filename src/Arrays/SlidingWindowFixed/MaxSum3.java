package Arrays.SlidingWindowFixed;
import java.util.*;
public class MaxSum3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of arrays");
        int n=sc.nextInt();
        System.out.println("enter the size of the slide consecutive elements");
        int k=sc.nextInt();
        int [] arr =new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int maxsum =sum;
        for(int i=k;i<=arr.length-1;i++){
            sum-=arr[i-k];
            sum+=arr[i];
            maxsum=Math.max(maxsum,sum);
        }
        System.out.println(maxsum);

    }
}
