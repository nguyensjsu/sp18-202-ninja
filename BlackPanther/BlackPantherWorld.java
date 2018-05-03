import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BlackPantherWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlackPantherWorld extends World
{

    /**
     * Constructor for objects of class BlackPantherWorld.
     * 
     */
     int counter = 0;
     private Background img0, img1;
     Counter counter1 = new Counter();
     GameOverLevel2 gameOver = new GameOverLevel2();
     Music m1 = new Music();
     
    public BlackPantherWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
       super(650, 350, 1, false);
       img0 = new Background();
       addObject(img0, getWidth ()/2, getHeight()/2);
       img1 = new Background();
       addObject(img1, getWidth() + getWidth()/2, getHeight()/2);
       BlackPantherHero B1 = new BlackPantherHero();
       addObject(B1,100,getHeight()/2);
       addObject(counter1,220,20);
       
       addObject(m1,getWidth()-20,20);
       Counter.setStartScore();
       
       // m1.getMyMusic().stop();   //Changed by rohit.
       m1=new Music("Game_of_Thrones(HBO).mp3");
       m1.getMyMusic().play();
               BlackPantherHero.level_qualified = false;
                       BlackPantherHero.game_over = false;

    }
    
    public Counter getCounter()
    {
        return counter1;
    }
    
      
    public void act() {
    
        counter++;
        
        img0.scroll();
        img1.scroll();
        
        
       if(counter % 50 == 0)
        {
            
          Creator P1 = new BlackSpiderHurdleFactory();
    
           
         GreenfootImage image = P1.getActor().getImage();
           
           addObject(P1.getActor(),779,Greenfoot.getRandomNumber(360));
           addObject(P1.getActor(),779,Greenfoot.getRandomNumber(100));
             
         
          Creator P2 = new FrostHurdleFactory();
                          
           addObject(P2.getActor(),900,Greenfoot.getRandomNumber(360));
           addObject(P2.getActor(),900,Greenfoot.getRandomNumber(100));  
        }
        
        
         if(counter %30 == 0)
        {
          
           Creator G1 = new VibraniumFactory();
           
            GreenfootImage img=G1.getActor().getImage();
            //addObject(g1,getWidth(),50);
            addObject(G1.getActor(),669,Greenfoot.getRandomNumber(260));
        }
        
        
        
   
        if(counter %100 == 0)
        {
             
           Creator G3 = new VibraniumFactory(50);
           
            GreenfootImage img=G3.getActor().getImage();
            //addObject(g1,getWidth(),50);
            addObject(G3.getActor(),700,Greenfoot.getRandomNumber(300));
        }
        
        if(counter %150 == 0)
        {
             
           Creator G3 = new VibraniumFactory(100);
           
            GreenfootImage img=G3.getActor().getImage();
            //addObject(g1,getWidth(),50);
            addObject(G3.getActor(),700,Greenfoot.getRandomNumber(100));
        }
        
        if(Counter.coin_counter >= 10)
        {
             m1.getMyMusic().pause();
            BlackPantherHero.level_qualified = true;        
           BlackPantherHero.music = false;
            DispLevelQualified();
        }
    }
    
     private void DispLevelQualified(){
        Greenfoot.setWorld(new ScreenLevel2());
        }
}