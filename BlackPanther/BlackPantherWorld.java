import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pantherworld1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlackPantherWorld extends World
{

    /**
     * Constructor for objects of class Pantherworld1.
     * 
     */
    int counter = 0;
    //to keep the images rotating animating got from fallpy bird youtube reference
    private Background image0;
    private Background image1;
    public BlackPantherWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(650, 350, 1, false);
        image0 = new Background();
        addObject(image0, getWidth ()/2, getHeight()/2);
        image1 = new Background();
        addObject(image1, getWidth() + getWidth()/2, getHeight()/2);
        
        
    }
    
    public void act() {
        image0.keepAnimating();
        image1.keepAnimating();
    }
}
