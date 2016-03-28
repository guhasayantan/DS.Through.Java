package Trees.BinaryTree;

class BTNode
{
	char data;
	BTNode left, right;
	
	BTNode(char a)
	{
		this.data =  a;
		left =null;
		right =  null;
	}
}

class BTree
{
	

	
	public BTNode buidtree(int n, char[] a)
	{
		BTNode node=null;
		if(a[n]!='\0')
		{
			node = new BTNode(a[n]);
			node.left =  buidtree(2*n+1, a);
			node.data = a[n];
			node.right = buidtree(2*n+2, a);
			
		}
		return node;
	}
}

public class SingleArrayBinaryTree {

	public static void main(String[] args) {
		char a[]={'A','B','C','D','E','F','G','\0','\0','H','\0',
				'\0','\0','\0','\0','\0','\0','\0','\0','\0','\0'};
		BTree tree = new BTree();
		BTNode temp = tree.buidtree(0, a);
		printInorder(temp);

	}
	static void printInorder(BTNode node)
	{
		if(node == null)
			return;
		printInorder(node.left);
		System.out.print(node.data + " ");
		printInorder(node.right);
	}
	
}
