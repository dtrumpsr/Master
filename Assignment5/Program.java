import java.util.Scanner;


public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	      
	      System.out.println("Input the value of the first die:");
	     String str1 = in.nextLine();	
	     int num1 = Integer.parseInt(str1);
	     System.out.println("Input the value of the second die:");
	     String str2 = in.nextLine();	
	     int num2 = Integer.parseInt(str2);
	     Die die1 =new Die(num1);
			Die die2 =new Die(num2);
			PairOfDice pairOfDice = new PairOfDice();
			pairOfDice.setDie1(die1);
			pairOfDice.setDie2(die2);
	     System.out.println("The sum is: "+ pairOfDice.GetSum());
	}

}


