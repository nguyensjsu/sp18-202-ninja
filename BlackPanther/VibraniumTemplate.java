import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VibraniumTemplate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class VibraniumTemplate extends Actor
{
    /**
     * Act - do whatever the VibraniumTemplate wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int Grab_Speed = -8;
    double dy = 0;
    double g = 1.3;
    public final void act() 
    {
        // Add your action code here.
        setLocation(getX() + Grab_Speed, getY());
        
        if(Greenfoot.isKeyDown("up")== true)
        {
            dy= -4;
        }
        dy = dy+g;
    }
    
    public abstract  void incrementScore();
    
}
