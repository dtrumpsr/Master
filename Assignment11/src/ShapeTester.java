

import junit.framework.*;

public class ShapeTester extends TestCase {
  
   // assigning the values
   protected void setUp(){
	  
   }

   
   public void testCircleArea(){
	   Circle circle=new Circle("c1", 2);
      double result= circle.getArea();
      assertTrue(result != 5);
   }
   
   public void testRectangleArea(){
	   Rectangle rec=new Rectangle("r1", 2,3);
      double result= rec.getArea();
      assertTrue(result == 6);
   }
   
   
   public void testRightAngleArea(){
	   RightTriangle rec=new RightTriangle("t2", 6,3);
      double result= rec.getArea();
      assertTrue(result == 9);
   }
  
}
