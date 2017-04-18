import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionHandlingEx1  {
	public static void main(String[] args) {
		 int c =0;
		 int a=0, b=0;
		 int[] array = new int[3];
		 int index=0;
	     Scanner scan = new Scanner(System.in);
	     System.out.println("Enter d :");
	     int d = scan.nextInt();
	     
	     while(  d != 0){
	    
	     try{
	    	 System.out.println("Enter array index :");
	    	 index = scan.nextInt();
	    	 array[index]= 10;
	    	 System.out.println("Enter two numbers");
	    	  a = inputInteger(a);
		      b = inputInteger(b);
	    	
	    	 
	    	 System.out.println("c: "+divide(a, b));   	
	     }
	     catch(InputMismatchException ex){
	    	 System.out.println(ex);
	    	
	     }
	     catch(ArithmeticException ex){
	    	
	    	 System.out.println(ex);
	    	// System.out.println("\ncannot divide by zero\n");
	    	 
	    	 //throw ex;	   
	     }	
	     catch(IndexOutOfBoundsException ex){
	    	 System.out.println("Array index range is 0 to 2");
	    	
	     }
	     
	     catch(Exception ex){
	    	 System.out.println("You have any other  error");
	    	
	     }
	  System.out.println(" Exited");
 
	     }
	}
	
	public static int inputInteger(int a){
		Scanner scan = new Scanner(System.in);
		a=scan.nextInt();
		return a;
	} 
	public static int divide(int a, int b){
		
		return a/b;
	}
}
