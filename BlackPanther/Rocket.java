import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends Actor
{
    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     *
     */
        GameOverLevel2 gameOver = new GameOverLevel2();
        Music m1=new Music();
    static int x =  0;
    //  public static boolean music = true;
    public static boolean level_qualified = false;
    public static boolean isPaused = false;
    public void act() 
    {
        
        move(10);
        Actor Aries=getOneIntersectingObject(Aries.class);
        Actor BlackSpiderHurdle= getOneIntersectingObject(BlackSpiderHurdle.class);
        Actor FrostHurdle= getOneIntersectingObject(FrostHurdle.class);
        Actor Rocket= getOneObjectAtOffset(0, 0, Rocket.class);
        if(BlackSpiderHurdle != null || FrostHurdle != null || Rocket!= null)
        {
            World myWorld= getWorld();
           // myWorld.removeObject(NewHurdle1);
            myWorld.removeObject(BlackSpiderHurdle);
            myWorld.removeObject(FrostHurdle);
            myWorld.removeObject(Rocket);   
        }
        
        if(Aries!=null)
        {
            World myWorld= getWorld();
            
                myWorld.removeObject(Aries);
                
                m1.getMyMusic().stop();
                m1=new Music("level_complete.mp3");
         m1.getMyMusic().play();
                
                gameOver.setImage(new GreenfootImage("finalethrone.jpg"));
         
         getWorld().addObject(gameOver, getWorld().getWidth()/2, getWorld().getHeight()/2);
         level_qualified = true;
         
         
         Greenfoot.stop();
        
         
            }
           

        }
        
    }