package LinkedList;

public class SwapNodes {
	Node head, tail;
	
	class Node
	{
		int data;
		Node link;
		
		Node(int data)
		{
			this.data = data;
			this.link = null;
		}
		
		void display()
		{
			System.out.print(data + " ");
		}
	}
	
	public class LList
	{
		void insert(int value)
		{
			Node node = new Node(value);
			node.link = null;
			
			if(head == null)
			{
				head = tail = node ;
			}
			else
			{
				tail.link = node;
				tail = node;
			}
				
		}
		
		public void printList()
		{
			Node node=head;
			while(node!=null)
			{
				node.display();
				node = node.link;
			}
		}
		
		public void swap(int x, int y)
		{
			if (x==y)
				return;
			
			//Track the position of X
			Node prevx= null, currentx=head;
			while(currentx.data!=x && currentx!=null)
			{
				prevx = currentx;
				currentx = currentx.link;
			}
			
			//Track the position of Y
			Node prevy= null, currenty=head;
			while(currenty.data!=y && currenty!=null)
			{
				prevy = currenty;
				currenty = currenty.link;
			}
			
			if(currentx == null || currenty == null)
				return;
			if(prevx!=null)
				prevx.link = currenty;
			else
				head =  currenty;
			
			if(prevy!=null)
				prevy.link = currentx;
			else
				head =currentx;
			
			Node temp = currentx.link;
			currentx.link = currenty.link;
			currenty.link = temp;
		}
		
	}

	public static void main(String[] args) {
		
		SwapNodes swp = new SwapNodes();
		LList linkedlist = swp.new LList();
		
		linkedlist.insert(2);
		linkedlist.insert(4);
		linkedlist.insert(1);
		linkedlist.insert(5);
		linkedlist.insert(6);
		System.out.println("Before Swap");
		linkedlist.printList();
		System.out.println("");
		System.out.println("After Swap");
		linkedlist.swap(4, 5);
		linkedlist.printList();

	}

}
