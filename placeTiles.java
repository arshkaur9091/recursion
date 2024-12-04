
import java.util.*;

public class placeTiles {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the floor size: (3,4): ");
        int m = scn.nextInt();
        int n = scn.nextInt();

        int totalPlacements = placeTiles(m, n);
        System.out.println(totalPlacements);

    }

    public static int placeTiles(int n, int m) {
        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }

        // vertically
        int verticalPlacements = placeTiles(n - m, m);

        // horizontal
        int horizontalPlacements = placeTiles(n - 1, m);

        return horizontalPlacements + verticalPlacements;

    }
}
//  1*m tile --> m*n floor