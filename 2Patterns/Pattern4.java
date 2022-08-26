
import java.util.*;

public class Pattern4 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        // int n=scn.nextInt();
        // int sp=0,st=n;
        // for(int i=1;<=n;i++){
        //     System.out.println(sp+","+st);
        //     sp++;
        //     st--;
        //     System.out.println();
        // }
        int n =scn.nextInt();
        int sp=0,st=n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sp;j++){
                System.out.print("\t");
            }
            for(int j=1;j<=st;j++){
                System.out.print("*\t");
            }
            sp++;
            st--;
            System.out.println();
        }
    }
}

