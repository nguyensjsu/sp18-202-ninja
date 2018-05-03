/**
 * Write a description of class Vibranium50 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import greenfoot.*;
public class Vibranium50 extends VibraniumTemplate
{

	public Vibranium50(){
    GreenfootImage image = getImage();
        image.scale(image.getWidth() - 40, image.getHeight() - 40);
        setImage(image);
    }
    
    public  void incrementScore()
    {
        //to add counter code here once pradnyesh finishes counter with observer pattern
        Counter.bonusPoints(50);
    }

}
