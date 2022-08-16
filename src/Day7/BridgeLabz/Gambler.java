package Day7.BridgeLabz;

/*
 * This program If gambler won or lost 50% of the stake,
 * would resign for the day
 * For 20 days tracking every day win or loose 
 * For 12 months tracking how much days won and lost 
 */

public class Gambler {
	public static final int NUM_OF_DAYS = 20;
	public static final int MONTHS = 12;
	public static final int BET = 1;

	public static void main(String[] args) {
		System.out.println("Welcome to Gambler Program");
		/*
		 * Variables
		 */
		double stake = 100;
		double trials = 100;
		int month = 0;
		while (month < 12) {
			month++;
			int won = 0;
			int lost = 0;
			
			for (int day = 1; day<=NUM_OF_DAYS; day++) {
				/*
				 * Taking stake as 100 if stake becomes zero
				 */
				if (stake == 0) {
					stake = stake + 100;
					System.out.println("Stake got 100$ "+stake);
				}
				trials = stake;
				/*
				 * Taking while loop with condition won or lost 50% of the stake
				 */
				while ((stake > (trials/2)) && stake < (trials+(trials/2))) {
					/*
					 * betting $1 from stake
					 */
					stake -= BET;	
					/*
					 * Random variable for win or loose
					 */
					int win = (int) Math.floor(Math.random() * 10) % 2;
					switch (win) {
					case 1:
						stake += (BET *2);
						break;
					default:
						break;
					}
				}
				if (stake > trials) {
					System.out.println("Day# Gambling Day: " + day + " Won: " + Math.abs(trials - stake));
					won+=1;
				}else { 
					System.out.println("Day# Gambling Day: " + day + " Loose: " + Math.abs(trials - stake));
					lost+=1;
				}
				
			}
			System.out.println("Month# Gambling Month: " + month + " Total "+ won + " Won" );
			System.out.println("Month# Gambling Month: " + month + " Total "+ lost + " Loose");
			System.out.println();
		}
	
	}


}
