package LinkedList;

public class PrintMiddleNode {
	
	class Node 
	{
		int data;
		Node next;
		Node(int d)
		{
			this.data =d;
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
			if(head==null)
			{
				head=tail=node;
			}
			else
			{
				tail.next = node;
				tail =  node;
			}
		}
		
		int middleNode()
		{
			Node slow= head , fast = head;
			while(fast.next!=null)
			{
				slow = slow.next;
				fast = fast.next.next;
			}
			return slow.data;
		}
	}
	
	public static void main(String[] args) {
		
		PrintMiddleNode prnt = new PrintMiddleNode();
		LinkedList lnklist = prnt.new LinkedList();
		lnklist.addNode(2);
		lnklist.addNode(3);
		lnklist.addNode(4);
		lnklist.addNode(5);
		lnklist.addNode(6);
		lnklist.addNode(7);
		lnklist.addNode(8);
		
		System.out.println(lnklist.middleNode());

	}

}
