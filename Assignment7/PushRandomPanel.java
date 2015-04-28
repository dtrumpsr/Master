import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;


public class PushRandomPanel extends JPanel {
    private int mResult;
    public JButton mPush;
    public JLabel mLabel;
    public JTextField mText;
    public JPasswordField mPass;
    public JCheckBox mCheck;
    
   
    public PushRandomPanel() {
        mResult = 0;
        
        mPush = new JButton("Push Me!");
        mPush.addActionListener(new ButtonListener());
        
        mLabel = new JLabel();
       
        this.add(mPush);
        this.add(mLabel);
       
        
        this.setBackground(Color.lightGray);
        this.setPreferredSize(new Dimension(300, 100));
    }
    
   
    public void generateRandom() {
        mPush.doClick();
    }
    
    //****************
    // A method to return the current value of the random number.
    //****************
    public String getResult() {
        return mLabel.getText();
    }
  
    private class ButtonListener implements ActionListener {
       
        public void actionPerformed(ActionEvent event) {
            Random generator = new Random();
            mResult = generator.nextInt(100) + 1;
            mLabel.setText("" + mResult);
        }
    }
}