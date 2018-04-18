import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Title here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScreenLevel1 extends World
{

    /**
     * Constructor for objects of class Title.
     * 
     */
    public ScreenLevel1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        //super(1000, 700, 1); 
        super(650, 350, 1, false); 
        
        showText("Complete Level 1 by grabbing 10 gold coins",325,325);
        
        GameStart gameStart = new GameStart();
        addObject(gameStart, 315, 304);
        gameStart.act();
        gameStart.setLocation(340,61);
        gameStart.setLocation(340,61);
        gameStart.setLocation(340,61);
        gameStart.setLocation(340,61);
        gameStart.setLocation(340,61);
        gameStart.setLocation(340,61);
        gameStart.setLocation(340,61);
        gameStart.setLocation(531,63);
        
        gameStart.setLocation(351,58);
        
      
    }
  public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new BlackPantherWorld());
        }

    }

    
}

