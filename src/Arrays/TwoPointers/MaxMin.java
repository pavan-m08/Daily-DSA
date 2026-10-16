package Arrays.TwoPointers;
import java.util.Scanner;
public class MaxMin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int i=1;
        int min=arr[0];
        int max=arr[0];
        while(i<n){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
            i++;


        }
        System.out.println("MIN :  "+min+" MAX : "+max);

    }
}
