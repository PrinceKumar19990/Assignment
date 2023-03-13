package Array;
// odd numbers of coloumns known as a jagged array 
public class JaggedArray {

	public static void main(String[] args) {
// declare 2D array
// declare no of row =3 but column=blank 
		int arr [][]=new int [3][];
// defining column 5+7+9 =21		
		arr[0]= new int [3];
		arr[1]= new int [5];
		arr[2]= new int [11];
		arr[2]= new int [15];
//initialized the jagged Array
		int count =0;
		for (int i=0; i<arr.length;i++)  // row 
			for (int j=0; j<arr[i].length;j++)  // column
			arr[i][j]=count++;
//  print the Jagged Array
	for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}}


