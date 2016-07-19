package leetcode_easy;

public class Maximum_Depth_of_Binary_Tree {

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	//below method is just for adding values
		public void insert(TreeNode node, int value) {
			if (value < node.val) {
				if (node.left != null) {
					insert(node.left, value);
				} else {
					System.out.println("  Inserted " + value + " to left of " + node.val);
					node.left = new TreeNode(value);
				}
			} else if (value > node.val) {
				if (node.right != null) {
					insert(node.right, value);
				} else {
					System.out.println("  Inserted " + value + " to right of " + node.val);
					node.right = new TreeNode(value);
				}
			}
		}
		
		
		//this one is real logic of finding max depth
		public static int maxDepth(TreeNode root) {
			if (root == null)
				return 0;

			int leftDepth = maxDepth(root.left);
			int rightDepth = maxDepth(root.right);

			int bigger = Math.max(leftDepth, rightDepth);

			return bigger + 1;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			TreeNode root = new TreeNode(1);

			root.insert(root, 2);
			root.insert(root, 4);
			root.insert(root, 3);
			root.insert(root, 5);
			root.insert(root, 4);

			System.out.println(TreeNode.maxDepth(root));
		}
	}

}
