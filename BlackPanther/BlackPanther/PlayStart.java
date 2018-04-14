import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayStart here.
 * 
 * @author (Ninja) 
 * @version (a version number or a date)
 */
public class PlayStart extends Actor
{
    /**
     * Act - do whatever the PlayStart wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new Pantherworld1());
        }
    }    
}
