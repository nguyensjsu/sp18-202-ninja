/**
 * Write a description of class FrostHurdleFactory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import greenfoot.*;
public class FrostHurdleFactory  extends Creator 
{
    // instance variables - replace the example below with your own
    private int x;

    
    public Actor getActor(){
    return new FrostHurdle();
    }
    /**
     * Constructor for objects of class FrostHurdleFactory
     */
    public FrostHurdleFactory()
    {
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
