package Mypackage;

public class Person {
	private int age;  
	 private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
	





 
	//Encapsulated


package Mypackage;

public class Encapsulated_Ex2 {

	public static void main(String[] args) {
		Bank b=new Bank();
		b.setAccount_num(3462973356445L);
		b.setName("Rahul");
		b.setE_mail("kumarprince1617@gmail.com");
		b.setAmount(25000f);
		
		System.out.println("Account no :-"+b.getAccount_num());
        System.out.println("Account holder name"+b.getName());
        System.out.println("Account holder gmail"+b.getE_mail());
        System.out.println("save amount"+b.getAmount());
        
	}

}
