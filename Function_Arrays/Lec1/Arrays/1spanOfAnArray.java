package Arrays;

import java.io.*;
import java.util.*;

public class spanOfAnArray {


    public static void main(String[] args) throws Exception {
    // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        int ans = spanOfArray(arr,n);
        System.out.println(ans);
    }

    public static int spanOfArray(int arr[], int n){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }

            if(arr[i] < min){
                min = arr[i];
            }
        }

        int d = max - min;
        return d;
    }


}

