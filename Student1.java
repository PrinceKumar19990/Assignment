package Inheritance;

class Student1{
		  int id;
		  String name;
		  Address address;  // aggretion ( entry ref of address class )
		  public Student1  (int id, Address address,  String name) {
			  this.id=id;
			  this.name=name;
			  this.address=address;
		  }
		  void display()  {// method
			  System.out.println(id+"  "+name);
			  System.out.println(address.city+" "+address.state+" "+address.country);
		  }

			public static void main(String[] args) {
				Address address1 =new Address("dgp","wb","india");
				Address address2 =new Address("kol","wb","india");
				Student1 s= new Student1(12,address1,"prince");
				Student1 s1= new Student1(12,address1,"rahul");
				s.display();
				s1.display();
			}

		}