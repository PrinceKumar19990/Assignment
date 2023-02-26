package Polymorshism;  //Final keyword.....

public class BlankFinalvariable {

	
		final int value; // blank initiallization of final variable
		BlankFinalvariable() { // default Construstor
			value=70;
			System.out.println(value);
// we can't change the value of final variable
			// compile time error
}
public static void main(String args[]) {
	BlankFinalvariable fv = new BlankFinalvariable();//creating object
}}

