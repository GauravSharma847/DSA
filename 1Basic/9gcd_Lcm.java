import java.util.*;
public class 9gcd_Lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int product = n1 * n2;
        int lcm = 0;
        int gcd = 0;
        while(n1 % n2 != 0){
            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;

        }
        gcd = n2;
        lcm = product / gcd;
        System.out.println("GCD is " + gcd + " lcm is " + lcm);
    }
}
