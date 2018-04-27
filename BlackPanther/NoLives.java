/**
 * Write a description of class NoLives here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NoLives implements BlackPantherState
{
   BlackPantherHero blackPantherHero;
	
	public NoLives(BlackPantherHero newBlackPantherHero) {
		blackPantherHero= newBlackPantherHero;
	}

	@Override
	public void attackEnemy() {
		System.out.println("BlackPanther can not attack on Hurdles");
		
	}
}