package interface2;
// multiple Inheritance - more than one parent class/interface
interface Employee { // parent Interface 1
	void salary(); // abstract method salary for parent Interface 1
}

interface Developer{ // parent Interface 2
	void Bonus(); //  abstract method Bonus for parent interface 2
}

class Trainer implements Employee,Developer{
	@Override
	public void Bonus() {
		System.out.println( "Bonus will be 10% of salary");		
	}
	@Override
	public void salary() {
		System.out.println( "Salary increment");		
	}}
public class MultipleIn_Interface {
	public static void main(String[] args) {
		Trainer object=new Trainer ();
		object.Bonus();
		object.salary();

	}

}
