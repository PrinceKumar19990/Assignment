package Polymorshism;

public class RunTimePoly {

	public static void main(String[] args) {
		Java_student js;  // reference variablr of parent class
		js=new Ritu();
		System.out.println("quilty of sana is :"+ js. quilty());
		js=new Hemant();
		System.out.println("quilty of Hemant is :"+ js. quilty());
	}}
class Java_student { // parent class
	String quilty() {
		return null;
	}
}
class Ritu extends Java_student {// child class 1 
	String quilty() {
		return " Artists";
	}

}
class Hemant extends Java_student {// child class 1 
	String quilty() {
		return " Active";
	}

}
class Prince extends Java_student {// child class 1 
	String quilty() {
		return " Run time error";
	}

}