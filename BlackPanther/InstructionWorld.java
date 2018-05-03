import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InstructionWorld here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class InstructionWorld extends World
{

    /**
     * Constructor for objects of class InstructionWorld.
     *
     */
    public InstructionWorld()
    {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        //super(720, 400, 1);
        GameStart s1 = new GameStart();
        addObject(s1, getWidth()/2-105, getHeight()/2-90);
    }

    public void act(){
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new BlackPantherWorld());
   }
}
}
