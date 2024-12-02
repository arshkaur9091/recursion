import java.util.*;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scn.nextInt();

        int a=0, b=1;
        System.out.println("Fibonacci numbers are:");
        System.out.println(a);
        System.out.println(b);

        fibonacci(a, b, n-2);

    }

    public static void fibonacci(int a, int b, int n) {
      if(n==0){
        return;
      }
        int c= a+b;
        System.out.println(c);
        fibonacci(b,c,n-1);

    }
}
