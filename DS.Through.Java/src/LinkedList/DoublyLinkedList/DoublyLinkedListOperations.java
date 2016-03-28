package LinkedList.DoublyLinkedList;

import java.util.Scanner;

class Node
{
	int data;
	Node previous;
	Node next;

	Node(int d)
	{
		this.data = d;
		this.previous = null;
		this.next = null;
	}
	void display()
	{
		System.out.print(data + " ");
	}
}

class DoublyLinkedList
{
	Node head, tail;

	void printDoublyLinkedList()
	{
		Node temp = head;
		while(temp!=null)
		{
			temp.display();
			temp = temp.next;
		}
	}
	void count()
	{
		Node temp = head;
		int count = 0;
		while(temp!=null)
		{
			temp = temp.next;
			++count;
		}
		System.out.println(count);
	}

	void insertnodeAtEnd(int value)
	{
		Node newnode = new Node(value);
		newnode.next = null;
		newnode.previous = null;
		if(head ==null)
		{
			head = newnode;
			tail = newnode;
		}
		else
		{
			tail.next = newnode;
			newnode.previous = tail;
			tail = newnode;
		}
	}

	void insertnodeAtBeginning(int value)
	{
		Node newnode = new Node(value);
		newnode.next = null;
		newnode.previous = null;
		if(head ==null)
		{
			head = newnode;
			tail = newnode;
		}
		else
		{
			head.previous = newnode;
			newnode.next = head;
			head = newnode;
		}
	}

	void insertnodeAtPosition(int value, int position)
	{
		Node newnode = new Node(value);
		newnode.next = null;
		newnode.previous = null;
		if(head ==null)
		{
			head = newnode;
			tail = newnode;
		}
		else
		{
			Node temp = head;
			for(int i =1; i< position ; i++)
			{
				temp = temp.next;
				if(temp==null)
				{
					System.out.println("There are less number of elements");
					return;
				}
			}
			newnode.next = temp.next;
			temp.next = newnode;
			newnode.previous = temp;
			if(newnode.next!=null)
				newnode.next.previous = newnode;

		}
	}
	void deletenode(int position)
	{
		Node node=head;
		Node tempnode=head;
		for(int c=1; c<position; c++)
		{
			
			node=node.next;
			if(tempnode==null)
			{
				System.out.println("There are less number of elements");
				return;
			}
		}
		
		
		if(head==null)
		{
			System.out.println("The Doubly Linked List is empty");
			return;
		}
		else if(position ==1)
		{			
			head = tempnode.next;
			tempnode.next = null;
			tempnode = null;
			System.out.println("The first item is deleted");

		}
		else
		{
			if(node.next ==null)
			{
				node.previous.next = null;  
			    tail = tail.previous;
			    node=null;
				System.out.println("Deleting last element");
			}
			else
			{
				node.previous.next = node.next;
				node.next.previous= node.previous;
				node.previous = null;
				node.next = null;
				node =null;
			}
			
		}
	}
}

public class DoublyLinkedListOperations {

	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		Scanner input = new Scanner(System.in);
		int op = 0;
		while(op != 7) 
		{
			System.out.println();
			System.out.println("1. Insert at End ");
			System.out.println("2. Insert at Beginning ");
			System.out.println("3. Insert After");
			System.out.println("4. Delete ");
			System.out.println("5. Display ");
			System.out.println("6. Count ");
			System.out.println("7. Exit ");
			System.out.println("Enter your choice:");
			op = Integer.parseInt(input.nextLine());
			switch(op) 
			{
			case 1:
				System.out.println("Enter the value node added at end of Doubly Linked list:");
				dll.insertnodeAtEnd(Integer.parseInt(input.nextLine()));
				break;

			case 2:
				System.out.println("Enter the value node added at beginning of Doubly Linked list:");
				dll.insertnodeAtBeginning(Integer.parseInt(input.nextLine()));
				break;

			case 3:
				System.out.println("Enter the value node added at position of Doubly Linked list:");
				System.out.println("Enter the position");
				int pos=Integer.parseInt(input.nextLine());
				System.out.println("Enter the data");
				int data = Integer.parseInt(input.nextLine());
				dll.insertnodeAtPosition(data, pos);
				break;
				
			case 4:
				System.out.println("Enter the position of node deleted from Doubly Linked list:");
				dll.deletenode(Integer.parseInt(input.nextLine()));
				break;
				
			case 5:
				System.out.println("Display Doubly Linked list:");
				dll.printDoublyLinkedList();
				break;
				
			case 6:
				System.out.println("The total number of items in the Doubly Linked List:");
				dll.count();
				break;
				
			case 7:
				System.out.println("Bye Bye!");
				System.exit(0);
				break;
				
			default:
				System.out.println("Invalid choice!");

			}

		}
	}

}
