package interface2;

	interface BankAccount{
		void deposit();
		void withdraw();
	}
	class CheckingAccount implements BankAccount{

		@Override
		public void deposit() {
			System.out.println(" Deposit ");
			
		}

		@Override
		public void withdraw() {
			System.out.println(" Withdrawal y");
			
		}
		
	}
	public class InterfaceEg3 {
	public static void main(String[] args) {
		CheckingAccount obj = new CheckingAccount();
		obj.deposit();
		obj.withdraw();
	}
	}