package Trees.BinarySearchTree;

import java.util.Stack;

public class KthSmallestElement {
	class Node{
		int data;
		Node left, right;
		Node(int value){
			this.data = value;
			this.left = null;
			this.right = null;
		}
	}
	class BST{
		Node root;
		Node insert(Node node, int value){
			if(node == null)
				return (new Node(value));
			else{
				if(node.data<=value)
					node.left = insert(node.left, value);
				else
					node.right = insert(node.right, value);
			}
			return node;
		}
		Node kthsmallest(Node root, int k){
			Stack<Node> stack = new Stack<Node>();
			Node pcrawl = root;
			Node result=null;
			while(!stack.isEmpty() || pcrawl!=null)
			{
				if(pcrawl!=null)
				{
					stack.push(pcrawl);
					pcrawl = pcrawl.left;
				}
				else
				{
					Node node = stack.pop();
					k--;
					if(k==0)
						result = node;
					pcrawl = node.right;
						
				}
			}
			return result;
		}
			
	}
	public static void main(String[] args) {
		KthSmallestElement kth = new KthSmallestElement();
		BST bst = kth.new BST();
		Node head = null;
		head = bst.insert(head, 20);
		bst.insert(head, 22);
		bst.insert(head, 8);
		bst.insert(head, 12);
		bst.insert(head, 14);
		bst.insert(head, 10);
		bst.insert(head, 4);
		System.out.println("K-th smallest element : "+bst.kthsmallest(head, 3).data);;
	}

}
