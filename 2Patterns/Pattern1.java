
import java.util.*;

public class Pattern1 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n=scn.nextInt();
        for(int i=1;i<=n;i++){
            int nst=i;
            for(int j=1;j<=nst;j++){
                System.out.print("*\t");
            }
            System.out.println();
        }

    }
}
    
