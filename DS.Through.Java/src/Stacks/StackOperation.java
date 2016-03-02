package Stacks;

import java.util.*;
//Define each node of the stack
class Node
{
	int data;
	Node next;
	Node(int d)
	{
		this.data=d;
		this.next=null;
	}
	public void display()
	{
		System.out.println(data);
	}
}
//Stack with all its operations
class Stack
{
	Node top; //this node point to the top of the stack
	Node button;

	public void display()
	{
		Node node = top;
		if (node ==null)
		{
			System.out.println("Stack is empty");
			return;
		}
		while(node!=null)
		{
			node.display();
			node = node.next;
		}
	}

	//method to push the data into the top of stack
	public void push(int data)
	{
		Node newnode = new Node(data);
		newnode.next = null;

		if(top==null)
		{
			top = newnode;
			button =newnode;
			System.out.println("First node is added to the stack");
		}
		else
		{
			newnode.next = top;
			top =newnode;
			System.out.println("Item is added to the top of the stack");
		}
	}

	// Method to peek the top item of the stack

	public void peek()
	{
		Node node = top;
		if (node ==null)
		{
			System.out.println("Stack is empty");
		}
		else
		{
			System.out.print("Item at top of stack: ");
			top.display();
		}

	}

	public void pop()
	{
		Node node = top;
		Node tempnode;
		if (node ==null)
		{
			System.out.println("Stack is empty");
		}
		else
		{
			System.out.print("Item pushed out of stack: ");
			top.display();
			tempnode=top;
			top = top.next;
			//tempnode=null;			
		}
	}
	//count the number of items in the Stack
	public int count()
	{	
		int count=0;
		Node node = top;
		while(node!=null)
		{
			++count;
			node = node.next;
		}
		return count;
	}

	//Delete the whole stack
	public void delete()
	{	
		Node node = top;
		Node tempnode;
		while(top!=null)
		{
			tempnode=top;
			top = top.next;
			tempnode = null;
		}
		System.out.println("Stack is deleted ");

	}
}
public class StackOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack newstack = new Stack();


		Scanner input = new Scanner(System.in);
		int op = 0;
		while(op != 7) 
		{
			System.out.println();
			System.out.println("1. Push ");
			System.out.println("2. Pop ");
			System.out.println("3. Peek");
			System.out.println("4. Delete ");
			System.out.println("5. Display ");
			System.out.println("6. Count ");
			System.out.println("7. Exit ");
			System.out.println("Enter your choice:");
			op = Integer.parseInt(input.nextLine());
			switch(op) 
			{
			case 1:
				System.out.println("Enter the value pushed to the Stack:");
				newstack.push(Integer.parseInt(input.nextLine()));
				break;

			case 2:
				newstack.pop();
				break;

			case 3:
				newstack.peek();
				break;

			case 4:
				newstack.delete();
				break;

			case 5:
				System.out.println("Display Stack:");
				newstack.display();
				break;

			case 6:
				int count = newstack.count();
				System.out.println("The total number of items in the Linked List:" + count);
				
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
