import greenfoot.*;
/**
 * Write a description of class FirstHurdleFactory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import greenfoot.*;
public class FirstHurdleFactory  extends Creator 
{
   
    public Actor getActor(){
        return new Hurdle();
    }
}
