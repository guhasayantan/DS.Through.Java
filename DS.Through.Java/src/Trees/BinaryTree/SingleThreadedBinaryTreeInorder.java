package Trees.BinaryTree;

import java.util.*;

public class SingleThreadedBinaryTreeInorder {
	class Node
	{
		int data;
		Node left, right;
		boolean rightThread;
		Node(int value)
		{
			this.data = value;
			this.right = null;
			this.left =null;
		}
	}
	class SingleThreadedBinaryTree
	{
		Node root;
		
		void populateQueue(Node node, Queue<Node> queue)
		{
			if(node == null)
				return;
			if(node.left!=null)
				populateQueue(node.left, queue);
			queue.add(node);
			if(node.right!=null)
				populateQueue(node.right, queue);
		}
		
		void createThreadUtil(Node node, Queue<Node> queue)
		{
			if(node == null)
				return;
			if(node.left!=null)
				createThreadUtil(node.left, queue);
			queue.remove();
			if(node.right!=null)
				createThreadUtil(node.right, queue);
			else
			{
				node.right=queue.peek();
				node.rightThread=true;
			}
		}
		void createThreaded(Node node)
		{
			Queue<Node> queue = new LinkedList<Node>();
			populateQueue(node,queue);
			createThreadUtil(node, queue);
		}
		
		Node leftmostnode(Node node)
		{
			if(node == null)
				return null;
			while(node!=null && node.left != null)
				node = node.left;
			return node;
		}
		void inorder(Node root)
		{
			Node leftmost = leftmostnode(root);
			if(root == null)
				return;
			while(leftmost!=null)
			{
				System.out.print(leftmost.data + " ");
				
				if(leftmost.rightThread)
					leftmost = leftmost.right;
				else
					leftmost = leftmostnode(leftmost.right);
					
				
			}
		}
	}
	public static void main(String[] args) {
		
		SingleThreadedBinaryTreeInorder stbti = new SingleThreadedBinaryTreeInorder();
		SingleThreadedBinaryTree stbt = stbti.new SingleThreadedBinaryTree();
		stbt.root = stbti.new Node(1);
		stbt.root.left = stbti.new Node(2);
		stbt.root.right = stbti.new Node(3);
		stbt.root.left.left = stbti.new Node(4);
		stbt.root.left.right = stbti.new Node(5);
		stbt.root.right.left = stbti.new Node(6);
		stbt.root.right.right = stbti.new Node(7);
		stbt.createThreaded(stbt.root);
		System.out.println("The Inorder Traversal of Threaded Binary Tree: ");
		stbt.inorder(stbt.root);
	}

}
