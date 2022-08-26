
import java.util.*;

public class Pattern6 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int row=1,nstars=(n+1)/2,nspaces=1,nrow=n;
        while(row<=nrow){
            for(int i=1;i<=nstars;i++){
                System.out.print("*\t");
            }

            for(int i=1;i<=nspaces;i++){
                System.out.print("\t");
            }

            for(int i=1;i<=nstars;i++){
                System.out.print("*\t");
            }

            System.out.println();

            if(row<=n/2){
                nspaces=nspaces+2;
                nstars=nstars-1;
            }else{
                nspaces=nspaces-2;
                nstars=nstars+1;
            }
            row++;
        }
        // write ur code here

    }
}
    

