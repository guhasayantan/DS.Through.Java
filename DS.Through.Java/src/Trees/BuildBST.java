package Trees;

import java.util.Scanner;

class BSTNode
{
	BSTNode left;
	int data;
	BSTNode right;

	BSTNode(int val) {

		this.data = val;

	}

}

public class BuildBST {

	BSTNode root;

	public void buidBST(int num)
	{
		BSTNode newnode = new BSTNode(num);
		if(root==null)
		{
			root = newnode;
		}
		else
		{
			BSTNode focusnode = root;
			BSTNode parent;
			while(true)
			{	
				parent = focusnode;
				if(num < focusnode.data)
				{
					focusnode = focusnode.left;
					if(focusnode ==  null){
						parent.left = newnode;
						return;
					}
				}
				else
				{
					focusnode = focusnode.right;
					if(focusnode ==  null){
						parent.right = newnode;
						return;
					}
				}
			}
		}


	}


	void printInorder(BSTNode node)
	{
		if(node != null)
		{	
			printInorder(node.left);
			System.out.print(node.data + " ");
			printInorder(node.right);
		}
		else 
			return;
	}

	public static void main(String[] args) {

		BuildBST bst = new BuildBST();

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of items in the BST: ");
		int op = Integer.parseInt(input.nextLine());
		int count =0;


		while(count++ <op)
		{
			System.out.print("Enter the value: ");
			int item = Integer.parseInt(input.nextLine());
			bst.buidBST(item);
		}

		System.out.print("In-order traversal : ");
		bst.printInorder(bst.root);
	}
}
