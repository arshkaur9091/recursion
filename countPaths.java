import java.util.*;

public class countPaths {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the starting index ie: (0,0): ");
        int i = scn.nextInt();
        int j = scn.nextInt();
        System.out.print("Enter the ending index ie: (3,4): ");
        int m = scn.nextInt();
        int n = scn.nextInt();

        int totalPaths= countPaths(i, j,n,m);
        System.out.println(totalPaths);

    }

    public static int countPaths(int i, int j, int n, int m) {

      if(i==n || j==m){
        return 0;
      }

      if(i== n-1 && j==m-1){
        return 1;
      }

      // downwards
      int downPaths = countPaths(i+1, j, n, m);

      // move right
      int rightPaths = countPaths(i, j+1, n, m);

      return downPaths + rightPaths;
    }
}
