package Trees.BinaryTree;

//Complexity: O(n)

public class FindMaxWidth {
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
		public BinaryTree(int data){
			root = new Node(data);
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
		int maxheight(Node node){
			int ht = height(node);
			int count[] = new int[ht];
			int level =0;
			getmaxwidth(node, count, level);
			return getmax(count, ht);
		}
		void getmaxwidth(Node node, int count[], int level){
			if(node!=null){
				count[level]++;
				getmaxwidth(node.left, count, level+1);
				getmaxwidth(node.right, count, level+1);
			}
		}
		int getmax(int count[], int ht){
			int max= count[0];
			for(int i =0; i < ht; i++){
				if(count[i]>max)
					max=count[i];
			}
			return max;
		}
	}

	public static void main(String[] args) {
		FindMaxWidth maxht = new FindMaxWidth();
		BinaryTree tree = maxht.new BinaryTree();
		tree.root = maxht.new Node(1);
		tree.root.left = maxht.new Node(2);
		tree.root.right = maxht.new Node(3);
		tree.root.left.left = maxht.new Node(4);
		tree.root.left.right = maxht.new Node(5);
		tree.root.right.right = maxht.new Node(8);
		tree.root.right.right.left = maxht.new Node(6);
		tree.root.right.right.right = maxht.new Node(7);
		System.out.println("The max width of the Binary Tree :" + tree.maxheight(tree.root));
	}

}
