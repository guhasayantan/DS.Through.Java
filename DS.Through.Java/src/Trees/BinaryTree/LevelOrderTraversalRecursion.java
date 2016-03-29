package Trees.BinaryTree;

public class LevelOrderTraversalRecursion {
	class Node
	{
		int data;
		Node left, right;
		Node(int value)
		{
			this.data = value;
			this.left=null;
			this.right=null;
		}
	}
	class BinaryTree
	{
		Node root;
		public BinaryTree(int data) {
			root = new Node(data);
		}
		public BinaryTree()
		{
			root=null;
		}
		
		void printBFS(Node root)
		{
			int ht = height(root);
			for(int i =1; i <= ht ; i++)
				printGivenLevel(root,i);
				
		}
		int height(Node node)
		{
			if(node == null)
				return 0;
			else
			{
				int rightht = height(node.right);
				int leftht = height(node.left);
				if(rightht>leftht)
					return (rightht +1);
				else
					return (leftht +1);
			}
		}
		void printGivenLevel(Node node, int height)
		{
			if(node == null)
				return;
			if (height == 1)
				System.out.print(node.data + " ");
			else if(height > 1)
			{
				printGivenLevel(node.left, height-1);
				printGivenLevel(node.right, height-1);
			}
		}
		void printInorder(Node node)
		{
			if(node == null)
				return;
			printInorder(node.left);
			System.out.print(node.data + " ");
			printInorder(node.right);
		}
	}
	
	public static void main(String[] args) {
		LevelOrderTraversalRecursion bfs = new LevelOrderTraversalRecursion();
		BinaryTree bt = bfs.new BinaryTree();
		bt.root = bfs.new Node(1);
		bt.root.right = bfs.new Node(3);
		bt.root.left = bfs.new Node(2);
		bt.root.left.right = bfs.new Node(5);
		bt.root.left.left = bfs.new Node(4);
		System.out.print("Inorder Traversal: ");
		bt.printInorder(bt.root);
		System.out.println();
		System.out.print("BFS Traversal: ");
		bt.printBFS(bt.root);
	}

}
