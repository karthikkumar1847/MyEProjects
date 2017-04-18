import java.awt.*;
import javax.swing.*;

public class JFrameEx1 extends JFrame {
    public JFrameEx1() {
    //JPanel p1 = new JPanel(new GridLayout(4, 3));
    JPanel p1 = new JPanel();
    p1.setLayout(new GridLayout(4, 3));
    
    //Add buttons to the panels
    for(int i = 1; i <= 9; i++)
    {
        p1.add(new JButton("" + i));
    }
    p1.add(new JButton("" + 0));
    p1.add(new JButton("Start"));
    p1.add(new JButton("Stop"));
    
    //create a panel p2 to hold a text field and p1
    JPanel p2 = new JPanel(new BorderLayout());
    p2.add(new JTextField("Time to be displayed here"), BorderLayout.NORTH);
    p2.add(p1, BorderLayout.CENTER); //ADD  P1 TO P2 AT CENTER
    
    //ADD CONTENTS IN TO THE FRAME
    add(p2, BorderLayout.EAST);
    add(new JButton("Food to be placed here"), BorderLayout.CENTER);
    
    }
        public static void main(String[] args) {
        	JFrameEx1 frame = new JFrameEx1();
        frame.setTitle("Front view of Microwave Oven");
        frame.setSize(400, 250);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
     
    }
    
}

