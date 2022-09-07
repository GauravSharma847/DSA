import java.io.*;
import java.util.*;
public class diffOfTwoArrays {



public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        int[] DiffArr = new int[n2];
        int carry = 0;

        int i = arr1.length - 1;    
        int j = arr2.length - 1;    
        int k = DiffArr.length - 1;    


        while( k >= 0){
            int digit = 0;
            int alv = i >= 0 ? arr1[i] : 0;
            
            if(arr2[j] + carry >= alv){
                digit = arr2[j] + carry - alv;
                carry = 0;
            } else {
                digit = arr2[j] + carry + 10 - alv;
                carry = -1;
            }

            DiffArr[k] = digit;

            i--;
            j--;
            k--;
        }

        int indx = 0;
        while(indx < DiffArr.length){
            if(DiffArr[indx] == 0){
                indx++;
            } else {
                break;
            }
        }

        while(indx < DiffArr.length){
            System.out.println(DiffArr[indx]);
            indx++;
        }
    }
}

