import java.util.Scanner;

public class ExceptionHandlingByOurSelf {
	// main method
	public static void main(String[] args) {
		int c =0;
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter d :");
     int d = scan.nextInt();
     
     while(  d != 0){
     System.out.println("Enter two numbers");
     int a = scan.nextInt();
     int b = scan.nextInt();
     if(b!=0){ c = a/b;}
     else {
    	 System.out.println("b cannot be 0");
    	 System.out.println("Enter d :");
         d = scan.nextInt();
    	 continue;
     }
     
     System.out.println(c); 
     System.out.println("Enter d :");
      d = scan.nextInt();
     }
		}}

