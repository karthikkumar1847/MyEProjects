package MultiThreading;

class PrintChar implements Runnable {
private char charToPrint; 
private int times; 


public PrintChar(char c, int t) {
 charToPrint = c;
 times = t;
}

@Override /** Override the run() method to tell the system
*  what the task to perform
*/
public void run(){
 for (int i = 0; i < times; i++) {
   System.out.print(charToPrint);
  
 }
}
}
