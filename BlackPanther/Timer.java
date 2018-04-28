import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Timer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Timer extends Actor
{
    /**
     * Act - do whatever the Timer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int MAX;
    private int seconds;
    
    public Timer (int sec) { 
        MAX = sec; 
        seconds = 0; 

    }
    
    public void count () { 
        if (this.seconds < MAX) 
            this.seconds++; 
    }
    
    public void reset () { 
        seconds = 0; 
    }
    
    public double getCount () { 
        double sec = this.seconds;
        sec = sec / 100; 
        return (sec);
    }
    
    public void act() 
    {
        // Add your action code here.
        // Add count after pradynesh update
        count(); 
    }    
}