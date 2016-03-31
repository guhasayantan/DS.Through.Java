package Trees.BinarySearchTree;

public class InorderSuccessorBST {
	class Node{
		int data;
		Node left,right;
		Node(int value){
			this.data= value;
			this.left=null;
			this.right=null;
		}
	}
	class BST{
		Node root;
		Node insert(Node node, int value){
			if(node == null)
				return (new Node(value));
			else{
				if(node.data <= value)
					node.left = insert(node.left, value);
				else
					node.right = insert(node.right, value);
			}
			return node;
		}
		Node inorderSuccessor(Node root, Node node){
			if(node.right!=null)
				return minval(node.right);
			Node succ = null;
			while(root!=null){
				if(node.data<root.data){
					succ = root;
					root = root.left;
				}
				else if (node.data > root.data){
					root = root.right;
				}
				else
					break;
			}
			return succ;
		}
		Node minval(Node node){
			Node min = node;
			while(min.left!=null){
				min = min.left;
			}
			return min;
		}
	}
	public static void main(String[] args) {
		InorderSuccessorBST insucc = new InorderSuccessorBST();
		BST bst = insucc.new BST();
		Node head = null;
		head = bst.insert(head, 4);
		bst.insert(head, 2);
		bst.insert(head, 1);
		bst.insert(head, 3);
		bst.insert(head, 6);
		bst.insert(head, 5);
		bst.insert(head, 7);
		bst.insert(head, 8);
		Node temp =bst.insert(head, 9);
		System.out.println("The inorder sucessor of the BST of node 9 : "+ (bst.inorderSuccessor(head, temp)).data);
	}

}
