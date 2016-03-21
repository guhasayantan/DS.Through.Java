package LinkedList;

public class PrintNthNodeFromEnd {
	
	class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			this.data = d;
			this.next = null;
		}
	}
	
	class LinkedList
	{
		Node head, tail;
		
		void addNode(int value)
		{
			Node node = new Node(value);
			node.next = null;
			
			if(head == null)
			{
				head = tail = node;
			}
			else
			{
				tail.next = node;
				tail = node;
			}
		}
		
		int findNthNodefromEnd(int n)
		{
			Node slow = head, fast= head;
			int count=0;
			while(count<n)
			{
				fast= fast.next;
				count++;
			}
			while(fast.next!=null)
			{
				slow=slow.next;
				fast = fast.next;
			}
			return slow.next.data;
		}
	}
	
	public static void main(String[] args) {
		
		PrintNthNodeFromEnd prntend = new PrintNthNodeFromEnd();
		LinkedList lnklist = prntend.new LinkedList();
		
		lnklist.addNode(2);
		lnklist.addNode(3);
		lnklist.addNode(4);
		lnklist.addNode(5);
		lnklist.addNode(6);
		lnklist.addNode(7);
		lnklist.addNode(8);
		
		System.out.println("Nth Node from the end: "+lnklist.findNthNodefromEnd(3));
	}

}
