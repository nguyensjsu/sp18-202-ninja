import greenfoot.*;

/**
 * Description
 *
 * @author Gaurav Savner
 * @version 1.0
 */
public class GameStart extends Actor
{
    /**
     * Act - do whatever the GameStart wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void act()
    {
        // Add your action code here.
         if (Greenfoot.mouseClicked(this)) {
             Greenfoot.setWorld(new BlackPantherWorld());
         }
     }
}
