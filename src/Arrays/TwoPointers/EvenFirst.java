package Arrays.TwoPointers;
import java.util.*;
public class EvenFirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        System.out.println("Enter the elements in the array");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int right=n-1;
        int left=0;
        while(left<right){
            if(arr[left]%2==0){
                left++;

            }
            else if(arr[right]%2!=0){
                right--;
            }else{
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;

            }


        }
        System.out.println(Arrays.toString(arr));
    }
}
