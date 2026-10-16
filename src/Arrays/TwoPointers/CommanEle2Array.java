package Arrays.TwoPointers;
import java.util.*;
public class CommanEle2Array {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array 1");
        int n=sc.nextInt();
        System.out.println("Enter the size of the array 2");
        int m=sc.nextInt();
        int []arr1=new int[n];
        int []arr2=new int[m];
        System.out.println("Enter the elements of the array 1");
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the elements of the array 2");
        for(int i=0;i<m;i++){
            arr2[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr1[i]==arr2[j]){
                    System.out.print(arr1[i]+" ");

                }
            }
        }
    }
}
