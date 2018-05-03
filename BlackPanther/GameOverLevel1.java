import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOverLevel1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOverLevel1 extends World
{
    Music m1=new Music();
    /**
     * Constructor for objects of class GameOverLevel1.
     * 
     */
    public GameOverLevel1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(650, 350, 1); 
        m1.getMyMusic().pause();
        m1=new Music("smb_bowserfalls.wav");
        m1.getMyMusic().play();       
        BlackPantherHero.music = false;
        BlackPantherHero.level_qualified = false; 
        PlayAgain playagain2 = new PlayAgain();
        addObject(playagain2,330,217);
        
    }
}
