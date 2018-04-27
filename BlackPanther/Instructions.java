import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Description:
 *
 * @author Gaurav Savner
 * @version 1.0
 */
public class Instructions extends Actor
{
    /**
     * Act - do whatever the Instructions wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new InstructionWorld());
        }
    }

    public Instructions(){
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 100, image.getHeight() - 100);
        setImage(image);
    }
}
