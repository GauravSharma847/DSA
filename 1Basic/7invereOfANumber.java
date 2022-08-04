import java.util.*;
public class 7invereOfANumber {
public static void main(String[] args) {
  // write your code here  
    Scanner scn = new Scanner(System.in);
    int num = scn.nextInt();
    int inverse = 0;
    int op = 1;
    while(num != 0){
      int rem = num % 10;
      int id = op;
      int ip = rem;

      inverse = inverse + id * (int)Math.pow(10,ip - 1);

      num = num / 10;
      op++;
    }
    System.out.println(inverse);
  }
}

