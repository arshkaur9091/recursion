import java.util.*;

public class moveAllX_toEnd_inString {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scn.nextLine();

        moveAllX(str, 0, 0, "");
    }

    public static void moveAllX(String str, int index, int count, String newString) {
        if (index == str.length()) {

          for(int i=0; i<count; i++){
            newString+='x';
          }
            System.out.println(newString);
            return;
        }
        char currentChar = str.charAt(index);
        if (currentChar == 'x') {
            count++;
            moveAllX(str, index + 1, count, newString);
        } else {
            newString += currentChar; // newString = newString+currentChar
            moveAllX(str, index + 1, count, newString);
        }

    }
}

// time complexity O(n)
