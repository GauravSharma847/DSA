package Arrays;

import java.io.*;
import java.util.*;
public class findElementInAnArray {



    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = scn.nextInt();
        }
        int d = scn.nextInt();
        int index = findElementIndex(arr,n,d);
        System.out.println(index);

    }

    public static int findElementIndex(int arr[], int n,int d){
        int index  = -1;
        for(int i = 0 ; i < n ; i++){
            if(arr[i] == d){
                index = i;
                break;
            }else{
                continue;
            }

        }
 
        return index;
    }
}

