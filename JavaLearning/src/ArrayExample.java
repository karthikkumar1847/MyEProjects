import java.util.Scanner;
public class ArrayExample {

	public static void main(String[] args) {
		
    Scanner input= new Scanner(System.in);
	int a=5;
	int b=10;
	int[] c = new int[1];
	c[0]  = 25;
	
     add(a);   
      add(b);  
      addArray(c);
      System.out.println(a);
      System.out.println(b);
  System.out.println(c[0]);
}
	
	
	public static void add(int x){
		x= x+10;
		System.out.println(x);
}
	public static void addArray(int[] y){
	for(int i=0;i<y.length;i++){	
		y[i]= y[i]+10;
	
		System.out.println(y[i]);
}}

}
