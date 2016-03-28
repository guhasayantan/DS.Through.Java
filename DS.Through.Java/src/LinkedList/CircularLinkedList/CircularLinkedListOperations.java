package LinkedList.CircularLinkedList;

import java.util.Scanner;


class CLLNode
{
	int data;
	CLLNode next;
	CLLNode(int d)
	{
		this.data =d;
		this.next = null;
	}
	
	public void display()
	{
		System.out.print(data + " ");
	}
}

class CircularLinkedList
{
	CLLNode head, tail;
	public void insertNode(int value)
	{
		CLLNode node = new CLLNode(value);
		node.next = null;
		if(head == null)
		{
			head = tail = node;
		}
		else
		{
			tail.next = node;
			tail = node;
			tail.next = head;
		}
	}
	
	public void printCicularLinkedList()
	{
		CLLNode temp1 = head, temp2=null;
		while(temp1!=temp2)
		{
			temp1.display();
			temp1 = temp1.next;
			temp2=head;
		}
		
	}
	public void deleteNode(int pos)
	{
		CLLNode node=head;
		CLLNode tempnode=head;
		for(int c=1; c<pos; c++)
		{
			tempnode=node;
			node=node.next;
		}
		
		if(pos==1)
		{
			head= node.next;
			tail.next = head;
			node.next=null;
			node=null;
		}
		else
		{
			tempnode.next = node.next;
			node=null;
		}
	}
	
	public int countCicularLinkedList()
	{
		CLLNode temp1 = head, temp2=null;
		int count =0;
		while(temp1!=temp2)
		{
			temp1 = temp1.next;
			temp2=head;
			count++;
		}
		return count;
	}
}

public class CircularLinkedListOperations {

	public static void main(String[] args) {
		
		CircularLinkedList cll = new CircularLinkedList();
		Scanner input = new Scanner(System.in);
		int op = 0;
		while(op != 5) 
		{
			System.out.println();
			System.out.println("1. Insert Node ");
			System.out.println("2. Delete ");
			System.out.println("3. Display ");
			System.out.println("4. Count ");
			System.out.println("5. Exit ");
			System.out.println("Enter your choice:");
			op = Integer.parseInt(input.nextLine());
			switch(op) 
			{
			case 1:
				System.out.println("Enter the value node added at end of Circular Linked list:");
				cll.insertNode(Integer.parseInt(input.nextLine()));
				break;

			case 2:
				System.out.println("Enter the position to be deleted from Circular Linked list:");
				cll.deleteNode(Integer.parseInt(input.nextLine()));
				break;

			case 3:
				System.out.println("The elements in Circular Linked list: ");
				cll.printCicularLinkedList();
				break;		
			case 4:
				System.out.println("The total number of items in the Linked List: "+ cll.countCicularLinkedList());
				break;
			case 5:
				System.out.println("Bye Bye!");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice!");

			}

		}

	}

}
