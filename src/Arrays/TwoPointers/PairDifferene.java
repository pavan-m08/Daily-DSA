package Arrays.TwoPointers;
import java.util.*;
public class PairDifferene {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the elements difference");
        int dif=sc.nextInt();
        int i=0,j=1;
        while(j<n){
            if(arr[j]-arr[i]==dif){
                System.out.println(arr[i]+" "+arr[j]);
                i++;
                j++;
            }
            else{
                System.out.println("Not found");
            }

        }


    }
}
