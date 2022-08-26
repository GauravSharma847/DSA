import java.util.*;
import java.lang.*;
import java.io.*;

public class kLargestElement {
    public static void main(String[] args) throws IOException {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        solve(n, num,k);
    }

    // -----------------------------------------------------
    // This is a functional problem. Only this function has to be written.
    // This function takes as input an array,n length of array and k.
    // It should print required output.
    public static void solve(int n, int[] arr,int k) {
        // Write your code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int v1 : arr) {
            if (pq.size() < k) {
                pq.add(v1);
            } else if (v1 > pq.peek()) {
                pq.remove();
                pq.add(v1);
            }
        }
        Stack<Integer> st = new Stack<>();
        while (pq.size() > 0) {
            st.push(pq.remove());
        }
        while (st.size() > 0) {
            System.out.print(st.pop() + " ");
        }
    }
}
