import java.io.*;
import java.util.*;
public class creatingPQ {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();   // by deafault it gives lower value as high priority
        
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());   // this will give higher values as higher priority

        int[] ranks = {22,33,1,5,44,99};
        
        for(int val : ranks){
            pq.add(val);
        }
        while(pq.size() > 0){
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
