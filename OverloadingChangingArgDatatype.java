package LAB23FEB;

public class OverloadingChangingArgDatatype {

	static int sum(int a,int b) {
		return a+b;
	}
	static double sum (double a,double b) {
		return a+b;
	}
	public static void main(String[] args) {
		System.out.println(OverloadingChangingArgDatatype.sum(5,6));
		System.out.println(OverloadingChangingArgDatatype.sum(5.3 , 6.4));
}
}