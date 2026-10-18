package Arrays.TwoPointers;
import java.util.Arrays;
import java.util.Scanner;
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter th esize of thearray ");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter the elements of the array ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort (arr);
        System.out.println("Sorted Array"+Arrays.toString(arr));
        int i=0;
        int s=1;

        while(s<n){
            if(arr[i]==arr[s]){
                s++;

            }
            else {
                i++;
                arr[i]=arr[s];
                s++;
            }
//          s++;

        }
        int[] result = new int[i + 1];

        for (int j = 0; j < result.length; j++) {
            result[j] = arr[j];
        }

        System.out.println(Arrays.toString(arr));



    }
}
