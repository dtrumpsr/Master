
import junit.framework.*;

public class GCDTester extends TestCase {
  
   // assigning the values
   protected void setUp(){
	  
   }

   
   public void testGCD1(){
      int result= DivisorCalc.gcd(8, 12);
      assertTrue(result == 4);
   }
   
   public void testGCD2(){
	      int result= DivisorCalc.gcd(18, 22);
	      assertTrue(result == 2);
	   }
}

