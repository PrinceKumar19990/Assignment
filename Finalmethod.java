package Polymorshism;

 class Finalmethod1 {
	 final void display()  {//create a final method 
		 System.out.println("This is a final method");
	 }
 }
 class Child1 extends Finalmethod1{//child class name main
	 //try to override final method
	 //public final void display() {
		// System.out.println("The final method is overridden");
	 }
 
 public class Finalmethod{//Main class
	public static void main(String[] args) {
		Child1 obj =new Child1();
		obj.display();
	}}
