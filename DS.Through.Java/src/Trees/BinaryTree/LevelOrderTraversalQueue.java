package Trees.BinaryTree;
// Complexity O(n)
import java.util.*;

public class LevelOrderTraversalQueue {
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
			Queue<Node> queue =  new LinkedList<Node>();
			queue.add(root);
			
			while(!queue.isEmpty())
			{
				Node tempnode = queue.poll();
				System.out.print(tempnode.data + " ");
				if(tempnode.left !=null)
					queue.add(tempnode.left);
				if(tempnode.right!=null)
					queue.add(tempnode.right);
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
		LevelOrderTraversalQueue bfs = new LevelOrderTraversalQueue();
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
