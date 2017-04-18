import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class TestFileExample {

	public static void main(String[] args) throws FileNotFoundException {
		
		File h = new File("F:/sem2/Hareesh_java/hareesh.txt");
		
		
		PrintWriter out1 = new PrintWriter(h);  // create file and print
		
		out1.println("Hareesh is a lover boy.");
		out1.println(25);
		out1.println("Mounika is a good girl");
		out1.println(25);
		out1.println("Mounika is a good girl");
		out1.println(25);
		out1.close();
		
		Scanner scan = new Scanner(h);  // read File
		
		File k = new File("F:/sem2/Hareesh_java/kar.txt");
		PrintWriter out2 = new PrintWriter(k);
		
		
		while(scan.hasNext()){
			
		String str = scan.next();
		out2.println(str);
		
		}
		
		out2.close();
		
	}

}
