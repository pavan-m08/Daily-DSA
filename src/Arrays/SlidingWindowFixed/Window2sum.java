/*Question 1: Sum of Every Window
Given an array, print the sum of every consecutive subarray of size k.

Input:
int[] arr = {1, 2, 3, 4, 5};
int k = 2;

Expected output:
3
5
7
9

 */
package Arrays.SlidingWindowFixed;
import java.util.Scanner;

public class Window2sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the  size of window");
        int k=sc.nextInt();
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        System.out.print(sum+" ");
        for(int i=k;i<arr.length;i++){
            sum-=arr[i-k];
            sum+=arr[i];
            System.out.print(sum+ " ");

        }
    }
}
