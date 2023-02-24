package LAB23FEB;

class TaxCalculator {
    float basicSalary;
    boolean citizenship;
    float tax;
    int nettSalary;

    TaxCalculator(float basicSalary, boolean citizenship) {
       this.basicSalary = basicSalary;
       this.citizenship = citizenship;
   }

    void calculateTax() {
       tax = 30 * basicSalary / 100;
       System.out.println("The Tax of the employee for the " + basicSalary + " is " + tax);
   }

    void deductTax() {
       nettSalary = (int) (basicSalary - tax);
       System.out.println("The nett salary of the employee " + nettSalary);
   }

    void validateSalary() {
       boolean response = (basicSalary > 100000 && citizenship);
       System.out.println("The salary and citizenship eligibility: " + response);
   }
}
public class EmployeeTax {
   public static void main(String[] args) {
       TaxCalculator calculator = new TaxCalculator(25000, true);
       calculator.calculateTax();
       calculator.deductTax();
       calculator.validateSalary();

       calculator = new TaxCalculator(125000, true);
       calculator.calculateTax();
       calculator.deductTax();
       calculator.validateSalary();
   }
}