
public class LongestPalindromicSubsequence {

	private int findLps(String s, int startInd, int endInd) {
		if(startInd > endInd) {
			return 0;
		}
		if(startInd == endInd) {
			return 1;
		}
		
		int count1 = 0;
		if(s.charAt(startInd) == s.charAt(endInd)) {
			return 2+findLps(s, startInd+1, endInd-1);
		}
		
		int count2 = findLps(s, startInd, endInd-1);
		int count3 = findLps(s, startInd+1, endInd);
		
		return Math.max(count1, Math.max(count2, count3));
	}
	
	public int findLps(String s) {
		return findLps(s, 0, s.length()-1);
	}
	
	public static void main(String[] args) {
		LongestPalindromicSubsequence lps = new LongestPalindromicSubsequence();
		System.out.println(lps.findLps("elrmrnmet"));
	}

}
