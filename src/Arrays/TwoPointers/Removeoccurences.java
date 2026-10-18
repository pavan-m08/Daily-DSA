package Arrays.TwoPointers;
import java.util.*;
public class Removeoccurences {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("enter the array elemets");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be removed");
        int ele=sc.nextInt();
        int i=0;
        int j=0;

        while (i < n) {
            if (arr[i] != ele) {
                arr[j] = arr[i];
                j++;
            }
            i++;
        }
        int [] re=new int[j];
        for(int k=0;k<j;k++){
            re[k]=arr[k];
        }
        System.out.println(Arrays.toString(re));
    }
}
