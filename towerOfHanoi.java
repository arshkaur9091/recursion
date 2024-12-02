import java.util.*;

public class TaworOfHanoi {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number n: ");
        int n = scn.nextInt();

        taworOfHanoi(n, "S", "H", "D");
      
    }

    public static void taworOfHanoi(int n, String src, String helper, String destination) {
      if(n==1){
        System.out.println("transfer disk "+ n + " from "+ src + " to " + destination);
        return;
      }
      taworOfHanoi(n-1, src, destination,helper);
      System.out.println("transfer disk "+ n + " from "+ src + " to " + destination);
      taworOfHanoi(n-1 , helper,src, destination);
    }
}

// time complexity O(2^n -1) ~ o(2^n)