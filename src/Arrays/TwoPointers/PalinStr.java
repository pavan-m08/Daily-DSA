package Arrays.TwoPointers;
import java.util.*;
public class PalinStr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        int i=0;
        int j=str.length()-1;
        while (i<j){
            if(str.charAt(i)!=str.charAt(j)){
                System.out.print("Not Palindrome");
            }
            i++;
            j--;

        }
        System.out.print("Palindrome");

    }
}
