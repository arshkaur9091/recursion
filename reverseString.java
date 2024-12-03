import java.util.*;

public class reverseString {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scn.nextLine();

        reverseString(str, str.length()-1);
    }

    public static void reverseString(String str, int index) {
      if(index==0){
        System.out.print(str.charAt(index));
        return;
      }
      System.out.print(str.charAt(index));
        reverseString(str, index-1);
    }
}

// time complexity O(n)