import junit.framework.*;

public class IntegerCounterTester   extends TestCase  {
    
    public IntegerCounterTester() {
    }
    
    
    protected void setUp(){
 	  
    }
   
    public void testIntegerCounter1() {
        String strTest = "1 40 1 40 40";
        System.out.println("Test 1 input:");
        System.out.println(strTest);
        IntegerCounter iCnt = new IntegerCounter();
        iCnt.putIntegers(strTest);
        System.out.println("Test 1 output:");
        System.out.println(iCnt.getIntegers());
        assertTrue(iCnt.getIntegers().equals("1: 2\n40: 3\n"));
    }

   
    public void testIntegerCounter2() {
        String strTest = "0 5 -4 101 5";
        System.out.println("Test 2 input:");
        System.out.println(strTest);
        IntegerCounter iCnt = new IntegerCounter();
        iCnt.putIntegers(strTest);
        System.out.println("Test 2 output:");
        System.out.println(iCnt.getIntegers());
        assertTrue(iCnt.getIntegers().equals("0: 1\n5: 2\n"));
    }
 
 
}