package CircularLinkedList;

class Node
{
	int data;
	Node next;
	Node(int d)
	{
		this.data = d;
		this.next = null;
	}
	public void display()
	{
		System.out.print(data + " ");
	}
}

class CLinkedList
{
	Node head, tail, head1, head2;
	public void addNode(int value)
	{
		Node newnode = new Node(value);
		newnode.next = null;
		
		if(head ==null)
		{
			head = newnode;
			tail = newnode;
			tail.next = head;
		}
		else
		{
			tail.next = newnode;
			tail = newnode;
			newnode.next = head;
		}
	}
	
	public void displayCLL()
	{
		Node temp1= head , temp2= null;
		while(temp1!=temp2)
		{
			temp1.display();
			temp1= temp1.next;
			temp2= head;
		}
	}
	
	public void splitCLL()
	{
		Node fast =  head, slow = head;
		Node temp = head;
		while(fast.next!=head && fast.next.next != head)
		{
			fast = fast.next.next;
			slow = slow.next;
		}
		if (fast.next.next == head) {
            fast = fast.next;
        }
 
        
        head1 = head;
        
        if (head.next != head) {
            head2 = slow.next;
        }
        
        fast.next = slow.next;
 
        
        slow.next = head;
	}
	
	void printList(Node node) {
        Node temp = node;
        if (node != null) {
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != node);
        }
    }
}

public class SplitCircularLinkedList {

	public static void main(String[] args) {
		
		CLinkedList cll = new CLinkedList();
		cll.addNode(2);
		cll.addNode(3);
		cll.addNode(4);
		cll.addNode(5);
		cll.addNode(6);
		System.out.println("The circular linked list"); 
		cll.displayCLL();
		cll.splitCLL();
		System.out.println("");
		System.out.println("The 1st portion of the circular linked list");
		cll.printList(cll.head1);
		System.out.println(" ");
		System.out.println("The 2nd portion of the circular linked list" );
		cll.printList(cll.head2);
	}

}
