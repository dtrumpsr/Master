
import junit.framework.*;

public class QueueTester extends TestCase {
  
   // assigning the values
   protected void setUp(){
	  
   }

   
   public void testQueueSize(){
	   Queue<String> greeting  = new LinkedQueue<String>();

	   greeting.enqueue("Hello");
	   greeting.enqueue(", ");
	   greeting.enqueue("World!");

	  
      String result= greeting.dequeue();
      assertTrue(result == "Hello");
   }
   
  
}
