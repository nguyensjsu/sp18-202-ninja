import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Music here.
 *
 * @author (Team Ninja - Venkatesh)
 * @version (a version number or a date)
 */
public class Music extends Actor
{
    /**
     * Act - do whatever the Music wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static boolean isMusicPlaying=true;
    private static GreenfootSound myMusic=new GreenfootSound("Game_of_Thrones(HBO).mp3");
    boolean firstTurn=true;
    
    public static void stopBackgroundMusic()
    {
        myMusic.stop();
    }
    
    public Music()
    {
        
    }
    
    public Music(String filename)
    {
        
        myMusic=new GreenfootSound(filename);
    }
    
    public GreenfootSound getMyMusic()
    {
        return myMusic;
    }
    
    
    public void act()
    {
        
        if(firstTurn)
        {
            myMusic.play();
            firstTurn=false;
        }
        
        if(BlackPantherHero.music == false)
        {
            myMusic.pause();
            myMusic=new GreenfootSound("smb_bowserfalls.wav");
            myMusic.play();
            BlackPantherHero.music = true;
        }
        
        if(BlackPantherHero.level_qualified == true)
        {
            if( isMusicPlaying==true)
            {
                myMusic.pause();
                myMusic=new GreenfootSound("level_complete.mp3");
                myMusic.play();
                BlackPantherHero.music = true;
                BlackPantherHero.level_qualified = false;
            }
        }
        
        if(BlackPantherHero.game_over == true)
        {
            if( isMusicPlaying==true)
            {
                myMusic.pause();
                myMusic=new GreenfootSound("smb_bowserfalls.wav");
                myMusic.play();
                BlackPantherHero.music = true;
                BlackPantherHero.level_qualified = false;
                BlackPantherHero.game_over=false;
            }
        }
        
        if(Greenfoot.mouseClicked(this))
        {
            
            if(myMusic.isPlaying())
            {
                isMusicPlaying=false;
                myMusic.pause();
                setImage("mute.png");
            }
            else
            {
                isMusicPlaying=true;
                myMusic.play();
                setImage("unmute.png");
            }
        }
    }      
}
