package FileProgramming;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestFileClass {
	public static void main(String[] args) throws FileNotFoundException {
	     File file = new File("F:/sem2/Hareesh_java/Scores.txt");
	     System.out.println("Does it exist? " + file.exists());
	     System.out.println("The file has "+ file.length() + " bytes");
	     System.out.println("Is it a file? " + file.isFile());
	     System.out.println("Is it a directory? " + file.isDirectory());
	     System.out.println(file.getAbsolutePath());
	     
	     PrintWriter pout = new PrintWriter(file);
	        pout.print("John T Smith  ");
			pout.println(99);
			pout.print("Eric K Jones  ");
			pout.println(65);
			pout.close();
			
		Scanner scan = new Scanner(file);
		
		File file2 = new File("F:/sem2/Hareesh_java/S1.txt");
		PrintWriter out2 = new PrintWriter(file2);
		Scanner scan2 = new Scanner(file2);
		
			while(scan.hasNext()){
				
				String word = scan.next();
				System.out.println(word);	
				out2.println(word);	
				
				//String line = scan.nextLine();
				//System.out.println(line);
				//out2.println(line);
			}
			out2.close();
			scan.close();
			scan2.close();
	}

}
