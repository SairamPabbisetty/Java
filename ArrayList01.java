import java.util.ArrayList;
import java.util.Collections;

public class ArrayList01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(0);
		list.add(10);
		list.add(4);
		list.add(7);
		System.out.println(list);
		
		int ele = list.get(0);
		System.out.println(ele);
		
		list.set(1, 9);
		System.out.println(list);
		
		list.remove(0);
		System.out.println(list);
		
		int size = list.size();
		System.out.println(size);
		
		for(int i=0; i<size; i++) {
			System.out.print(list.get(i));
		}
		
		System.out.println();
		
		Collections.sort(list);
		System.out.println(list);
		
	}

}
