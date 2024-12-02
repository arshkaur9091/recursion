import java.util.*;

public class Factorial {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scn.nextInt();

        int ans = factorial(n);
        System.out.print(ans);

    }

    public static int factorial(int n) {
        if(n==1 ||n==0){
          return 1;
        }
        int fact_nm1 = factorial(n-1);
        int fact_n = n* fact_nm1;
        return fact_n;
    }
}
