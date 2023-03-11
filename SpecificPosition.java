package AssimentQuestion;
import java.util.Arrays;
public class SpecificPosition {

	    public static void main(String[] args) {

	        int[] arr = {1, 2, 3, 4, 5};
	        int n = arr.length;

	        int[] newArr = new int[n + 1];

	        int insertPos = 2; // position to insert the new element
	        int newValue = 10; // new value to be inserted

	        for (int i = 0, j = 0; i < n; i++, j++) {
	            if (i == insertPos) {
	                newArr[j] = newValue;
	                j++;
	            }
	            newArr[j] = arr[i];
	        }

	        System.out.println("Original Array: " + Arrays.toString(arr));
	        System.out.println("New Array after insertion: " + Arrays.toString(newArr));
	    }
	}