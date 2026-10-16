package Arrays.TwoPointers;
import java.util.*;
public class Zerostoend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int i=0;int j=n-1;
        int temp;
        while(i<j){
            if(arr[i]!=0){
                i++;
            }
            if(arr[j]==0){
                j--;
            }
            else{
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }

        }
        System.out.println(Arrays.toString(arr));
        sc.close();

    }
}
