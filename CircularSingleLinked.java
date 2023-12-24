
public class CircularSingleLinked {
	
	public Node head;
	public Node tail;
	public int size;
	
	public Node createCSL(int nodeVal) {
		head = new Node();
		Node node = new Node();
		node.val = nodeVal;
		node.next = node;
		head = node;
		tail = node;
		size = 1;
		
		return head;
	}
	
	public void insertNode(int loc, int nodeVal) {
		Node node = new Node();
		node.val = nodeVal;
		if(head == null) {
			createCSL(nodeVal);
		} else if(loc == 0) {
			node.next = head;
			head = node;
			size++;
			tail.next = head;
		} else if(loc >= size) {
			tail.next = node;
			tail = node;
			size++;
			node.next = head;
		} else {
			Node temp = new Node();
			temp = head;
			for(int i=0; i<loc-1; i++) {
				temp = temp.next;
			}
			node.next = temp.next;
			temp.next = node;
			size++;
		}
	}
	
	public void traverse() {
		if(head != null) {
			Node temp = new Node();
			temp = head;
			int count = 1;
			while(count <= size) {
				System.out.print(temp.val+"->");
				temp = temp.next;
				count++;
			}
		} else {
			System.out.println("Circular Single Linked list is empty");
		}
	}
	
	public void searchEle(int ele) {
		if(head != null) {
			Node temp = head;
			for(int i=0; i<size; i++) {
				if(temp.val == ele) {
					System.out.println("Found at locaion : "+i);
				}
				temp = temp.next;
			}
		} else {
			System.out.println("Element not found");
		}
	}
	
	public void deleteNode(int loc) {
		if(head == null) {
			System.out.println("List is empty");
		} else if(loc == 0) {
			head = head.next;
			tail.next = head;
			size--;
			if(size == 0) {
				tail = null;
				head.next = null;
				head = null;
			}
		} else if(loc >= size) {
			Node temp = new Node();
			for(int i=0; i<loc-1; i++) {
				temp = temp.next;
			}
			if(temp == head) {
				head.next = null;
				size--;
			}
			temp.next = head;
			tail = temp;
			size--;
		} else {
			Node temp = new Node();
			for(int i=0; i<loc-1; i++) {
				temp = temp.next;
			}
			temp.next = temp.next.next;
			size--;
		}
	}
	
	public static void main(String[] args) {
		CircularSingleLinked csl = new CircularSingleLinked();
		
		//csl.createCSL(0);
		/* System.out.println(csl.head.val);
		System.out.println(csl.head.next.val); */
		
		csl.insertNode(0, 1);
		csl.insertNode(1, 2);
		csl.insertNode(2, 3);
		csl.insertNode(3, 4);
		
		csl.traverse();
		System.out.println("");
		
		//csl.searchEle(1);
		
		csl.deleteNode(2);
		csl.traverse();
		
	}

}
