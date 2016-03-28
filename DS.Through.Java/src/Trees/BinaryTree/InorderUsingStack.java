package Trees.BinaryTree;
import java.util.*;

class Node{
	int data;
	Node left, right;
	Node(int data)
	{
		this.data = data;
		this.left = null;
		this.right = null;
	}
}
class InorderBinaryTree
{
	Node root;
	
	public InorderBinaryTree(int data)
	{
		root = new Node(data);
	}
	public InorderBinaryTree()
	{
		root = null;
	}
	
	void inorder()
	{
		if(root == null)
		{
			return;
		}
		Stack<Node> stack = new Stack<Node>();
		Node currentnode = root;
		while(currentnode!=null)
		{
			stack.push(currentnode);
			currentnode = currentnode.left;
		}
		
		while(stack.size()>0)
		{
			currentnode = stack.pop();
			System.out.print(currentnode.data + " ");
			if(currentnode.right!=null)
			{
				currentnode = currentnode.right;
				while(currentnode!=null)
				{
					stack.push(currentnode);
					currentnode = currentnode.left;
				}
			}
		}
	}
}
public class InorderUsingStack {
	
	
	public static void main(String[] args) {
		
		InorderBinaryTree bt = new InorderBinaryTree();
		bt.root = new Node(1);
		bt.root.right = new Node(3);
		bt.root.left = new Node(2);
		bt.root.left.right = new Node(5);
		bt.root.left.left = new Node(4);
		bt.inorder();
	}

}
