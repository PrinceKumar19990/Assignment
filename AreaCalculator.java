package com.cognizant.shapes;

class Rectangle{
	  void calculateArea(){
	int l=5;
	int b=6;
	int area=l*b;
	System.out.println("Area of Rectangle"+area);
	  }
}
public class AreaCalculator {
	public static void main(String[] args) {
		Rectangle rec=new Rectangle();
		rec.calculateArea();
	}
}
