package Trees.BinaryTree;

public class ConstructTreeInorderPreorder {
	class Node{
		char data;
		Node left, right;
		Node(char value){
			this.data = value;
			this.left=null;
			this.right =null;
		}
	}
	class BinaryTree{
		Node root;
		int preindex=0;
		Node buildtree(char in[], char pre[], int start, int end){
			if(start > end)
				return null;
			Node tnode = new Node(pre[preindex++]);
			if(start == end){
				return tnode;
			}
			int index = search(in, start, end, tnode.data);
			tnode.left = buildtree(in, pre, start, index-1);
			tnode.right = buildtree(in, pre, index+1, end);
			return tnode;
		}
		int search(char arr[], int start, int end, char value){
			int i;
			for(i =0; i < end ; i++){
				if(arr[i] == value)
					return i;
			}
			return i;
		}
		void printInorder(Node node) {
	        if (node == null) {
	            return;
	        }
	        printInorder(node.left);
	        System.out.print(node.data + " ");
	        printInorder(node.right);
	    }
	}
	public static void main(String[] args) {
		ConstructTreeInorderPreorder cst = new ConstructTreeInorderPreorder();
		BinaryTree tree = cst.new BinaryTree();
        char in[] = new char[]{'D', 'B', 'E', 'A', 'F', 'C'};
        char pre[] = new char[]{'A', 'B', 'D', 'E', 'C', 'F'};
        int len = in.length;
        Node mynode = tree.buildtree(in, pre, 0, len - 1);
 
        System.out.println("Inorder traversal of constructed tree is : ");
        tree.printInorder(mynode);

	}

}
