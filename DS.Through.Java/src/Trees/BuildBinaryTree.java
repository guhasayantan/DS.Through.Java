package Trees;

class BinaryTreeNode
{
	int data;
	BinaryTreeNode left, right;
	
	BinaryTreeNode(int value)
	{
		this.data =  value;
		left =null;
		right =  null;
	}
}

class BinaryTree
{
	BinaryTreeNode node;
	
	public BinaryTree(int data) 
	{
		node = new BinaryTreeNode(data);
	}
	
	public BinaryTree()
	{
		node = null;
	}
}

public class BuildBinaryTree {

	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree();
		
		tree.node = new BinaryTreeNode(3);
		tree.node.left =  new BinaryTreeNode(4);
		tree.node.right = new BinaryTreeNode(5);
		tree.node.left.left = new BinaryTreeNode(2);
		tree.node.left.right = new BinaryTreeNode(7);
		printInorder(tree.node);
	}
	
	static void printInorder(BinaryTreeNode node)
	{
		if(node == null)
			return;
		printInorder(node.left);
		System.out.println(node.data);
		printInorder(node.right);
	}

}
