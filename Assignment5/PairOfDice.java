
public class PairOfDice {

	private Die die1=null;
	private Die die2=null;
	
	 public Die getDie1() {
	        return die1;
	    }

	    public void setDie1(Die die) {
	       this.die1 = die;
	    }
	    
	    public Die getDie2() {
	        return die1;
	    }

	    public void setDie2(Die die) {
	       this.die2 = die;
	    }
	    
	    public int GetSum()
	    {
	    	return die1.rollDie()+ die2.rollDie();
	    }
}
