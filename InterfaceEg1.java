 interface ParentInterface  {
	void show();  // by dfault abstact method

}
class InterfaceEg1 implements ParentInterface {// class implement Interface
	
	public void show() {
		System.out.println( " parent Interface method");	
	}
public static void main (String[] args) {
		InterfaceEg1  object=new InterfaceEg1 ();
		object.show();
}}


