

import junit.framework.*;

public class ConverterTest extends TestCase {
  
   // assigning the values
   protected void setUp(){
	 
   }

   
   public void testValidInteger(){
      Integer result= Converter.Convert("232424");
      assertTrue(result.intValue() == 232424);
   }
   
   public void testInValidInteger(){
	   Integer result= Converter.Convert("asfsd");
	      assertTrue(result == null);
	   }
}
