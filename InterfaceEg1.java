package interface2;
 interface ParentInterface  {
	void show();  // by dfault abstact method
     default void print () { // java 8 onwards
    	 System.out.println(" Default method");
     }
     static void display () { //java 8 onwards
    	 System.out.println(" Static method");
     }
}
class InterfaceEg1 implements ParentInterface {// class implement Interface
	@Override
	public void show() {
		System.out.println( " parent Interface method");	
	}
	
public static void main (String[] args) {
		InterfaceEg1  object=new InterfaceEg1 ();
		object.show();  // override absttarct method
		object.print();  // default method
		ParentInterface.display(); // static method 
}}


