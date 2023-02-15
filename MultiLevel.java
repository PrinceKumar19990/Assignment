package Inheritance; //Multi-Level inheritance

class M {  //super class
   int a,b,c;
   void add() 
   {
     a=10;  b=20;
     c=a+b;
     System.out.println("Sum of two numbers:"+c);
	}
   
  void sub()
  {
a=100;  b=200;
c=a-b;
System.out.println("Sub of two numbers"+c);
  }

}
class X extends M  // sub class
{
	  void mul()
	  {
	a=10;  b=20;
	c=a*b;
	System.out.println("Mul of two numbers"+c);
}
	  void Div()
	  {
	a=10;  b=2;
	c=a/b;
	System.out.println("div of two numbers"+c);
	  }
}
class Y extends X //sub 2
{
void rem() 
{
 a=10;  b=3;
 c=a%b;
 System.out.println("Reminder of two numbers"+c);
}
}
class MultiLevel
{
public static void main(String[] args) {
	Y r=new Y();
	r.add(); r.sub(); r.mul(); r.Div(); r.rem();
}
}

	
