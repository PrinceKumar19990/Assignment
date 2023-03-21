package Exception;

public class Execption_Assiment {

	public static void display() { // method
		 // before try - catch block
		
        try {
            int a = 5;
            int b = 0;
            int result = a / b;  }
        catch (Exception e) {
            System.out.println("Invalid division: " + e);
        }
        
        // String parsed to a numeric variable
        try {
            String str = "abc";
            int num = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Format mismatch: " );
        }
        // Accessing an invalid calculation
        try {
            int[] arr = new int[5];
            int result = arr[6] / 2;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Calculation invalid: " );
        }
        
        // Accessing an invalid calculation
        try {
            int[] arr = new int[5];
            int result = arr[6] / 2;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Calculation invalid: " );
        }
        
        // Accessing an invalid index in an array
        try {
            int[] arr = new int[5];
            arr[6] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is invalid: ");
        }
        
        // After the exception is handled
        System.out.println("Exception handling completed.");
    }

}