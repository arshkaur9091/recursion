import java.util.*;

public class keypadProblem {
  public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the string: for eg: 23, 345.args.. ");
        String str = scn.nextLine();

        printCombinations(str, 0, "");

    }

    public static void printCombinations(String str, int index, String combination) {
      if(index == str.length()){
        System.out.println(combination);
        return;
      }
      char currentChar = str.charAt(index);

      String mapping = keypad[currentChar - '0'];

      for(int i=0; i<mapping.length() ; i++){
        printCombinations(str, index+1, combination+mapping.charAt(i));
      }
      
    }
}

// time complexity O(4^n)