package Arrays.TwoPointers;
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        char[] arr = new char[n];
        for (int i = 0; i < n; i++) {
            arr[i] = str.charAt(i);

        }
        int i=0, j = n - 1;
        while (i < j) {
            if(arr[i]!=arr[j]){
                System.out.print("not Palindrome");
            }
            i++;
            j--;




        }
        System.out.println("Palindrome");
    }
}
