import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScreenLevel2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScreenLevel2 extends World
{

    /**
     * Constructor for objects of class ScreenLevel2.
     * 
     */
    Music m1=new Music();
   
    public ScreenLevel2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(650, 350, 1, false); 
        
         m1.getMyMusic().pause();
        m1=new Music("level_complete.mp3");
         m1.getMyMusic().play();
          BlackPantherHero.level_qualified = true;        
        BlackPantherHero.music = false; 
        BlackPantherHero.game_over = false; 
        PlayAgain pg = new PlayAgain();           
        NextLevel new_level = new NextLevel(); 
        PlayAgain playagain2 = new PlayAgain();
        addObject(playagain2,139,317);
        NextLevel nextlevel = new NextLevel();
        addObject(nextlevel,503,323);
        nextlevel.setLocation(498,317);
    }
    
    public void act() {
    }
}
