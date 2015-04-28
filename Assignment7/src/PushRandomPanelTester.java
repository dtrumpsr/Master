import javax.swing.JFrame;

import junit.framework.*;


public class PushRandomPanelTester extends TestCase {

   
    
    protected void setUp(){
 	   
    }
   
    // Test a button push
    public void testPushRandom() {
        JFrame frame = new JFrame("Push Random");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        PushRandomPanel panel = new PushRandomPanel();
        frame.add(panel);
        
        frame.pack();
        frame.setVisible(true);
        
        panel.generateRandom();
        String str = panel.getResult();
        int result = Integer.parseInt(str);
        System.out.println("Result: " + result); 
        assertTrue(result >= 1 && result <= 100);
    }
}