package MultiThreading;

import javax.swing.*;

public class FlashingText extends JApplet implements Runnable {
  private JLabel jlblText = new JLabel("Welcome", JLabel.CENTER);
  private JButton jbt = new JButton("OK");
  
public FlashingText(String k){
	add(new JButton(k));
	
}
  public FlashingText() {
	  
    add(jlblText);
    new Thread(this).start();
  }

  @Override /** Set the text on/off every 200 milliseconds */
  public void run() {
    try {
      while (true) {
        if (jlblText.getText() == null)
          jlblText.setText("Welcome");
        else
          jlblText.setText(null);

        Thread.sleep(100);
      }
    }
    catch (InterruptedException ex) {
    }
  }

  /** Main method */
  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        JFrame frame = new JFrame("Flashing Demo Text");
        frame.add(new FlashingText());
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setVisible(true);
        JFrame frame2 = new JFrame(" Button ");
        frame2.add(new FlashingText("Hareesh"));
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setVisible(true);
        frame2.setSize(300,200);
      }
    });
  }
}
