import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Homepage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Homepage extends World
{

    /**
     * Constructor for objects of class Homepage.
     * 
     */
    public Homepage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 650, 1);
        showText("Grab 10 golden coins to Complete Level 1",325,600);

        prepare();
    }
    
    public void prepare() {
        PlayStart ps = new PlayStart();
        addObject(ps, 200, 100);
    }
}
