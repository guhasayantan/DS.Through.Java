package LinkedList;

public class GetNthNode {
	
	class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			this.data =d;
			this.next =null;
		}
		void printnode()
		{
			System.out.println(data + " ");
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
		
		int getnthnode(int n)
		{
			Node temp = head;
			int count = 0;
			while(count!=n)
			{
				temp = temp.next;
				count++;
			}
			return temp.data;
		}
	}
	public static void main(String[] args) {
		
		GetNthNode gnth = new GetNthNode();
		LinkedList lnklist = gnth.new LinkedList();
		
		lnklist.addNode(3);
		lnklist.addNode(4);
		lnklist.addNode(5);
		lnklist.addNode(6);
		lnklist.addNode(7);
		
		System.out.println("The given value of the node: " + lnklist.getnthnode(2));
	}

}
