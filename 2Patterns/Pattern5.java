
import java.util.*;

public class Pattern5 {

    public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
         int n=scn.nextInt();
         
        int row=1,nstars=1,nrow=n,nspaces=n/2;

        while(row<=nrow){
            // work for each row
            // spaces
            for(int i=1;i<=nspaces;i++){
                System.out.print("\t");
            }

            // stars
            for(int i=1;i<=nstars;i++){
                System.out.print("*\t");
            }

            // line change
            System.out.println();

            // preparations for next row
            if(row<=n/2){
                nspaces=nspaces-1;
                nstars=nstars+2;
            }else{
                nspaces=nspaces+1;
                nstars=nstars-2;
            }

            row++;
        }

    }
}

