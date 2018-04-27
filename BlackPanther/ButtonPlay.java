/**
 * Write a description of class ButtonPlay here.
 *
 * @author Gaurav Savner
 * @version 1.0
 */
public class ButtonPlay
{

    private int x;
    private GameStart start;
    /**
     * Constructor for objects of class ButtonPlay
     */
    public ButtonPlay(GameStart start)
    {
        this.start = start;
    }


    public void execute()
    {
       start.act();

    }
}
