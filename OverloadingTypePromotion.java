package LAB23FEB;

public class OverloadingTypePromotion {
		void add (int a,int b) {
			System.out.println(a+b);
		}
		void add(int a,int b, int c) {
			System.out.println(a+b+c);
		}
		public static void main(String[] args) {
			OverloadingTypePromotion obj=new OverloadingTypePromotion();
			obj.add(2, 3);
			obj.add(10,20,30);
		}
		}
