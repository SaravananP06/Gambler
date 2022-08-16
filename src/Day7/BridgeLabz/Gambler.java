package Day7.BridgeLabz;

import java.util.Dictionary;
import java.util.Hashtable;

/*
 * This program If gambler won or lost 50% of the stake,
 * would resign for the day
 * For 20 days tracking every day win or loose 
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
		int stake = 100;
		int trials = 100;			
		for (int day = 1; day<=NUM_OF_DAYS; day++) {
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
			}else { 
				System.out.println("Day# Gambling Day: " + day + " Loose: " + Math.abs(trials - stake));
			}
		
		}
	}


}
