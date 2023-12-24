
public class MinCostToReachLastCell {

	public int findMinCost(int[][] cost, int row, int col) {
		if(row==-1 || col==-1) {
			return Integer.MAX_VALUE;
		}
		if(row==0 && col==0) {
			return cost[0][0];
		}
		int min1 = findMinCost(cost, row, col-1);
		int min2 = findMinCost(cost, row-1, col);
		int minCost = Integer.min(min1, min2);
		
		return minCost + cost[row][col];
	}
	
	public static void main(String[] args) {
		
	}

}
