package LAB;

public class ExepressionLab3Feb {

		public static void main(String[] args) {
			int a,b, result;
			a=101+0;
			b=3;
			
			System.out.println("The result of the expression is"+a/b);
			
			double c,d,
			c1=3.0e-6;
			d=10000000.1;
			
			System.out.println("The result of the expression is"+c1*d);
			
			boolean w,x,y,i,j,k,l,m,n;
			w=true; i=false; j=false; k=i && j; n=i||j;
			x=true;
			y=w && x;
			l=k||y;
			m=n&&y;
			System.out.println("true && true ->" +y);
			System.out.println("false && false ->" +k);
			System.out.println("(false && false) || (true && true ) ->" +l);
			System.out.println("(false || false) && (true && true ) ->" +m);
			
		}

	}