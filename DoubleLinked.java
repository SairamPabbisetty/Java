
public class DoubleLinked {

	DoubleNode head;
	DoubleNode tail;
	int size;
	
	public DoubleNode createDll(int value) {
		head = new DoubleNode();
		DoubleNode newNode = new DoubleNode();
		newNode.val = value;
		newNode.next = null;
		newNode.prev = null;
		head = newNode;
		tail = newNode; 
		size = 1;
		
		return head;
	}
	
	public void insertNode(int nodeVal, int loc) {
		DoubleNode node = new DoubleNode();
		node.val = nodeVal;
		if(head == null) {
			createDll(nodeVal);
		} else if(loc == 0) {
			node.next = head;
			node.prev = null;
			head.prev = node;
			head = node;
		} else if(loc >= size) {
			node.next = null;
			node.prev = tail;
			tail.next = node;
			tail = node;
		} else {
			DoubleNode temp = head;
			for(int i=0; i<loc-1; i++) {
				temp = temp.next;
			}
			node.prev = temp;
			node.next = temp.next;
			temp.next = node;
			node.next.prev = node;
		}
		size++;
	}
	
	public void traverse() {
		DoubleNode temp = head;
		while(temp != null){
			System.out.print(temp.val+"->");
			temp = temp.next;
		}
		System.out.println("");
	}
	
	public void travRev() {
		DoubleNode temp = tail;
		while(temp != null) {
			System.out.print(temp.val+"->");
			temp = temp.prev;
		}
		System.out.println("");
	}
	
	public boolean searchNode(int nodeVal) {
		if(head != null) {
			DoubleNode temp = head;
			for(int i=0; i<size; i++) {
				if(temp.val == nodeVal) {
					System.out.println("The node is found at position "+(i+1));
					
					return true;
				}
				temp = temp.next;
			}
		}
		System.out.println("Node not found");
		
		return false;
	}
	
	public void deleteNode(int loc) {
		if(head == null) {
			System.out.println("List does not exist");
		} else {
			if(loc == 0) {
				if(size == 1) {
					head = tail = null;
				} else {
					head = head.next;
					head.prev = null;
				}
			} else if(loc >= size) {
				DoubleNode temp = tail.prev;
				if(size == 1) {
					head = tail = null;
				} else {
					temp.next = null;
					tail = temp;
				}
			} else {
				DoubleNode temp = head;
				for(int i=0; i<loc-1; i++) {
					temp = temp.next;
				}
				temp.next = temp.next.next;
				temp.next.prev = temp;
			}
			
			size--;
		}
	}
	
	public static void main(String[] args) {
		DoubleLinked dl = new DoubleLinked();
		
		dl.createDll(0);
		dl.insertNode(1, 1);
		dl.insertNode(2, 2);
		dl.insertNode(4, 3);
		dl.traverse();
		dl.insertNode(3, 3);
		dl.traverse();
		dl.travRev();
		dl.searchNode(2);
		dl.searchNode(11);
		dl.deleteNode(2);
		dl.traverse();
	}

}
