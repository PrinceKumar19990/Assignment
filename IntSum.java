package Inheritance;

class Arithmetic{
    public int add(int a, int b){
        int sum = a + b; 
        return sum;
    }
}

class Adder extends Arithmetic{  
    public int callAdd(int a, int b){
        return add(a,b);
    }
}

public class IntSum{
    public static void main(String []args){
        // Create a new Adder object
        Adder a = new Adder();
        System.out.print("Add : ");
        System.out.print(a.add(10,32) + " " + a.add(10,3) );
     }
}
