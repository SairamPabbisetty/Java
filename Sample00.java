
public class Sample00 {
	public Node head;
	public Node tail;
	public int size;
	
	public Node createList(int nodeVal) {
		head = new Node();
		Node node = new Node();
		node.next = null;
		node.val = nodeVal;
		head = node;
		tail = node;
		size = 1;
		
		return head;
	}
	
	public void insertInList(int nodeVal, int loc) {
		Node node = new Node();
		node.val = nodeVal;
		if(head == null) {
			createList(nodeVal);
		} else if(loc == 0) {
			node.next = head;
			head = node;
		} else if(loc >= size) {
			node.next = null;
			tail.next = node;
			tail = node;
		} else {
			Node tempNode = head;
			int index = 0;
			while(index < loc-1) {
				tempNode = tempNode.next;
				index++;
			}
			Node nextNode = tempNode.next;
			tempNode.next = node;
			node.next = nextNode;
		}
		size++;
	}
	
	public void traverseList() {
		if(head != null) {
			Node node = new Node();
			node = head;
			while(node != null) {
				System.out.print(node.val+"->");
				node = node.next;
			}
			System.out.println("");
		} else {
			System.out.println("No elements are present in the list");
		}
	}
	
	public void searchElement(int ele) {
		if(head != null) {
			Node node = new Node();
			node = head;
			for(int i=0; i<size; i++) {
				if(node.val == ele) {
					System.out.println("Element "+ele+" present at positon "+(i+1));
				}
				node = node.next;
			}
		} else {
			System.out.println("Element is not present in the list");
		}
	}
	
	public void deleteNode(int loc) {
		if(head == null) {
			System.out.println("List is empty");
		} else if(loc == 0) {
			head = head.next;
			size--;
			if(size == 0) {
				tail = null;
			}
		} else if(loc >= size) {
			Node tempNode = head;
			for(int i=0; i<size-1; i++) {
				tempNode = tempNode.next;
			}
			if(tempNode == head) {
				tail = head = null;
				size--;
			}
			tempNode.next = null;
			tail = tempNode;
			size--;
		} else {
			Node tempNode = head;
			for(int i=0; i<loc-1; i++) {
				tempNode = tempNode.next;
			}
			tempNode.next = tempNode.next.next;
			size--;
		}
	}
	
	public void deleteDups() {
		Node temp1 = head.next;
        Node temp2 = head;
        
        while(temp1 != null) {
            while(temp2 != temp1) {
                
                if(temp2.val == temp1.val) {
                    temp2.next = temp2.next.next;
                }
                
                temp2 = temp2.next;
            }
        
            temp1 = temp1.next;
        }
    }
	
	public static void main(String[] args) {
		Sample00 ll = new Sample00();
		
		ll.insertInList(1, 0);
		ll.insertInList(2, 1);
		ll.insertInList(1, 2);
		ll.insertInList(3, 3);
		
		ll.traverseList();
		
		ll.deleteDups();
		
		ll.traverseList();
	}
}

