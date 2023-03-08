package AssimentQuestion;
import java .util.Scanner;
public class SecondSmallestArray {

	 static int  SecondSmallest(int[] a,int total) {
		Scanner Sc=new Scanner(System.in);
		System.out.println(" Enter the vale of N");
		int n = Sc.nextInt(); 
		return a[n];
	}
	public static void main(String args[]){
		int a[]={1,2,5,6,3,2}; 
		System.out.println("Second Smallest: "+SecondSmallest(a,6)); 
	}
}
	