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
	}

}
