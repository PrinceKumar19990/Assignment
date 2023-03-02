package Mypackage;

public class Bank {
private long account_num;
private String name,e_mail;
private float amount;
public long getAccount_num() {
	return account_num;
}
public void setAccount_num(long account_num) {
	this.account_num = account_num;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getE_mail() {
	return e_mail;
}
public void setE_mail(String e_mail) {
	this.e_mail = e_mail;
}
public float getAmount() {
	return amount;
}
public void setAmount(float amount) {
	this.amount = amount;
}

}



public class Encapsulated_Ex {
 public static void main(String args[]){  	     
		    	Person p= new Person();
		    	p.setName(" PRINCE");
		    	p.setAge(25);
		    	System.out.println(" Nmae is :" +p.getName());
		    	System.out.println(p.getAge());
		   
		     
		   }  
		}  
