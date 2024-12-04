import java.util.*;

public class callGuests_InParty {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number of guests: ");
        int n = scn.nextInt();

         System.out.println(callGuests(n));
    }

    public static int callGuests(int n) {
        if (n <= 1) {
            return 1;
        }
        // single
        int ways1 = callGuests(n - 1);
        // pair
        int ways2 = (n - 1) * callGuests(n - 2);

        return ways1 + ways2;
    }
}
