import java.util.*;

public class LL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("llo");
		list.addFirst("He");
		list.addLast("World");
		System.out.println(list);
		
		System.out.println(list.size());
		
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		
		System.out.println();
		
		list.removeFirst();
		System.out.println(list);
		
		list.remove(1);
		System.out.println(list);
	}

}
