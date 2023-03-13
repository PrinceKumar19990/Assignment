package Array;
         // Array Maximum Minium and passing elements 
public class PassingArrayToMethod {
	// creating a method which pass an array as a parameters
	static void maximumNo (int array[]) { // method name maximumNO
		int max= array[0];
		for(int i=1; i<array.length;i++)
			if (max<array[i] )    //7
					max=array[i];
			System.out.println(max);
	}
	static void manimumNo (int array[]) { // method name maximumNO
		int min= array[0];
		for(int i=1; i<array.length;i++)
			if (min>array[i] )    //7
				min=array[i];
		System.out.println(min);
}
public static void main(String[] args) {
		int a[] = {5,7,9,2,10};
	maximumNo(a); // passing array to a method max
	manimumNo(a); // passing array to a method min
	
	}

}
