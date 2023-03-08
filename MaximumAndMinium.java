package AssimentQuestion;

public class MaximumAndMinium {
	// creating a method which pass an array as a parameters
	static void maximumNo (int array[]) { // method name maximumNO
		int max= array[0];
		for(int i=1; i<array.length;i++)
			if (max<array[i] )    //7
					max=array[i];
			System.out.println("Maximum no is : "+max);
	}
	static void manimumNo (int array[]) { // method name maximumNO
		int min= array[0];
		for(int i=1; i<array.length;i++)
			if (min>array[i] )    //7
				min=array[i];
		System.out.println("Minimum no is : "+min);
}
public static void main(String[] args) {
		int a[] = {6,23,54,56,70};
	maximumNo(a); // passing array to a method max
	manimumNo(a); // passing array to a method min
	
	}

}
