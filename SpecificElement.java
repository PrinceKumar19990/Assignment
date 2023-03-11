package AssimentQuestion;
import java.util.Arrays;
public class SpecificElement {
	    public static void main(String[] args) {
	        int[] numbers = {1, 2, 3, 4, 5};
	        int elementToRemove = 3;

	        System.out.println("Original Array: " + Arrays.toString(numbers));

	        // Find index of element to remove
	        int indexToRemove = -1;
	        for (int i = 0; i < numbers.length; i++) {
	            if (numbers[i] == elementToRemove) {
	                indexToRemove = i;
	                break;
	            }
	        }

	        // Shift elements to left to remove the element
	        if (indexToRemove >= 0) {
	            for (int i = indexToRemove; i < numbers.length - 1; i++) {
	                numbers[i] = numbers[i + 1];
	            }
	            numbers = Arrays.copyOf(numbers, numbers.length - 1);
	            System.out.println("Array after removing element " + elementToRemove + ": " + Arrays.toString(numbers));
	        } else {
	            System.out.println("Element " + elementToRemove + " not found in the array.");
	        }
	    }
	}