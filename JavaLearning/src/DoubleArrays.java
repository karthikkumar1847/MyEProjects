
public class DoubleArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int matrix[][] = {{1,2,3,4,5},{12,2352,45},{4}};
		
		
		//matrix[0][0] = 3;

		//int  a = (int)(Math.random()*1000); // [0,1)
		//System.out.println(a);
		
		
		for (int i = 0; i < matrix.length; i++)
		  for (int j = 0; j < matrix[i].length; j++)
		    matrix[i][j] = (int)(Math.random() * 100);

		
		for (int i = 0; i < matrix.length; i++)
		  for (int j = 0; j < matrix[i].length; j++)
		   System.out.println(matrix[i][j]);

	
	}

}

