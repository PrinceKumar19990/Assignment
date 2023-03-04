package Array;

public class AverageOfArray {

	public static void main(String[] args) {
		int arr[]= { 1, 2, 3,4,5,6,};
		int length=arr.length;
	       int sum = 0;
	       
	       for (int i=0;i<arr.length;i++) {
	    	   sum += arr[i];
	}
	    		   double Average=sum/arr.length;
	       System.out.println(" Average of array"+" "+ Average);
		}

	}
