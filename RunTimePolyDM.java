package Polymorshism;
   // runtime polymorphism ant achieved by data member

public class RunTimePolyDM {

	public static void main(String[] args) {
		children object;
		object= new children();
		System.out.println(object.Priority);
	}
}
class papa_mamma {// base class
	String Priority="High";
}
class children extends papa_mamma{ //child class 
	String Priority="Super_High";
	}


