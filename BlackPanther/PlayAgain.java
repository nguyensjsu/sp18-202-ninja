import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayAgain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayAgain extends Actor
{
    /**
     * Act - do whatever the PlayAgain wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
		 if (Greenfoot.mouseClicked(this)) {
                     Greenfoot.setWorld(new BlackPantherWorld());
                             BlackPantherHero.level_qualified = false; 
                             BlackPantherHero.game_over = false; 
                             BlackPantherHero.music = true;
    }
}
}
