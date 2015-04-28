
import junit.framework.*;

public class ListTester extends TestCase {
   
   protected void setUp(){
	  
   }

   
   public void testSingleLinkedList(){
	   SLinkedList  staff = new SLinkedList();
	      staff.add("Dick");
	      staff.add("Harry");
	      staff.add("Romeo");
	      staff.add("Tom");	     
	      assertTrue(staff.get(2).toString() == "Harry");
   }
   
   
   public void testArrayList(){
	   ArrayList  staff = new ArrayList();
	      staff.add("Dick");
	      staff.add("Harry");
	      staff.add("Romeo");
	      staff.add("Tom");	     
	      assertTrue(staff.get(2).toString() == "Romeo");
   }
  
}
