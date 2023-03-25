package Exception;
// contructor can Throw an Exception
public class Throws_With_con {
	String name;
	int age;
	public Throws_With_con(String name, int age) throws Exception {
		if (age<18) {
			throw new Exception (" Age should be more than 18");
		}
		this.name=name;
		this.age=age;
	}

	public static void main(String[] args) throws Exception{
		Throws_With_con obj=new Throws_With_con (" pallabhi",25);
		System.out.println(obj.name+" "+ obj.age);

	}

}
