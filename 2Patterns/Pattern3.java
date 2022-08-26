
import java.util.*;

public class Pattern3 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n=scn.nextInt();
        for(int i=1;i<=n;i++){
            int nstars=i;
            int nspaces=n-i;
            // spaces
            for(int j=1;j<=nspaces;j++){
                System.out.print("\t");
            }
            for(int j=1;j<=nstars;j++){
                System.out.print("*\t");
            }
            // line change
            System.out.println();
        }
    }
}
