package Exception;

public class ExceptionEg {

	public static void display() { // method
	 // before try - catch block
		String a = " i am error";
		try {
			int i=50/0 ; // Arithmetic exception
			System.out.println(i);
			// after exception can't excute the other lines
			String s = " riya";
			System.out.println(s.length());
		}
		catch (Exception e) {
			System.out.println(e);
		}

		// after try-catch block
		String b= " i cannot be handle";
		System.out.println(a+ " "+ b);  // i am error + i can not be handle
	}

}
