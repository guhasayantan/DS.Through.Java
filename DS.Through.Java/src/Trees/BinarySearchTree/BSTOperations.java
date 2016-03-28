package Trees.BinarySearchTree;

import java.util.Scanner;


public class BSTOperations {


	class TreeNode
	{
		TreeNode left;
		int data;
		TreeNode right;

		public TreeNode(int data) 
		{
			this.left = null;
			this.data = data;
			this.right = null;
		}
	}

	TreeNode root;

	BSTOperations()
	{
		root = null;
	}
	void insert(int key) {
		root = insertRec(root, key);
	}
	TreeNode insertRec(TreeNode root, int data)
	{
		if (root == null) 
		{
			root = new TreeNode(data);
			return root;
		}

		if (data < root.data)
			root.left = insertRec(root.left, data);
		else if (data > root.data)
			root.right = insertRec(root.right, data);
		return root;
	}

	void delete(int data)
	{
		root = deleteItem(root, data);
	}

	TreeNode deleteItem(TreeNode root, int data)
	{
		if (root == null)
			return root;
		if(data < root.data)
			root.left = deleteItem(root.left, data);
		else if (data > root.data)
			root.right = deleteItem(root.right, data);

		else
		{
			if(root.left==null)
				return root.left;
			else if(root.right ==null)
				return root.right;
			root.data =  findInorderSuccessor(root.right);
			root.right = deleteItem(root.right, root.data);
		}

		return root;
	}
	int findInorderSuccessor(TreeNode root)
	{
		int val = root.data;
		while(root.left!=null)
		{
			val = root.left.data;
			root = root.left;
		}
		return val;
	}

	void inorder()  {
		inorderRec(root);
	}


	void inorderRec(TreeNode root) {
		if (root != null) {
			inorderRec(root.left);
			System.out.print(root.data + " ");
			inorderRec(root.right);
		}
		else 
			return;
	}
	
	
	void search(int data)  {
		searchRec(root, data);
	}


	void searchRec(TreeNode root, int data) {
		if (root != null) {
			
			if(root.data == data)
			{
				System.out.println(root.data + " exists in BST");
				//return ;
			}
			searchRec(root.left, data);
			searchRec(root.right, data);
		}
		
	}
	public static void main(String[] args) {

		BSTOperations bst = new BSTOperations();

		Scanner input = new Scanner(System.in);
		int op = 0;
		while(op != 6) 
		{
			System.out.println();
			System.out.println("1. Create Binary Search Tree (BST)");
			System.out.println("2. Delete a node in BST ");
			System.out.println("3. Inorder Traversal of BST ");
			System.out.println("4. Search item in BST ");
			System.out.println("5. Exit ");
			System.out.println("Enter your choice:");
			op = Integer.parseInt(input.nextLine());
			switch(op) 
			{
			case 1:

				System.out.println("Enter the number of items in the BST: ");
				int op1 = Integer.parseInt(input.nextLine());
				int count =0;

				while(count++ <op1)
				{
					System.out.print("Enter the value: ");
					int item = Integer.parseInt(input.nextLine());
					bst.insert(item);
				}
				break;

			case 2:
				System.out.println("Enter the value node to delete from BST:");
				int op2 = Integer.parseInt(input.nextLine());
				bst.delete(op2);
				break;

			case 3:
				System.out.print("In-order traversal : ");
				bst.inorder();
				break;
				
			case 4:
				System.out.println("Enter the data to be searched");
				int op3 = Integer.parseInt(input.nextLine());
				bst.search(op3);
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
