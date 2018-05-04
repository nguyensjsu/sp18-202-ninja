import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hurdles here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hurdle extends Actor
{
    /**
     * Act - do whatever the Hurdles wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int Hur_Speed = -8;
   int Hur_Speed1 = -5;
    public void act() 
    {
        // Add your action code here.
        setLocation(getX() + Hur_Speed, getY());
    }    
    
}
