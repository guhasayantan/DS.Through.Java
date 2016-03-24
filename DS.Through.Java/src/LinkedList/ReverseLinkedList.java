package LinkedList;

public class ReverseLinkedList {
	class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			this.data =d;
			this.next = null;
		}
		public void display()
		{
			System.out.print(data + " ");
		}
	}
	class LinkedList
	{
		Node head, tail;
		public void insertnode(int value)
		{
			Node newnode = new Node(value);
			newnode.next = null;
			if(head == null)
			{
				head = newnode;
				tail = newnode;
			}
			else
			{
				tail.next = newnode;
				tail = newnode;
			}

		}
		public void printLinkedList()
		{
			Node temp = head;
			while(temp!=null)
			{
				temp.display();
				temp = temp.next;
			}
		}
		public void swap()
		{
			Node prev = null;
			Node current = head;
			Node next = null;
			while (current != null) {
				next = current.next;
				current.next = prev;
				prev = current;
				current = next;
			}
			head = prev;

		}
	}
	public static void main(String[] args) {

		ReverseLinkedList revlinkedlist = new ReverseLinkedList();
		LinkedList linkedlist = revlinkedlist.new LinkedList();
		linkedlist.insertnode(2);
		linkedlist.insertnode(3);
		linkedlist.insertnode(4);
		linkedlist.insertnode(5);
		linkedlist.insertnode(6);
		System.out.println("Before swap: ");
		linkedlist.printLinkedList();
		linkedlist.swap();
		System.out.println("");
		System.out.println("After swap: ");
		linkedlist.printLinkedList();

	}

}
