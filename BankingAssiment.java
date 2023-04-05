package Thread;
import java.util.Scanner;
public class BankingAssiment {
	int balance;
	
	synchronized void deposit(int amount) {
	    balance += amount;
        System.out.println("Deposit : " + amount);
        notify();
		
	}
	
synchronized void withdraw(int amount) throws InterruptedException{
	while (balance < amount) {
        System.out.println("Balance is insufficient" + balance +"please deposit first");
        wait();
}
	balance -= amount;
System.out.println("Withdrawal: " + amount );
}
public static void main(String[] args) throws InterruptedException {
	BankingAssiment b = new BankingAssiment();
//    Scanner sc= new Scanner(System.in);
//   int r=sc.nextInt();
    Thread depositThread = new Thread(()->  {
        b.deposit(1000);
    });
    Thread withdrawThread = new Thread(() -> {
        try {
            b.withdraw(200);
        } catch (InterruptedException e) {
           System.err.println(e);
        }
    });
    depositThread.start();
    Thread.sleep(500);
    withdrawThread.start();
    depositThread.join();
    withdrawThread.join();
}
}