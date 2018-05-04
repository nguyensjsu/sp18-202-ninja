import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;


public class Counter extends Actor
{
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static int score = 0;
        public static int coin_counter = 0;
        public static int bullet_count = 0;
    public void act() 
    {
        // Add your action code here.
        setImage(new GreenfootImage("    bullet_count: "+bullet_count+ "Score : "+score +"    Coins:"+coin_counter+ "    Lives: "+BlackPantherHero.lives, 22, Color.WHITE, Color.BLACK));
       
    }    
    
    public static void addScore()
    {
                score += 1;
    }
    
    public static void bonusPoints(int points)
    {
        score = score + points;
        if(points!=50 ||points!=100)
        {   
            coin_counter+=1;
        }
        
        if(points==50)
        {
            bullet_count+=1;
        }
    
    }
    
    public static void setStartScore()
    {
        score = 0;
        coin_counter=0;
        bullet_count=0;
        BlackPantherHero.lives=3;
    }
    
}