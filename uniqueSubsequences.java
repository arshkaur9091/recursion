import java.util.*;

public class uniqueSubsequences {
  public static boolean[] map = new boolean[26];
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scn.nextLine();

        HashSet<String> set = new HashSet<>();

        subsequences(str, 0,"",set);
    }

    public static void subsequences(String str, int index, String newString, HashSet<String>set) {
      if(index == str.length()){
        if(set.contains(newString)){
          return;
        }
        else{
          System.out.println(newString);
          set.add(newString);
          return;
        }
      }
      char currentChar = str.charAt(index);

      // to be
      subsequences(str, index+1, newString+currentChar,set);

      // not to be
      subsequences(str, index+1, newString,set);
    }
}

// time complexity O(2^n)