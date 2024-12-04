import java.util.*;

public class permutationOfString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scn.nextLine();

        printPermutations(str, "");
    }

    public static void printPermutations(String str, String permutation) {
      if(str.length() == 0){
        System.out.println(permutation);
        return;
      }
      for(int i=0; i<str.length();i++){
        char currentChar = str.charAt(i);
        // "abc" -> "ab"
        String newString = str.substring(0,i) + str.substring(i+1);
        printPermutations(newString, permutation+currentChar);
      }
    }
}

// time complexity O(n!)