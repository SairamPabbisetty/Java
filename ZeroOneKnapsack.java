
public class ZeroOneKnapsack {

	private int knapSack(int[] profits, int[] weights, int cap, int currInd) {
		if(cap <= 0 || currInd < 0 || currInd >= profits.length) {
			return 0;
		}
		int profit1 = 0, profit2 = 0;
		if(weights[currInd] <= cap) {
			profit1 = profits[currInd] + knapSack(profits, weights, cap-weights[currInd], currInd+1);
			//System.out.println("Profit1 : "+profit1);
			profit2 = knapSack(profits, weights, cap, currInd+1);
			//System.out.println("Profit2 : "+profit2);
		}
		
		return Math.max(profit1, profit2); 
	}
	
	public int knapSack(int[] profits, int[] weights, int cap) {
		return this.knapSack(profits,  weights, cap, 0);
	}
	
	public static void main(String[] args) {
		ZeroOneKnapsack z = new ZeroOneKnapsack();
		int[] profits = {31, 26, 17, 72};
		int[] weights = {3, 1, 2, 5};
		int maxProf = z.knapSack(profits, weights, 7);
		System.out.println("Max Profit : "+maxProf);
	}

}
