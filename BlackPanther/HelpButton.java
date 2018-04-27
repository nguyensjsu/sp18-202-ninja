/**
 * Write a description of class HelpButton here.
 *
 * @author Gaurav Savner
 * @version 1.0
 */
public class HelpButton
{
    /**
     * Constructor for objects of class HelpButton
     */
    private Instructions instruction;
    public HelpButton()
    {
    }

    public HelpButton(Instructions instruction)
    {
        this.instruction = instruction;
    }

    public void execute()
    {
       instruction.act();
    }
}
