package STRING;

import java.util.Scanner;

public class StringTest {
	String x= " HELLO"; // str is a obj of string ( by using literal)
	public void show() { // method
		Scanner s = new Scanner ( System.in);// user input
		System.out.println(" Enter String"); // line no 1
		String A= s.next(); // 1st string  anudip 6 letter
		String B= s.next(); // 2nd string  java 4 letter
		System.out.println(A.length()+B.length());// length () -10
		System.out.println((A.compareTo(B)>0) ? " YES" : " NO");
		// compare to () Lexicographicall
		System.out.println(A.substring(0,4).toUpperCase()+A.substring(2)+" " 
		+B.substring(0,3).toLowerCase()+B.substring(1));  
		// substring(), upper case, lower case java
		System.out.println(" substring is :" +x.substring(0, 3));// hel --0 start index 3 end
		System.out.println(" substring is :" +x.substring(2));}  // llo--2 start index
				public static void main(String[] args) {
	

	}

}
