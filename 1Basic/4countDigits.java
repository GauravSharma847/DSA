
public class 4countDigits {
    public static void main(String[] args) {
        // write your code here  
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int count = 0;
        while(num != 0){
          num = num / 10;
          count++;
        }
        
        System.out.println(count);
    }
}    

