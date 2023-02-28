package interface2;
// Inheritance with Interface 

interface Parent{ // parent interface
	void show ();
}
interface child extends Parent{ // child interface ( interface inherit interface with extends )
	void display();
}
class child1 implements child {  // another child class ( interface inherit by class with implement 
	
	@Override 
public void show() {
		System.out.println(" parent interface method");
		
	}
	@Override 
public void display() {
		System.out.println(" child interface method");
	}
}
public interface Inheritance_Interface{
	public static void main (String[]args) {
		child1 object=new child1();
		object.display();
		object.show();
	}
}


	
