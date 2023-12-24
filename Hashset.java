import java.util.*;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> set = new HashSet<>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(1);
		
		System.out.println(set);
		
		System.out.println(set.contains(1));
		
		set.remove(1);
		System.out.println(set);
		
		Iterator it = set.iterator();
		
		While(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
