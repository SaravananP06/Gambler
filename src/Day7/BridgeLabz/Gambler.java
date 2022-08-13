package Day7.BridgeLabz;
/*
 * This program Gambler, will bet $1
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
		 * Random variable to see win or loose
		 */
		double win = Math.floor(Math.random() * 10) % 2;
		/*
		 * betting $1 from stake
		 */
		System.out.println("Betting $1 from stake "+ stake);
		System.out.println("remaining stake: "+(stake -= bet));
		
	}

}
