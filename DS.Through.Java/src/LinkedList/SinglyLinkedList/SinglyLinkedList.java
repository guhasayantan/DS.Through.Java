package LinkedList.SinglyLinkedList;

import java.util.Scanner;

/*The class Node defines the structure of particular node of the Linked List
 * The node contains two things - 1. data 2. next - address of the next node
 */
class Node
{
	int data;
	Node next;
	//Initialize the constructor 
	Node(int d)
	{
		this.data=d;
	}
	//Method to display the value of the particular node
	public void display()
	{
		System.out.print(data +" -> ");
	}
}

class LinkedList {
	private Node firstnode,lastnode;
	public Node LinkList()
	{
		return firstnode=null;
	}
	public boolean isEmpty()
	{
		if (firstnode==null)
			return true;
		else
			return false;
	}
	// Display all the items in the Linked List
	public void display()
	{
		Node node=firstnode;
		while(node!=null)
		{
			node.display();
			node = node.next;
		}
	}
	//Add element to the end of the Linked List
	void addNodeAtEnd(int data)
	{
		Node newnode=new Node(data);
		newnode.next=null;
		//Check if the new node is the first node of the Linked List
		if(firstnode==null)
		{
			firstnode= lastnode = newnode;
			System.out.println("Linked List with new node is created");
		}
		// Else add the node at the linked list
		else
		{
			lastnode.next=newnode;
			lastnode = newnode;
			System.out.println("New node is added to the linked list  ");
		}

	}
	void addNodeAtBeg(int data)
	{

		Node newnode=new Node(data);
		newnode.next=null;

		//Check if the new node is the first node of the Linked List
		if(firstnode==null)
		{
			firstnode= lastnode = newnode;
			System.out.println("Linked List with new node is created");
		}
		// Else add the node at the linked list
		else
		{
			newnode.next=firstnode;
			firstnode = newnode;
			System.out.println("New node is added to the beginning linked list  ");
		}

	}
	void addNodeAfter(int pos, int data)
	{
		Node node=firstnode;
		Node tempnode;
		Node newnode=new Node(data);
		newnode.next=null;
		//Check if the new node is the first node of the Linked List
		if(firstnode==null)
		{
			firstnode= lastnode = newnode;
			System.out.println("Linked List with new node is created");
		}
		// Else add the node at the linked list
		else
		{
			for(int c=1; c<pos; c++)
			{
				node=node.next;
			}
			tempnode=node.next;
			node.next=newnode;
			newnode.next = tempnode;
			System.out.println("New node is added to the position linked list  ");
		}

	}
	//Delete the item from the Linked List
	public void delete(int pos)
	{
		Node node=firstnode;
		Node tempnode=firstnode;
		for(int c=1; c<pos; c++)
		{
			tempnode=node;
			node=node.next;
		}
		//check if this is the first element of the Linked List
		if(pos==1)
		{
			firstnode= node.next;
			node.next=null;
			node=null;
		}
		else
			// else delete the item from the linked list
		{
			tempnode.next = node.next;
			node=null;
		}
	}
	public void count()
	{
		Node node=firstnode;
		int count=0;
		while(node!=null)
		{
			node = node.next;
			++count;
		}
		System.out.println(count);
	}

}
public class SinglyLinkedList {

	public static void main(String[] args) {

		LinkedList newlist= new LinkedList();	
		
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
				System.out.println("Enter the value node added at end of Linked list:");
				newlist.addNodeAtEnd(Integer.parseInt(input.nextLine()));
				break;

			case 2:
				System.out.println("Enter the value node added at beginning of Linked list:");
				newlist.addNodeAtBeg(Integer.parseInt(input.nextLine()));
				break;

			case 3:
				System.out.println("Enter the value node added at position of Linked list:");
				System.out.println("Enter the position");
				int pos=Integer.parseInt(input.nextLine());
				System.out.println("Enter the data");
				int data = Integer.parseInt(input.nextLine());
				newlist.addNodeAfter(pos,data);
				break;
				
			case 4:
				System.out.println("Enter the position of node deleted from Linked list:");
				newlist.delete(Integer.parseInt(input.nextLine()));
				break;
				
			case 5:
				System.out.println("Display Linked list:");
				newlist.display();
				break;
				
			case 6:
				System.out.println("The total number of items in the Linked List:");
				newlist.count();
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
