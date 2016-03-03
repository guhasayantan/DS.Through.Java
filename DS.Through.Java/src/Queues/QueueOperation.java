package Queues;

import java.util.*;

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
		System.out.println(data + " ");
	}
}

class Queue
{
	private Node head, tail;

	public void enqueue (int data)
	{
		Node newnode = new Node(data);
		newnode.next = null;

		if(head==null)
		{
			head = newnode;
			tail = newnode;
			System.out.println("First node is added to the Queue");
		}
		else
		{
			tail.next = newnode;
			tail=newnode;
			System.out.println("The node is added to the end of the queue");
		}
	}

	public void dequeue()
	{
		Node node = head;
		if(node==null)
		{
			System.out.println("Queue is empty");
		}
		else
		{
			head=head.next;
			node.next = null;
			node=null;
			System.out.println("Item is deleted");
		}
	}

	//Display all the items in the Queue
	public void display()
	{
		Node node=head;
		if(node==null)
		{
			System.out.println("Queue is empty");
			return;
		}
		while(node!=null)
		{
			node.display();
			node = node.next;
		}
	}

	//Count the number of items in the Queue
	public void count()
	{
		Node node=head;
		int count=0;
		if(node==null)
		{
			System.out.println("Queue is empty");
			return;
		}
		while(node!=null)
		{
			node = node.next;
			++count;
		}
		System.out.println(count);
	}

	//Delete all the items in the Queue
	public void delete()
	{
		Node node=head;
		Node tempnode;
		if(node==null)
		{
			System.out.println("Queue is empty");
			return;
		}
		while(node!=null)
		{
			tempnode=head.next;
			node.next = null;
			node=null;
		}
		head=null;
		System.out.println("Queue deleted");
	}

}
public class QueueOperation {

	public static void main(String[] args) {

		Queue newqueue = new Queue();

		Scanner input = new Scanner(System.in);
		int op = 0;
		while(op != 6) 
		{
			System.out.println();
			System.out.println("1. Enqueue ");
			System.out.println("2. Dequeue ");
			System.out.println("3. Delete ");
			System.out.println("4. Display ");
			System.out.println("5. Count ");
			System.out.println("6. Exit ");
			System.out.println("Enter your choice:");
			op = Integer.parseInt(input.nextLine());
			switch(op) 
			{
			case 1:
				System.out.println("Enter the value pushed to the Queue:");
				newqueue.enqueue(Integer.parseInt(input.nextLine()));
				break;

			case 2:
				newqueue.dequeue();
				break;

			case 3:
				newqueue.delete();
				break;

			case 4:
				System.out.println("Display Queue:");
				newqueue.display();
				break;

			case 5:
				System.out.println("The total number of items in the Queue:");
				newqueue.count();
				break;

			case 6:
				System.out.println("Bye Bye!");
				System.exit(0);
				break;

			default:
				System.out.println("Invalid choice!");

			}

		}

	}


}

