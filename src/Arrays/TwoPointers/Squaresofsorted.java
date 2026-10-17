package Arrays.TwoPointers;
import java.util.*;
public class Squaresofsorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lenght of the array 1");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array 2");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int i = 0;
        while (i < n) {
            arr[i] = arr[i] * arr[i];
            i++;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Sorted array after finding sqares");
         Arrays.sort(arr);
         System.out.println(Arrays.toString(arr));

    }
}

