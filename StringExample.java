package STRING;

public class StringExample {
public void show() { // method 1
	char [] arr = {'j','a','v','a'}; // char type array
	System.out.println(arr);
     String s = new String(arr);
     System.out.println("value is :" +s); // "java"
     //  j  a  v  a
}
     public void myFunction () { // method 2
    	 String s1 = " Prince";
    	String  s2 = new String(s1);
    	 System.out.println(s2); // prince
     }
     public static void main (String[] args) {
    	 StringExample str = new StringExample();
    	 str.show();
    	 str.myFunction();    
    	 }
	

}
