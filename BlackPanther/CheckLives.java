import greenfoot.*;
public class CheckLives implements Observer 
{
    
    int live = 0;

    /**
     * Constructor for objects of class CheckLives
     */
    public CheckLives()
    {
    }

    /**Here this observer checks how many lives are remaining. 
     * if no lives are remaining the game stops
     */
     Counter c1=  new Counter();

    public void update()
    {
        if(live < 0)
		{
		    DispGameover();
		}
	}
	
	private void DispGameover(){
	     
         Greenfoot.stop();
    }
}