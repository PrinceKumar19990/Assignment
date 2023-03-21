package Exception;
// only 1st exception will execute ( multiple catch )
public class Multi_Catch {
	static void myFunc() {
		try {
			int i= 50/0;  // Arithmetic // 50/2
			System.out.println(i);  // Arithmetic
			int arr[]= new int[3]; // Arrayindexoutofbounded
			arr[2]=24;
		}
		catch(AirthmeticException e) {
			System.out.println(" Only 1st Airthmetic Exception will excute");
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println(" Now Array index out of bound will occure");
	}
  Finally {
	  System.out.println("I am finally block");
  }
	public static void main(String[] args) {
		myFunc();

	}

}
