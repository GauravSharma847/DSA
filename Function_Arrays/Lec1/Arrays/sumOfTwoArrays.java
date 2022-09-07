import java.io.*;
import java.util.*;

public class sumOfTwoArrays {

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
        int[] sumArr = new int[n1 > n2 ? n1 : n2];

        int carry = 0;
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = sumArr.length - 1;

        while (k >= 0) {
            int digit = carry;

            if (i >= 0) {
                digit += arr1[i];
            }

            if (j >= 0) {
                digit += arr2[j];
            }

            carry = digit / 10;
            digit = digit % 10;

            sumArr[k] = digit;

            i--;
            j--;
            k--;

        }

        if (carry != 0) {
            System.out.println(carry);
        }

        for (int val : sumArr) {
            System.out.println(val);
        }
    }
}
