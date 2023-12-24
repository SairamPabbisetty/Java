//Give N, find the no.of ways to express N as sum of 1, 3, and 4. 

public class NumberFactor {

	public int getN(int n) {
		if((n==0) || (n==1) || (n==2)) {
			return 1; 
		}
		if(n==3) {
			return 2;
		}
		int sub1 = getN(n-1);
		int sub2 = getN(n-3);
		int sub3 = getN(n-4); 
		
		return sub1+sub2+sub3; 
	}
	
	public static void main(String[] args) {
		NumberFactor nf = new NumberFactor();
		System.out.println(nf.getN(4));
		System.out.println(nf.getN(5));
		System.out.println(nf.getN(6));
	}

}
