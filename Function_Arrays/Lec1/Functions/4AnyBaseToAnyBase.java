package Functions;
import java.util.*;

public class AnyBaseToAnyBase {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int sourceBase = scn.nextInt();
    int destBase = scn.nextInt();

    int ans = anyBaseToAnyBase(n, sourceBase, destBase);
    System.out.println(ans);
  }

  public static int anyBaseToAnyBase(int n, int sB, int dB) {
    int dec = anyBaseToDecimal(n, sB);
    int ans = decimalToAnyBase(dec, dB);
    return ans;
  }

  public static int decimalToAnyBase(int n, int b) {
    // write code here
    int rv = 0;

    int p = 1;

    while (n > 0) {
      int dig = n % b;
      n = n / b;

      rv += dig * p;
      p = p * 10;
    }
    return rv;
  }

  public static int anyBaseToDecimal(int n, int b) {
    int ans = 0;
    int i = 0;
    while (n != 0) {
      int rem = n % 10;
      n = n / 10;
      ans += rem * (int) Math.pow(b, i++);
    }
    return ans;
  }

}