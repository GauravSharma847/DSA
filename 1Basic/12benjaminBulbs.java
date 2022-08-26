import java.util.*;

public class benjaminBulbs {

    
    public static void main(String[] args){
        // Write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // perfect squares have 2n + 1 factors

        for(int i = 1 ; i * i <= n ; i++){
            System.out.println(i*i);
        }
    }
}
