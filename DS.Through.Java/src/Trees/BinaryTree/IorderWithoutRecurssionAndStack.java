package Trees.BinaryTree;

import java.util.Stack;

class InorderBinaryTreeWORecStackNode{
	int data;
	InorderBinaryTreeWORecStackNode left, right;
	InorderBinaryTreeWORecStackNode(int data)
	{
		this.data = data;
		this.left = null;
		this.right = null;
	}
}
class InorderBinaryTreeWORecStack
{
	InorderBinaryTreeWORecStackNode root;
	
	public InorderBinaryTreeWORecStack(int data)
	{
		root = new InorderBinaryTreeWORecStackNode(data);
	}
	public InorderBinaryTreeWORecStack()
	{
		root = null;
	}
	
	void inorder()
	{
		InorderBinaryTreeWORecStackNode currentnode = root, predecessor;
		while(currentnode!=null)
		{
			if(currentnode.left == null)
			{
				System.out.print(currentnode.data + " ");
				currentnode = currentnode.right;
			}
			else
			{
				predecessor = currentnode.left;
				while(predecessor.right!= null && predecessor.right!=currentnode)
				{
					predecessor = predecessor.right;
				}
				if(predecessor.right ==null)
				{
					predecessor.right = currentnode;
					currentnode = currentnode.left;
				}
				else
				{
					predecessor.right =null;
					System.out.print(currentnode.data + " ");
					currentnode = currentnode.right;
				}
			}
		}
	}
}
public class IorderWithoutRecurssionAndStack {

	public static void main(String[] args) {
		InorderBinaryTreeWORecStack bt = new InorderBinaryTreeWORecStack();
		bt.root = new InorderBinaryTreeWORecStackNode(1);
		bt.root.right = new InorderBinaryTreeWORecStackNode(3);
		bt.root.left = new InorderBinaryTreeWORecStackNode(2);
		bt.root.left.right = new InorderBinaryTreeWORecStackNode(5);
		bt.root.left.left = new InorderBinaryTreeWORecStackNode(4);
		bt.inorder();

	}

}
