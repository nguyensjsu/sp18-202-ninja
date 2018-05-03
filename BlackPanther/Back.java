import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Back here.
 *
 * @author Gaurav Savner
 * @version 1.0
 */
public class Back extends Actor
{
    /**
     * Act - do whatever the Back wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if (Greenfoot.mouseClicked(this)) {
                     Greenfoot.setWorld(new ScreenLevel1());
        }
    }

    public Back() {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 150, image.getHeight() - 150);
        setImage(image);
    }
}
