

import junit.framework.*;

public class StackTester extends TestCase {
  
   // assigning the values
   protected void setUp(){
	  
   }

   
   public void testStackSize(){
	   Stack<String> st = new LinkedStack<String>();

       st.push("String1");
       st.push("String2");
       st.push("String3");
      
       st.pop();
      int result= st.size();
      assertTrue(result == 2);
   }
   
  
}
