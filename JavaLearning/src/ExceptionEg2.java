import java.util.Scanner;

public class ExceptionEg2 {

	private int a;
	private  int b;
	
	
	public int divideNums(int m, int n) throws DivisorZero {
		if (n==0) throw new DivisorZero(a,b);
		return m/n;
	}
	
	public void exHandling(){
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter two nums:");
		 a = scan.nextInt();
		 b = scan.nextInt();
		try{
			
			System.out.println(divideNums(a,b));
		}
		catch(Exception ex){
			System.out.println("Divisor cannot be zero");
		}
	}
}
