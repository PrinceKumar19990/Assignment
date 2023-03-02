package Mypackage;

public class Read_Encap {
	private String name="PRINCE";
	// getting the name
	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		Read_Encap obj=new Read_Encap();
//obj.set _name (" shifa");// we can't change the value of the name
	
		System.out.println(obj.name);

	}

}



public class Write_Encap {
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}


	public static void main(String[] args) {
		Write_Encap obj=new Write_Encap ();
    obj.setName("Prince");
    // we can not get the vale , there is no get method
	//System.out.println(" Name:"+ obj.getName());
    System.out.println(" Name:" + obj.name);
	}

}

