package Trees.BinaryTree;

public class FindMaxHeight {
	class Node{
		int data;
		Node left,right;
		Node (int data){
			this.data = data;
			this.left=null;
			this.right=null;
		}
		
	}
	class BinaryTree{
		Node root;
		public BinaryTree(int data) {
			root = new Node(data);
		}
		public BinaryTree(){
			root=null;
		}
		int height(Node node)
		{
			if(node==null)
				return 0;
			int leftht = height(node.left);
			int rightht = height(node.right);
			if(leftht > rightht)
				return (leftht+1);
			else
				return (rightht+1);
		}
	}
	
	public static void main(String[] args) {
		FindMaxHeight findmaxht = new FindMaxHeight();
		BinaryTree bt = findmaxht.new BinaryTree();
		bt.root = findmaxht.new Node(1);
		bt.root.right = findmaxht.new Node(2);
		bt.root.left = findmaxht.new Node(3);
		bt.root.left.left = findmaxht.new Node(4);
		bt.root.left.right = findmaxht.new Node(5);
		bt.root.left.right.left = findmaxht.new Node(6);
		
		System.out.println("The height of the Binary Tree: "+ bt.height(bt.root));
	}

}
