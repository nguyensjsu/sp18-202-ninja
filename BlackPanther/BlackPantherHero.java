import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BlackPanther here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlackPantherHero extends Actor
{
	int counter=0;
    double dy = 0;
    double g = 1.3;
    double speed =-4;
    public static int lives=3;
    public static boolean music = true;
    public static boolean level_qualified = false;
     public static boolean game_over = false;
    public static boolean isPaused = false;
    BlackPantherState hasLives;
    BlackPantherState noLives;
    BlackPantherState blackPantherstate;
    int noOfLives=3;
    
    Rocket rocket= new Rocket();
    GreenfootImage i = getImage();
    GameOverLevel2 gameOver = new GameOverLevel2();
    
        ConcreteScoreUpdate si = new ConcreteScoreUpdate();
   ScoreData s = new ScoreData();
   CheckLives l = new CheckLives();

    public BlackPantherHero(){
        hasLives= new HasLives(this);
        noLives= new NoLives(this);
        blackPantherstate= hasLives;
        s.registerObserver(l);
        s.registerObserver(si);
        if(noOfLives == 0){
            blackPantherstate= noLives;
        }
    }
    

    void setBlackPantherState(BlackPantherState newBlackPantherState){
        blackPantherstate= newBlackPantherState;
    }
    public BlackPantherState getHasLivesState(){
        System.out.println("In HasLivesState");
        return hasLives;
        
    } 
    public BlackPantherState getNoLivesState(){
        System.out.println("In NoLivesState");
        return noLives;
        
    }

    public void act() 
    {
        counter ++;
        shootOnCommand();

         
         if(counter %25 == 0)
           {
             //si.update(Counter.score, lives);
             s.dataChanged();
            // Counter.addScore();
           }
         
         if( getOneIntersectingObject(BlackSpiderHurdle.class) != null){
            if(lives<=0)
            {
             DispGameover();
            }
            else
            {
                GreenfootSound myMusic=new GreenfootSound("attack.mp3");
                myMusic.play();
                lives=lives-1;
                getWorld().removeObject(getOneIntersectingObject(BlackSpiderHurdle.class));
                int t = i.getTransparency();
                i.setTransparency(0);
                Greenfoot.delay(5);
                i.setTransparency(t);
                Greenfoot.delay(5);
            }
         }
         if( getOneIntersectingObject(FrostHurdle.class) != null){
//        DispGameover();
            if(lives<=0)
            {
            DispGameover();
            }
            else
            {
                if( Music.isMusicPlaying==true)
                 {
                GreenfootSound myMusic=new GreenfootSound("attack.mp3");
                myMusic.play();
            }
                lives=lives-1;
                getWorld().removeObject(getOneIntersectingObject(FrostHurdle.class));
                int t = i.getTransparency();
                i.setTransparency(0);
                Greenfoot.delay(5);
                i.setTransparency(t);
                Greenfoot.delay(5);
            }
        }
        if( getOneIntersectingObject(Aries.class) != null){
            if(lives<=0)
            {
             DispGameover();
            }
            else
            {
                GreenfootSound myMusic=new GreenfootSound("attack.mp3");
                myMusic.play();
                lives=lives-1;
                getWorld().removeObject(getOneIntersectingObject(BlackSpiderHurdle.class));
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
        }
        
        
       if(Greenfoot.isKeyDown("right")== true)
        {
         setRotation(20); 
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
             Counter.bonusPoints(30);
             getWorld().removeObject(getOneIntersectingObject(Vibranium.class));
             //myMusic.stop();
        }
        
        if(getOneIntersectingObject(Vibranium50.class) != null){
             Vibranium50 b1=new Vibranium50();
             if( Music.isMusicPlaying==true)
              {
             GreenfootSound myMusic=new GreenfootSound("smb_fireball.wav");
             myMusic.play();
            }
            b1.incrementScore();
            
            //Counter.bonusPoints(50);
             getWorld().removeObject(getOneIntersectingObject(Vibranium50.class));
             //myMusic.stop();
        }
        
        if(getOneIntersectingObject(Vibranium100.class) != null){
             Vibranium100 b1=new Vibranium100();
             if( Music.isMusicPlaying==true)
              {
             GreenfootSound myMusic=new GreenfootSound("smb_fireball.wav");
             myMusic.play();
            }
            b1.incrementScore();
            // Counter.bonusPoints(100);
             getWorld().removeObject(getOneIntersectingObject(Vibranium100.class));
             //myMusic.stop();
        }
        
        if(Greenfoot.isKeyDown("space"))
        {
           music = false;
           isPaused = true;
           Greenfoot.stop();  // Pause the game
        } 
        
        dy = dy+g;
        
    }

    private void DispGameover(){      
        music = false;
        level_qualified = false;
                 game_over=true;
        //Greenfoot.stop();
        Greenfoot.setWorld(new GameOverLevel1());       
        
   }
   
   private void DispLevelQualified(){
       
       
        gameOver.setImage(new GreenfootImage("level_complete.jpg"));
        
        getWorld().addObject(gameOver, getWorld().getWidth()/2, getWorld().getHeight()/2);
        level_qualified = true;
                 game_over=false;
        music = false;
        
       }
   
   
   public void shootOnCommand(){
       
       if(Greenfoot.isKeyDown("s"))
       {
           if(Counter.bullet_count>0)
       {
           World myWorld= getWorld();
           myWorld.addObject(rocket, 0, 0);
           rocket.setLocation(getX(), getY());
           Counter.bullet_count-=1;
       }
           
       }
       
   }

}