import java.util.*;
import java.util.Scanner;       
public class 8rotateANumber {
    public static void main(String[] args) {
         // write your code here  
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int nod = 0;
        int temp = n;
        while(temp > 0){
            temp = temp / 10;
            nod++;
        }
        k = k % nod;
        if(k < 0){
            k += nod;
        }
                
        int splitHelper = (int)Math.pow(10,k);
        int p1 = n / splitHelper;
        int p2 = n % splitHelper;
        int rotNumber = 0;
                
        int mergeHelper = (int)Math.pow(10,nod - k);
        rotNumber = (p2 * mergeHelper) + p1;
        
                 
        System.out.println(rotNumber);
    }
}
