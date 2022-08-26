package Functions;
import java.util.*;

public class anyBaseToAddition {
 
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getSum(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getSum(int b, int n1, int n2){
       // write ur code here
       int sum = 0;
      int dec1 = anyBaseToDecimal(n1, b);
    //   int sum1 = decimalToAnyBase(dec1, dB);
      int dec2 = anyBaseToDecimal(n2, b);

      int dec = dec1 + dec2;
    //   int sum2 = decimalToAnyBase(dec2, dB);
      sum = decimalToAnyBase(dec,b);
      return sum;
   }

   public static int decimalToAnyBase(int n, int b){
       // write code here
        int rv = 0;

        int p = 1;

        while(n > 0){
            int dig = n % b;
            n = n/b;

            rv += dig * p;
            p = p * 10;
        }
        return rv;
    }

    public static int anyBaseToDecimal(int n, int b){
      int ans = 0;
      int i = 0;
      while(n != 0){
         int rem = n % 10;
         n = n /10;
         ans += rem * (int)Math.pow(b, i++); 
      }
      return ans;
    }
  }

