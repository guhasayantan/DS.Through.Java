package Trees.BinarySearchTree;


public class LCABST {
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
		
		Node lca(Node node, int n1, int n2){
			if(node == null)
				return null;
			if(node.data > n1 && node.data > n2)
				lca(node.left, n1, n2);
			if(node.data < n1 && node.data < n2)
				lca(node.right, n1, n2);
			return node;
		}
		void inorder(Node temp){
			
			if(temp!=null){
				inorder(temp.left);
				System.out.print(temp.data + " ");
				inorder(temp.right);
			}
			else
				return;
		}
	}
	public static void main(String[] args) {
		LCABST lca = new LCABST();
		BST bst = lca.new BST();
		Node head = null;
		head = bst.insert(head, 4);
		bst.insert(head, 2);
		bst.insert(head, 1);
		bst.insert(head, 3);
		bst.insert(head, 6);
		bst.insert(head, 5);
		bst.insert(head, 7);
		bst.insert(head, 8);
		bst.insert(head, 9);
		System.out.println("Inorder traversal");
		bst.inorder(head);
		
		System.out.println();
		
		System.out.println("The LCA of 3 and 6 is: "+ (bst.lca(head, 8, 9)).data);

	}

}
