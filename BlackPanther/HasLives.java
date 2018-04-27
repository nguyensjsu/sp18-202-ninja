/**
 * Write a description of class HasLives here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HasLives implements BlackPantherState
{
    BlackPantherHero blackPantherHero;

	public HasLives(BlackPantherHero newBlackPantherHero) {
		blackPantherHero= newBlackPantherHero;
	}

	@Override
	public void attackEnemy() {
		System.out.println("BlackPanther can attack on Hurdles");
		
	}
}