import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Vibranium here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Vibranium extends VibraniumTemplate
{
    /**
     * Act - do whatever the Vibranium wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public Vibranium(){
    GreenfootImage image = getImage();
        image.scale(image.getWidth() - 40, image.getHeight() - 40);
        setImage(image);

    }
    public  void incrementScore()
    {
        //to add counter code here once pradnyesh finishes counter with observer pattern
        Counter.bonusPoints(30);
    }
    int Grab_Speed = -8;
}
