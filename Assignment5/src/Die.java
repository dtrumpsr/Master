
public class Die
{
	private int face = 1;
 public Die(int num)
 {
	 face=num;
 }
  

  // Get current value
  public int getRoll ()  {
    return face;
  }

  //Roll the die, return new value
  public int rollDie ( )  {
	if( face <=0 || face >7)	
		face = (int)(Math.random()*6 + 1);
    return face;
  }
  
  

}