import javax.swing.JFrame;
public class PushRandom {
   
    public static void main (String[] args) {
        JFrame frame = new JFrame("Push Random");
        frame.add(new PushRandomPanel());
        
       
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}