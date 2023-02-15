package Inheritance;  // Hierarchical Inheritance

class A {
	void input() {
		System.out.println(" Enter Your Nmae");
	}
}
class B extends A{
	void show(){
		System.out.println(" My Name is Prince");
	}
}
	class C extends A{
		void Disp(){
			System.out.println(" My Name is rahul");
		}
	}
		class HierarchicalInh
		{
	public static void main(String[] args) {
		B r=new B();
		C r2=new C();
		
		r.input(); r.show();
		r2.input(); r2.Disp();
	}

}
