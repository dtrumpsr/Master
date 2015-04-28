
public class DivisorCalc {
	
	 public static int gcd(int num1, int num2)  {
		    if (num2 <= num1  && num1 % num2 == 0) {
		      return num2;
		    }
		    else 
		    {
		      if (num1 < num2)
		    	  return gcd(num2, num1) ;
		    }
		    return gcd(num2, num1 % num2);
		  }

}
