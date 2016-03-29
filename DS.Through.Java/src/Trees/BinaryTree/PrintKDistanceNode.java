package Trees.BinaryTree;

public class PrintKDistanceNode {
	class Node{
		int data;
		Node left,right;
		Node(int value){
			this.data=value;
			this.left=null;
			this.right=null;
		}
	}
	class BinaryTree{
		Node root;
		public BinaryTree() {
			root=null;
		}
		public BinaryTree(int value){
			root = new Node(value);
		}
		void printKDistanceRoot(Node node, int k){
			if (node ==null)
				return;
			if(k==1)
				System.out.print(node.data + " ");
			else
			{
				printKDistanceRoot(node.left, k-1);
				printKDistanceRoot(node.right, k-1);
			}
		}
	}
	public static void main(String[] args) {
		PrintKDistanceNode pkd = new PrintKDistanceNode();
		BinaryTree bt = pkd.new BinaryTree();
		bt.root = pkd.new Node(1);
		bt.root.left = pkd.new Node(2);
		bt.root.right = pkd.new Node(3);
		bt.root.right.left = pkd.new Node(8);
		bt.root.left.left = pkd.new Node(4);
		bt.root.left.right = pkd.new Node(5);
		int k = 3;
		System.out.println("The nodes from "+ k + "distance from root :");
		bt.printKDistanceRoot(bt.root, k);

	}

}
