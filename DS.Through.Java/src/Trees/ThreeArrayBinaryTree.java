package Trees;

class ThreeBTNode
{
	char data;
	ThreeBTNode left, right;
	
	ThreeBTNode(char a)
	{
		this.data =  a;
		left =null;
		right =  null;
	}
}

class ThreeBTree
{
	

	
	public ThreeBTNode buidtree(int index, char[] a, int[] lc, int[] rc)
	{
		ThreeBTNode node=null;
		if(index!=-1)
		{
			node = new ThreeBTNode(a[index]);
			node.left =  buidtree(lc[index], a, lc, rc);
			node.data = a[index];
			node.right = buidtree(rc[index], a, lc, rc);
			
		}
		return node;
	}
}

public class ThreeArrayBinaryTree {

	public static void main(String[] args) {
		char a[]={'A','B','C','D','E','F','G','\0','\0','H'};
		int lc[]={1,3,5,-1,9,-1,-1,-1,-1,-1};
		int rc[]={2,4,6,-1,-1,-1,-1,-1,-1,-1};
		ThreeBTree tree = new ThreeBTree();
		ThreeBTNode temp = tree.buidtree(0, a, lc, rc);
		printInorder(temp);

	}
	static void printInorder(ThreeBTNode node)
	{
		if(node == null)
			return;
		printInorder(node.left);
		System.out.print(node.data + " ");
		printInorder(node.right);
	}
	
}
