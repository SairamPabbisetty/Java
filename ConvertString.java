
public class ConvertString {

	private int findMinOper(String s1, String s2, int i1, int i2) {
		if(i1 == s1.length()) {
			return s2.length()-i2;
		}
		if(i2 == s2.length()) {
			return s1.length()-i1;
		}
		if(s1.charAt(i1)==s2.charAt(i2)) {
			return findMinOper(s1, s2, i1+1, i2+1);
		}
		
		//System.out.println("i1 = "+i1+" i2 = "+i2);
		int delOp = 1 + findMinOper(s1, s2, i1+1, i2);
		//System.out.println("delOp : "+delOp);
		//System.out.println("i1 = "+i1+" i2 = "+i2);
		int insOp = 1 + findMinOper(s1, s2, i1, i2+1);
		//System.out.println("insOp : "+insOp);
		//System.out.println("i1 = "+i1+" i2 = "+i2);
		int repOp = 1 + findMinOper(s1, s2, i1+1, i2+1);
		//System.out.println("repOp : "+repOp);
		//System.out.println("i1 = "+i1+" i2 = "+i2);
		
		return Math.min(delOp, Math.min(insOp, repOp)); 
	}
	
	public int findMinOper(String s1, String s2) {
		return findMinOper(s1, s2, 0, 0);
	}
	
	public static void main(String[] args) {
		ConvertString cs = new ConvertString();
		System.out.println("Min Operations : "+cs.findMinOper("table", "tbres"));
	}

}
