import java.util
import java.util.*;
public class takingInput{
    public static void main(String[] args) {
    
    Scanner scn = new Scanner(System.in);
    int n = Integer.parseInt(scn.nextLine());    // if u want both integer and string in same program then use this Integer.parseInt()
    // it is a bug as if we dont do this int will be entered as string

    String name = scn.nextLine();


    System.out.println("Dear "+name+" Here is the counting ");
    for(int i = 0 ; i < n ; i++){
        System.out.println(i);

    }
}