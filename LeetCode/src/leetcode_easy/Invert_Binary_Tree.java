package leetcode_easy;

import leetcode_easy.Maximum_Depth_of_Binary_Tree.TreeNode;

public class Invert_Binary_Tree {

	int val;
	Invert_Binary_Tree left;
	Invert_Binary_Tree right;

	Invert_Binary_Tree(int x) {
		val = x;
	}

	// below method is just for adding values
	public void insert(Invert_Binary_Tree node, int value) {
		if (value < node.val) {
			if (node.left != null) {
				insert(node.left, value);
			} else {
				System.out.println("  Inserted " + value + " to left of " + node.val);
				node.left = new Invert_Binary_Tree(value);
			}
		} else if (value > node.val) {
			if (node.right != null) {
				insert(node.right, value);
			} else {
				System.out.println("  Inserted " + value + " to right of " + node.val);
				node.right = new Invert_Binary_Tree(value);
			}
		}
	}
	
	public static void printInOrder(Invert_Binary_Tree node) 
	{
		if (node != null) {
			printInOrder(node.left);
			System.out.println("  Traversed " + node.val);
			printInOrder(node.right);
		}
	}

	// this one is real logic of Invert binary tree
	public static Invert_Binary_Tree Ibt(Invert_Binary_Tree root) {
		if (root != null) {
			helper(root);

		}
		return root;

	}

	public static void helper(Invert_Binary_Tree p) {
		Invert_Binary_Tree temp = p.left;
		p.left = p.right;
		p.right = temp;

		if (p.left != null) {
			helper(p.left);
		}
		if (p.right != null) {
			helper(p.right);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Invert_Binary_Tree root = new Invert_Binary_Tree(1);

		root.insert(root, 2);
		root.insert(root, 4);
		root.insert(root, 3);
		root.insert(root, 5);
		Invert_Binary_Tree.Ibt(root);
		Invert_Binary_Tree.printInOrder(root);

	}

}
