import java.util.*;

public class 11pythagoreanTriplet {

  	public static void main(String[] args) {
  	  	Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();

		int max = 0;

		if( a > b && a > c){
			max = a;
		}else if( b > a && b > c){
			max = b;
		}else{
			max = c;
		}

		int pyth = a * a + b * b + c * c - max * max;

		if(pyth == max * max){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
  	}
}

