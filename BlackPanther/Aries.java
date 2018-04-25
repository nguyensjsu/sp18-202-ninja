
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hurdle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Aries extends Hurdles
{ 
   
   int Hur_Speed = -8;
   int Hur_Speed1 = -5;
   public void act() 
   {
        // Add your action code here.
        setLocation(getX() + Hur_Speed, getY());
   }    
    
   
   public Aries(){
     GreenfootImage image = getImage();
        image.scale(image.getWidth() - 400, image.getHeight() -400);
        setImage(image);
   }
     
}
