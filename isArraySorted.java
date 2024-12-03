
import java.util.*;

public class isArraySorted {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = scn.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter "+ n + " numbers: ");

        for(int i=0; i< arr.length ;i++){
          arr[i] = scn.nextInt();
        }
        System.err.println(isSorted(arr,0));

    }

    public static boolean  isSorted(int arr[], int index) {
      if(index == arr.length -1){
        return true;
      }
      if(arr[index] < arr[index+1]){
      // array is sorted till now
        return isSorted(arr, index+1);
      }
      else{
        return false;
      }
      
    }
}

// time complexity O(n)
