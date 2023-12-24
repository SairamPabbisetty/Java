
public class LongestCommonSubsequence {
	
	private int findLcs(String s1, String s2, int i1, int i2) {
		if((i1 == s1.length()) || (i2 == s2.length())) {
			return 0;
		}
		int c1 = 0;
		if(s1.charAt(i1)==s2.charAt(i2)) {
			c1 = 1+findLcs(s1, s2, i1+1, i2+1);
		}
		
		int c2 = findLcs(s1, s2, i1, i2+1);
		int c3 = findLcs(s1, s2, i1+1, i2);
		
		return Math.max(c1, Math.max(c2, c3));
	}
	
	public int findLcs(String s1, String s2) {
		return findLcs(s1, s2, 0, 0);
	}
	
	public static void main(String[] args) {
		LongestCommonSubsequence lcs = new LongestCommonSubsequence();
		System.out.println(lcs.findLcs("elephant", "erepat"));
	}
}
