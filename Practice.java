package com.cognizant.shapes;
import java.util.Scanner;

 interface AdvancedArithmetic {
     int divisor_sum(int n);

}class MyCalculator implements AdvancedArithmetic {
    public int divisor_sum(int n) {
        int i, sum = 0;
        for (i = 1; i <= n; i++) {
            int m = n % i;
            if (m == 0) {

                sum = sum + i;
            }
            if (n >= 1000) {
                System.out.println("invalid number");
            }
        }
        return sum;
    }
}
public  class Practice {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        AdvancedArithmetic MyCalculator = new MyCalculator();
        int sum = MyCalculator.divisor_sum(n);
        System.out.println("I implemented: AdvancedArithmetic\n" + sum);
    }
}
