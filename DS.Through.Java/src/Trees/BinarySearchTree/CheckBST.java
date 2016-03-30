package Trees.BinarySearchTree;

public class CheckBST {
	class Node{
		int data;
		Node left, right;
		Node(int value){
			this.data= value;
			this.left = null;
			this.right =null;
		}
	}
	class BST{
		Node root;
		public BST(){
			root =null;
		}
		public BST(int value){
			root = new Node(value);
		}
		boolean isBST()
		{
			return isBSTCheck(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
		}
		boolean isBSTCheck(Node node, int min, int max)
		{
			if(node == null)
				return true;
			if(node.data < min || node.data > max)
				return false;
			return (isBSTCheck(node.left, min, node.data-1)&&isBSTCheck(node.right, node.data+1,max));
		}
	}
	public static void main(String[] args) {
		CheckBST ckbst = new CheckBST();
		BST bst = ckbst.new BST();
		bst.root = ckbst.new Node(1);
		bst.root.left = ckbst.new Node(2);
		bst.root.right = ckbst.new Node(5);
		bst.root.left.left = ckbst.new Node(1);
		bst.root.left.right = ckbst.new Node(3);
		if(bst.isBST())
			System.out.println("The binary tree is BST");
		else
			System.out.println("The binary tree is not BST");
	}

}
