/* Given N no.of houses along the street with some amount of money
 * Adjacent houses cannot be stolen
 * Find the max amount that can be stolen */

public class HouseRobber {

	private int maxMoneyRec(int[] Worth, int currIndex) {
		if(currIndex >= Worth.length) {
			return 0;
		}
		
		int stealCurrHouse = Worth[currIndex] + maxMoneyRec(Worth, currIndex+2);
		int skipCurrHouse = maxMoneyRec(Worth, currIndex+1);
		
		return Math.max(stealCurrHouse, skipCurrHouse); 
	}
	
	public int maxMoney(int[] Worth) {
		return maxMoneyRec(Worth, 0);
	}
	
	public static void main(String[] args) {
		HouseRobber hr = new HouseRobber();
		int[] Worth = {6, 7, 1, 30, 8, 2, 4};	
		System.out.println(hr.maxMoney(Worth));
	}

}
