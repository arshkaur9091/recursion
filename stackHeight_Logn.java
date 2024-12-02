import java.util.*;

public class CalPower {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number x: ");
        int x = scn.nextInt();
        System.out.print("Enter the number n: ");
        int n = scn.nextInt();

        int ans = calPower(x,n);
        System.out.print(ans);
    }

    public static int calPower(int x, int n) {
      if(x==0){ // base case 1
        return 0;
      }
      if(n==0){ // base case 2
        return 1;
      }

      // if n is even
      if(n%2 == 0){
        return calPower(x,n/2) * calPower(x, n/2);
      }
      else{
        return calPower(x,n/2)* calPower(x,n/2)* x;
      }
    }
}
