import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BlackPanther here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlackPanther extends Actor
{
    /**
     * Act - do whatever the BlackPanther wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int counter=0;
    
    double dy = 0;
    double g = 1.3;
    double speed =-4;
    public static int lives=3;
    
    public static boolean music = true;
    public static boolean level_qualified = false;
    public static boolean isPaused = false;
    Rocket rocket= new Rocket();
    //Counter counter1 = BlackPantherWorld.getCounter();
    public void act() 
    {
        
        counter ++;
         
         if(counter %25 == 0)
         {
             Counter.addScore();
           
       }
         
        
        
        
        
        shootOnCommand();

        if( getOneIntersectingObject(Hurdle.class) != null){
            if(lives<=0)
            {
            DispGameover();
            }
            else
            {
                GreenfootSound myMusic=new GreenfootSound("smb_stomp.wav");
                myMusic.play();
                lives=lives-1;
                getWorld().removeObject(getOneIntersectingObject(Hurdle.class));
                
                 GreenfootImage i = getImage();
       int t = i.getTransparency();
       i.setTransparency(0);
       Greenfoot.delay(5);
       i.setTransparency(t);
       Greenfoot.delay(5);
                
            }
        }
        if( getOneIntersectingObject(SecondHurdle.class) != null){
//        DispGameover();
            if(lives<=0)
            {
            DispGameover();
            }
            else
            {
                if( Music.isMusicPlaying==true)
                 {
                GreenfootSound myMusic=new GreenfootSound("smb_stomp.wav");
                myMusic.play();
            }
                lives=lives-1;
                getWorld().removeObject(getOneIntersectingObject(SecondHurdle.class));
                
                 GreenfootImage i = getImage();
       int t = i.getTransparency();
       i.setTransparency(0);
       Greenfoot.delay(5);
       i.setTransparency(t);
       Greenfoot.delay(5);
            }
        }
        setLocation(getX(),(int)(getY()+dy));
        
        if(Greenfoot.isKeyDown("up")== true)
        {
         dy= speed;
        // Counter.addScore();
        }
        
        
       if(Greenfoot.isKeyDown("right")== true)
        {
         setRotation(20);
         //Counter.addScore();
        } 
        
        if(Greenfoot.isKeyDown("left")== true)
        {
        setRotation(-20);        
        } 
        
        if(getY()<16){
            DispGameover();
        }
        if(getY() > getWorld().getHeight()){
        DispGameover();
        }
        
        if(getOneIntersectingObject(Vibranium.class) != null){
             
             if( Music.isMusicPlaying==true)
              {
             GreenfootSound myMusic=new GreenfootSound("smb_fireball.wav");
             myMusic.play();
            }
             Counter.bonusPoints(1);
             getWorld().removeObject(getOneIntersectingObject(Vibranium.class));
             //myMusic.stop();
        }
        
        if(Greenfoot.isKeyDown("space"))
        {
           music = false;
           isPaused = true;
           Greenfoot.stop();  // Pause the game
        } 
        
       //   if( Counter.coin_counter==10){
      //Greenfoot.setWorld(new BlackPantherWorld2());         
              //  DispLevelQualified();
       // }
          dy = dy+g;  
    }  
    
    private void DispGameover(){
       
         GameOverLevel2 gameOver = new GameOverLevel2();
         getWorld().addObject(gameOver, getWorld().getWidth()/2, getWorld().getHeight()/2);
         Counter cnt=new Counter();
         setImage(new GreenfootImage("Score : "+cnt.score +"    Coins:"+cnt.coin_counter+ "    Lives: "+BlackPanther.lives, 22, Color.WHITE, Color.BLACK));
         music = false;
         Greenfoot.stop();
    }
    
    private void DispLevelQualified(){
       
         GameOverLevel2 gameOver = new GameOverLevel2();
         gameOver.setImage(new GreenfootImage("level_complete.jpg"));
         getWorld().addObject(gameOver, getWorld().getWidth()/2, getWorld().getHeight()/2);
         
         level_qualified = true;
         music = false;
         Greenfoot.stop();
    }
    
   //to destroy hurdles
    public void shootOnCommand(){
        if(Greenfoot.isKeyDown("s"))
        {
            World myWorld= getWorld();
            myWorld.addObject(rocket, 0, 0);
            rocket.setLocation(getX(), getY());
            
            
        }
        
    }


}
