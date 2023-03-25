package Exception;
  // checked exception
import java.io.IOException;

class Test {
	
	void display() throws IOException{
		// System.out.println{"Throws exception perfectly"};
		throw new IOException (" Throws exception error");
	}
}
public class Throws_Eg2{
	public static void main(String[] args)throws IOException {
		Test obj = new Test ();
		obj.display();

	}

}
