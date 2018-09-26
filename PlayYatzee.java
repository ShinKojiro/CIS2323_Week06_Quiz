import java.util.*;
import javax.swing.*;

public class PlayYatzee{
	public static void main(String[] args){
		Boolean quit = false;
		
		Yatzee game = new Yatzee();
		game.roll();
		System.out.println("Dice one is " + game.getDiceOne());
		System.out.println("Dice two is " + game.getDiceTwo());
		
		System.out.println("\n--->Play again");
		System.out.println("--->Quit");
		
		
	}
}