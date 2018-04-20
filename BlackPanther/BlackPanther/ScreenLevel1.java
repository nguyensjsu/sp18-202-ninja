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
        
        
        
      
    }
  public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new BlackPantherWorld());
        }

    }
     private void prepare()
    {
        GameStart start = new GameStart();
        addObject(start,100,304);
        ButtonPlay button = new ButtonPlay(start);
        button.execute();
        
        Instructions instructions = new Instructions();
        addObject(instructions,562,93);
        HelpButton buttonhelp = new HelpButton(instructions);
        buttonhelp.execute();
        
        start.setLocation(340,61);
        start.setLocation(340,61);
        start.setLocation(340,61);
        start.setLocation(340,61);
        start.setLocation(340,61);
        start.setLocation(340,61);
        start.setLocation(340,61);
        start.setLocation(531,63);
        instructions.setLocation(58,79);
        start.setLocation(351,58);
        instructions.setLocation(55,55);
    }

    
}

