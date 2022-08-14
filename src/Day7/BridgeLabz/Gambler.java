package Day7.BridgeLabz;
/*
 * This program If gambler won or lost 50% of the stake,
 * would resign for the day
 * For 20 days tracking every day win or loose 
 */

public class Gambler {
	public static final int NUM_OF_DAYS = 20;
	public static final int BET = 1;

	public static void main(String[] args) {
		System.out.println("Welcome to Gambler Program");
		/*
		 * Variables
		 */
		int stake = 100;
		int round = 0;
		for (int day = 1; day<=NUM_OF_DAYS; day++) {
			System.out.println("Day "+day);
			int trials = stake;
			/*
			 * Taking while loop with condition won or lost 50% of the stake
			 */
			while ((stake > (trials/2)) && stake < (trials+(trials/2))) {
				round++;
				System.out.println("round "+round);
				/*
				 * betting $1 from stake
				 */
				System.out.println("Betting $1 from stake "+ stake);
				System.out.println("remaining stake: "+(stake -= BET));	
				/*
				 * Random variable for win or loose
				 */
				int win = (int) Math.floor(Math.random() * 10) % 2;
				if (win == 1) {
					stake += (BET *2);
					System.out.println("Congratulations! You won $1");
				}else {
					System.out.println("Sorry! You loose $1");
				}System.out.println("The stake we have: "+stake);
				
				
			}
			System.out.println("Resigning for the day with stake $"+ stake);
			
			if (stake > trials) {
				System.out.println("Won $"+Math.abs(trials - stake)+" for day " +day);
			}else {
				System.out.println("Loose $"+Math.abs(trials - stake)+" for day " +day);
			}
		
		}
	}

}
