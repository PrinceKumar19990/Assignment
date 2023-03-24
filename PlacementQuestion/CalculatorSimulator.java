package PlacementQuestion;

//Exception classes
	class CountryNotValidException extends Exception {
	    public CountryNotValidException(String str) {
	        super(str);
	    }
	}

	class EmployeeNameInvalidException extends Exception {
	    public EmployeeNameInvalidException(String str) {
	        super(str);
	    }
	}

	class TaxNotEligibleException extends Exception {
	    public TaxNotEligibleException(String str) {
	        super(str);
	    }
	}

	// TaxCalculator class
	class TaxCalculator {
	    public static double calculateTax(String empName, boolean isIndian, double empSal)
	            throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {
	        // Check if the employee is Indian
	        if (!isIndian) {
	            throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
	        }

	        // Check if the employee name is valid
	        if (empName == null || empName.isEmpty()) {
	            throw new EmployeeNameInvalidException("The employee name cannot be empty");
	        }

	        double taxAmount = 0.0;

	        if (empSal > 100000 && isIndian) {
	            taxAmount = empSal * 8 / 100;
	        } else if (empSal >= 50000 && empSal <= 100000 && isIndian) {
	            taxAmount = empSal * 6 / 100;
	        } else if (empSal >= 30000 && empSal < 50000 && isIndian) {
	            taxAmount = empSal * 5 / 100;
	        } else if (empSal >= 10000 && empSal < 30000 && isIndian) {
	            taxAmount = empSal * 4 / 100;
	        } else {
	            throw new TaxNotEligibleException("The employee does not need to pay tax");
	        }

	        return taxAmount;
	    }
	}

	// CalculatorSimulator class
	public class CalculatorSimulator {
	    public static void main(String[] args) {
	        // Test Case 1
	        try {
	            double taxAmount = TaxCalculator.calculateTax("Ron", false, 34000);
	            System.out.println("Tax amount is " + taxAmount);
	        } catch (CountryNotValidException e) {
	            System.out.println("Country not valid: " + e);
	        } catch (EmployeeNameInvalidException e) {
	            System.out.println("Employee name not valid: " + e);
	        } catch (TaxNotEligibleException e) {
	            System.out.println("Not eligible for Tax calculation: " + e);
	        }

	        // Test Case 2
	        try {
	            double taxAmount = TaxCalculator.calculateTax("tim", true, 1000);
	            System.out.println("Tax amount is " + taxAmount);
	        } catch (CountryNotValidException e) {
	            System.out.println("Country not valid: " + e);
	        } catch (EmployeeNameInvalidException e) {
	            System.out.println("Employee name not valid: " + e);
	        } catch (TaxNotEligibleException e) {
	            System.out.println("Not eligible for Tax calculation: " + e);
	        }

	        // Test Case 3
	        try {
	            double taxAmount = TaxCalculator.calculateTax("jack", true, 55000);
	            System.out.println("Tax amount is " + taxAmount);
	        } catch (CountryNotValidException e) {
	            System.out.println("Country not valid: " + e);
	        } catch (EmployeeNameInvalidException e) {
	            System.out.println("Employee name not valid: " + e);
	        } catch (TaxNotEligibleException e) {
	        	System.out.println(e);
	        }
	        
	        //test case 4
	        try {
	            double taxAmount = TaxCalculator.calculateTax( " ", true,30000);
	            System.out.println("Tax amount is " + taxAmount);
	        } catch (CountryNotValidException e) {
	            System.out.println("Country not valid: " + e);
	        } catch (EmployeeNameInvalidException e) {
	            System.out.println("Employee name not valid: " + e);
	        } catch (TaxNotEligibleException e) {
	        	System.out.println(e);
	        }
	           
	    }}