  // Final kewword
   //Final variable--- cannot change the value of final variable 

package Polymorshism;

public class Finalvariable {
     final int value=50; //final  variable 
     void display() {
    	 System.out.println(value);
    	 // we can't change the value of final variable 
     	// value=70; //compile time error
     }
	public static void main(String[] args) {
	   Finalvariable fv=new Finalvariable();
	   fv.display();
	}}

