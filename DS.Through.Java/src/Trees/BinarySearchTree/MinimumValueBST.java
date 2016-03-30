package Trees.BinarySearchTree;
//Compleixty: O(n)
public class MinimumValueBST {
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
			if(node==null)
				return (new Node(value));
			else{
				if(value <= node.data)
					node.left = insert(node.left, value);
				else
					node.right = insert(node.right, value);
			}
			return node;
		}
		int minvalue(Node root){
			Node current =root;
			while(current.left!=null){
				current = current.left;
			}
			return current.data;
		}
	}
	public static void main(String[] args) {
		MinimumValueBST minbst = new MinimumValueBST();
		BST bst = minbst.new BST();
		Node head = null;
		head = bst.insert(bst.root, 4);
		bst.insert(head, 2);
		bst.insert(head, 1);
		bst.insert(head, 3);
		bst.insert(head, 6);
		bst.insert(head, 5);
		System.out.println("The minimum value of BST is: "+ bst.minvalue(head));
	}

}
