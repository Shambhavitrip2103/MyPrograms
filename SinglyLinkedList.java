package List;

public class SinglyLinkedList {

	private ListNode head;
	
	private class ListNode {
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data=data;
			this.next=null;
			
		}
	}
	public void insertAtBeginning(int data) {
		ListNode newNode = new ListNode(data);
		newNode.next = head;
		head = newNode;
	}
		public void printLinkedList() {
			if(head == null) {
				System.out.println ("null");	
			}
			ListNode current = head;
			while(null!=current) {
				System.out.print(current.data + " -->");
				current= current.next;
				
			}
			System.out.println("null");	
		}
		public ListNode getMiddleNode() {
			if(head==null) {
				return null;
			}
				ListNode slowPtr = head;
				ListNode fastPtr = head;
				
				while(fastPtr != null && fastPtr.next !=null) {
					slowPtr =slowPtr.next;
					fastPtr = fastPtr.next.next;
				}
				return slowPtr;
		}
		//how to find nth node from the end of the list
		public ListNode getNthNodeFromEnd(int n) {
			if(head==null) {
				return null;
			}
			if(n<=0) {
				throw new IllegalArgumentException("invalid value: n= "+ n); 
			}
			ListNode mainPtr = head;
			ListNode refPtr =head;
			int count=0;
			while(count < n) {
				if(refPtr == null) {
					throw new IllegalArgumentException(n+ "is greater than the number of nodes in list");
				}
				refPtr= refPtr.next;
				count++;
			}
			while(refPtr!= null) {
				refPtr= refPtr.next;
						mainPtr= mainPtr.next;
			}
			return mainPtr;
		}
		//how to remove duplicate from sorted singly linked list
		public void removeDuplicates() {
			if (head==null) {
				return;
			}
			ListNode current = head;
			
			while(current!=null && current.next!= null) {
				if(current.data == current.next.data) {
					current.next=current.next.next;
				}else {
					current=current.next;
				}
			}
		}
			public ListNode insertInSortedList(int value) {
				ListNode newNode= new ListNode(value);
				
				if(head==null) {
					return newNode;
				}
				ListNode current = head;
				ListNode temp =null;
				while(current !=null && current.data < newNode.data) {
					temp= current;
					current=current.next;
				}
				newNode.next = current;
				temp.next = newNode;
				return head;
			}
			//how to remove a given key from singlylinkedlist
			public void deleteNode(int key) {
				ListNode current = head;
				ListNode temp=null;
				
				if(current!= null && current.data == key) {
					head =current.next; 
					return;
				}
				while(current!=null && current.data != key) {
					temp=current;
					current=current.next;
				}
				if(current== null) {
					return;
				}
				temp.next = current.next;	 
			}
			
        public static void main(String[] args) {
        	SinglyLinkedList sll= new SinglyLinkedList();
        	sll.insertAtBeginning(6);
        	sll.insertAtBeginning(1);
        	sll.insertAtBeginning(8);
            sll.insertAtBeginning(1);
            sll.insertAtBeginning(8);
        	sll.printLinkedList();
            sll.insertInSortedList(11);
            
            sll.printLinkedList();
            ListNode nthNodeFromEnd = sll.getNthNodeFromEnd(1 );
            System.out.println("NthNodeFromEnd is -"+nthNodeFromEnd.data); 
            sll.removeDuplicates();
            sll.printLinkedList();
            
            sll.deleteNode(11);
            sll.printLinkedList();
        }
}
