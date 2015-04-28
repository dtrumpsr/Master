import javax.swing.JOptionPane;
public class SumAndProductDiaglogBox {
	public static void main(String[] args) {
        String strNum1, strNum2, strResult;
        int num1, num2, ok, again;
        do {
        	strNum1 = JOptionPane.showInputDialog("Please enter the first integer: ");
            num1 = Integer.parseInt(strNum1);
            
            strNum2 = JOptionPane.showInputDialog("Please enter the second integer: ");
            num2 = Integer.parseInt(strNum2);
            
            JOptionPane.showMessageDialog(null, "The sum is: " + (num1 + num2) + "  and \n" + "the product is: " + (num1 * num2));
            
            again = JOptionPane.showConfirmDialog(null, "Want to continue?");
        }
        while (again == JOptionPane.YES_OPTION);
    }

}
