public class Yatzee{
	private String diceOne;
	private String diceTwo;
	private int diceOneValue;
	private int diceTwoValue;
	
	public void roll(){
		//diceOneValue = o;
		//diceTwoValue = t;
		
		Random random = new Random();
		roll = random.nextInt(6) - 1;
		
		Dice diceOne = new Dice(roll);
		Dice diceTwo = new Dice(roll);
		
		diceOne.roll(diceOneValue);
		diceTwo.roll(diceTwoValue);
	}
	
	public int getDiceOne(){
		return diceOneValue;
	}
	public int getDiceTwo(){
		return diceTwoValue;
	}
}