package interface2;

interface Shape {
	void shape_name();
}
class User_Circle implements Shape{
	
	@Override
	public void shape_name() {
		System.out.println(" Draw a circle");
	}
	
}
class User_Traingle implements Shape{
	
	@Override
	public void shape_name() {
		System.out.println(" Draw a circle");
	}
	
	public class InterfaceEg2{
	public static void main(String[] args) {
		Shape object=new User_Traingle();
			object.shape_name();
	}
		

	}

}
