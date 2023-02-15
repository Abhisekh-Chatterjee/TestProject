/*
Given the root of a binary tree, return its maximum depth.

A binary tree's maximum depth is the number of nodes along 
the longest path from the root node down to the farthest 
leaf node.


Example 1:
				3
			   / \
			  9	  20
			  	 /	\
			  	15	 7

Input: root = [3,9,20,null,null,15,7]
Output: 3

Example 2:
				1
			     \
			  	  2
			  	 

Input: root = [1,null,2]
Output: 2


Constraints:

    The number of nodes in the tree is in the range [0, 104].
    -100 <= Node.val <= 100

*/
package com.test.binarytree;

public class MaxDepth {

	public static void main(String[] args) {
		/*
		 * BTreeNode n1 = new BTreeNode(15); BTreeNode n2 = new BTreeNode(7); BTreeNode
		 * n3 = new BTreeNode(9); BTreeNode n4 = new BTreeNode(20, n1, n2); BTreeNode
		 * root = new BTreeNode(3, n3, n4);
		 */
		
		BTreeNode n1 = new BTreeNode(2);
		BTreeNode root = new BTreeNode(1, null, n1);
		
		System.out.println("Max Depth of Binary Tree is "+maxDepth(root));

	}
	
	private static int maxDepth(BTreeNode root) {
		if(root == null) {
			return 0;
		}
		
		int leftDepth = maxDepth(root.left);
		
		int rightDepth = maxDepth(root.right);
		
		return Math.max(leftDepth, rightDepth) +1;
	}
}
