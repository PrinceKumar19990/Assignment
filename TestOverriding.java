package LAB23FEB;

public class TestOverriding {
		void run() {
			System.out.println("running mode on");
		}
		}
		class Overriding extends TestOverriding{
			void run() {
				System.out.println("running mode off");
			}
			public static void main(String[] args) {
				Overriding a= new Overriding();
				a.run();
			}
		}