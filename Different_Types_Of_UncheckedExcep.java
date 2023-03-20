package Exception;

public class Different_Types_Of_UncheckedExcep {

	public static void display() { // method
		 // before try - catch block
			String a = " i am error";
			System.out.println(a);
			try {
				int i=50/0 ; // Arithmetic exception
				System.out.println(i);
				//null pointer Exception
				String s = null;
				System.out.println(s.length());
			//array indexoutofBound Exception
				int arr [] = new int[5];
				arr[7] =10;
			//number format exception 
				String s1=" riya";
				int n = Integer.parseInt(s1);
				System.out.println(n);
			}
catch (Exception e) {
			System.out.println(e);  // i am error + i can not be handle
		}
 // after try = catch block
			String b= " The End";
			System.out.println(b);
	}
public static void main (String[]args) {
	 Different_Types_Of_UncheckedExcep ep = new  

			 
  ep.display();
}	 
}