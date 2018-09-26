import java.util.*;

public class Dice{
	private final int DICE_SIZE = 6;
	private int roll;
	
	public void rollDice(int r){
		roll = r;
	}
	public int getRoll(){
		return roll;
	}
}