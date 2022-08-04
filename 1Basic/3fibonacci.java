import java.util.*;

public class 3fibonacci {
  public static void main(String[] args) {
      // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

     
    int first = 0;
    int second = 1; 
    int i = 1;
    while(i <= n){
      System.out.println(first);
      int third = first + second;
      first = second;
      second = third;
      i++;
    }
  }
}

