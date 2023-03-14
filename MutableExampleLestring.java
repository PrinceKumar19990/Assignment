package STRING;

public class MutableExampleLestring {

	public static void my() {
		// string Buffer
		StringBuffer s =new StringBuffer(" Hello");//object of string buffer class
		
		s.append(" World");
		System.out.println(" String is :" +s);// Hello World
		
		s.insert(2,"Riya");
		System.out.println(" insert is :" +s);// HeRiyallo World
		
		s.replace(1,3, " java");
		System.out.println(" replace is :" +s);// Hjavaiyall0world
		
		

	}

}
