import java.util.*;

public class subsequences {
  public static boolean[] map = new boolean[26];
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scn.nextLine();

        subsequences(str, 0,"");
    }

    public static void subsequences(String str, int index, String newString) {
      if(index == str.length()){
        System.out.println(newString);
        return;
      }
      char currentChar = str.charAt(index);

      // to be
      subsequences(str, index+1, newString+currentChar);

      // not to be
      subsequences(str, index+1, newString);
    }
}

// time complexity O(2^n)
