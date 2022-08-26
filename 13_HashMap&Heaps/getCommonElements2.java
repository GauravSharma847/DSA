
import java.io.*;
import java.rmi.Remote;
import java.util.*;
public class getCommonElements2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n]; 
        for(int i = 0 ; i < arr1.length ; i++){

            arr1[i] = sc.nextInt();
        }    

        int m  = sc.nextInt();
        int[] arr2 = new int[m];
        for(int i = 0 ; i < arr2.length ; i++){
            arr2[i] = sc.nextInt();
        }    

        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int val : arr1){
            if(hm.containsKey(val)){
                int of = hm.get(val);
                int nf = of + 1;
                hm.put(val,nf);
            }else{
                hm.put(val,1);
            }
        }

        for(int val : arr2){
            if(hm.containsKey(val) && hm.get(val) > 0){
                System.out.println(val);
                int of = hm.get(val);
                int nf = of - 1;
                hm.put (val,nf);  
            }
        }
    }
    

}

