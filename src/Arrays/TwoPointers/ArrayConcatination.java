package Arrays.TwoPointers;
import java.util.*;
public class ArrayConcatination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int i=0;
        int []arr1=new int[arr.length+arr.length];
        while(i<arr.length){
            arr1[i]=arr[i];
            arr1[i+arr.length]=arr[i];
            i++;

        }
        System.out.print("The concatenation of the array : "+Arrays.toString(arr1));
    }
}
