import java.util.*;

public class Queue01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> q = new LinkedList<>();
		
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		
		System.out.println(q);
		
		System.out.println(q.peek());
		
		q.remove();
		System.out.println(q);
		
		System.out.println(q.isEmpty());
	}

}
