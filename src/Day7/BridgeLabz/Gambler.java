package Day7.BridgeLabz;
/*
 * This program checking if gambler win or loose
 */

public class Gambler {

	public static void main(String[] args) {
		System.out.println("Welcome to Gambler Program");
		/*
		 * Variables
		 */
		int stake = 100;
		int bet = 1;
		
		/*
		 * betting $1 from stake
		 */
		System.out.println("Betting $1 from stake "+ stake);
		System.out.println("remaining stake: "+(stake -= bet));	
		/*
		 * Random variable for win or loose
		 */
		double win = Math.floor(Math.random() * 10) % 2;
		 
		if (win == 1) {
			stake += (bet *2);
			System.out.println("Congratulations! You won $1");
			System.out.println("After winning, stake = "+stake);
		}else {
			System.out.println("Sorry! You loose $1");
			System.out.println("After loosing, stake = "+stake);
		}
	}

}
