package Array;

public class MultiArray {

	  public static void main(String[] args) {
	        int x[][]={{7,1,2},{2,1,5},{1,5,2}};
	        int y[][]={{4,1,3},{3,2,1},{1,1,2}};
	        
	        int z[][]=new int[3][3];
	        
	        for (int i=0; i<3; i++){
	            for (int j=0; j<3; j++){
	                
	                z[i][j]=x[i][j]*y[i][j];
	                System.out.print(z[i][j]+" ");
	            }
	            System.out.println();
	        }
	    }
	}