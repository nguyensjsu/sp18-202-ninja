import greenfoot.*;

/**
 * Write a description of class VibraniumFactory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import greenfoot.*;

public class VibraniumFactory  extends Creator 
{
    private String type="";
    public VibraniumFactory()
    {
        
    }
    
    public VibraniumFactory(int type)
    {
        if(type==50)
        {
            this.type="Type1";
        }
        else if(type==100)
        {
            this.type="Type2";
        }
    }
     public Actor getActor(){
         if(this.type == "Type1")
         return new Vibranium50();
         else if(this.type == "Type2")
         return new Vibranium100();
         else
         return new Vibranium();
 
    }
}
