import java.util.Scanner;
class IfSimple
{

   public static void main(String[]args){

int age;
System.out.println("Enter Your Age...!");
Scanner r=new Scanner(System.in);
age=r.nextInt();
if(age>=18)
{System.out.println("Eligible for votes");
}
else if (age<18){
System.out.println("not Eligible for votes.....!");

}
System.out.println("Thank You...!");

}

}