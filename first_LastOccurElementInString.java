
import java.util.*;

public class first_LastOccurElementInString {

    public static int first = -1;
    public static int last = -1;

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scn.nextLine();

        findOccurance(str, 0, 'a');

    }

    public static void findOccurance(String str, int index, char element) {
      if(index== str.length()){
        System.out.println(first);
        System.out.println(last);
        return;
      }

        char currentChar = str.charAt(index);
        if (currentChar == element) {
            if (first == -1) {
                first = index;
            } else {
                last = index;
            }
        }
        findOccurance(str, index+1, element);

    }
}

// time complexity O(n)
