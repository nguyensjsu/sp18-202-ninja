import greenfoot.*; 
/**
 * Write a description of class FrostHurdle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FrostHurdle extends Hurdles  
{
    int Hur_Speed2 = -12;
    int Hur_Speed3 = -5;
    public void act() 
    {
        // Add your action code here.
        setLocation(getX() + Hur_Speed2, getY());
    }  
    
    public FrostHurdle(){
        GreenfootImage image = getImage();
        image.scale(image.getWidth() , image.getHeight() );
        setImage(image);
    }
}
