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
   // Subject s = new Subject();
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
}