
public class DivisorZero extends Exception{
 private int a;
 private int b;
	public DivisorZero(int a, int b){
		
		super("Invalid b "+b);
		this.a = a;
		this.b = b;
		
	}
	public int getA(){
		return a;
	}
	public int getB(){
		return b;
	}
}
