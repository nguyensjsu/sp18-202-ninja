import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SecondHurdle here.
 *
 * @author Gaurav Savner
 * @version 1.0
 */
public class SecondHurdle extends Actor
{
    /**
     * Act - do whatever the SecondHurdle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    int Hur_Speed2 = -8;
    int Hur_Speed3 = -5;
    public SecondHurdle(){

    GreenfootImage image = getImage();
        image.scale(image.getWidth() - 80, image.getHeight() - 80);
        setImage(image);

    }

    public void act()
    {
        // Add your action code here.
        setLocation(getX() + Hur_Speed2, getY());
    }
}
