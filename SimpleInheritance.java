package Inheritance; // simple Inheritance

class SimpleInheritance {  //super class
	int roll,marks;
	String name;
	
	void input()
	{
		System.out.println("Enter roll name & marks");
	}
}
class ankit extends SimpleInheritance  //sub class
{
	void disp()
	{
		roll=1; name="ankit";marks=55;
		System.out.println(roll+"  "+name+" "+marks);
	}
	public static void main(String[] args) {
	ankit r=new ankit();
	r.input();  r.disp();

	}

}