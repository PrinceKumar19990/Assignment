package Exception;

import java.util.Scanner;

public class Input_MissMatch {

	public static void main(String[] args) {
  Scanner sc = new Scanner (System.in);
  System.out.println(" Enter any two numbers");
  try {
	  int x = sc.nextInt();
	  int y = sc.nextInt();
	  System.out.println(" result:" + x/y);
  }
  catch (Exception e) {
	  System.out.println(" only take integers");
  }
  

	}

}
