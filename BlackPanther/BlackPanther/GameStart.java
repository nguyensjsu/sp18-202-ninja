import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The initital screen visible to user
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameStart extends Actor
{
    /**
     * Act - do whatever the Start wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        if(Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new BlackPantherWorld());
        }
    }
    
}
