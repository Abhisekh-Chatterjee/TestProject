/*
Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from 
the root node down to the nearest leaf node.

Note: A leaf is a node with no children.

 
Example 1:
				3
			   / \
			  9	  20
			  	 /	\
			  	15	 7

Input: root = [3,9,20,null,null,15,7]
Output: 2

Example 2:
				2
			     \
			  	  3
			  	   \
			  		4
			  		 \
			  		  5
			  		   \
			  		    6

Input: root = [2,null,3,null,4,null,5,null,6]
Output: 5
 

Constraints:

    The number of nodes in the tree is in the range [0, 105].
    -1000 <= Node.val <= 1000


*/

package com.test.binarytree;

public class MinDepth {

	public static void main(String[] args) {
		
		
		  //BTreeNode n1 = new BTreeNode(15); 
		  //BTreeNode n2 = new BTreeNode(7); 
		  //BTreeNode n3 = new BTreeNode(9); 
		  //BTreeNode n4 = new BTreeNode(20, n1, n2); 
		  //BTreeNode root = new BTreeNode(3, n3, n4);
		 
		BTreeNode n1 = new BTreeNode(2);
		BTreeNode root = new BTreeNode(1, n1, null);
		 
		/*
		 * BTreeNode n1 = new BTreeNode(6); BTreeNode n2 = new BTreeNode(5, null, n1);
		 * BTreeNode n3 = new BTreeNode(4, null, n2); BTreeNode n4 = new BTreeNode(3,
		 * null, n3); BTreeNode root = new BTreeNode(2, null, n4);
		 */
		
		System.out.println("Min depth of Binary Tree is "+minDepth(root));

	}
	
	private static int minDepth(BTreeNode root) {
		if(root == null) {
			return 0;
		}
		
		int leftDepth = minDepth(root.left);
		int rightDepth = minDepth(root.right);
		
		//if(root.left == null & root.right == null) {
			//return 1;
		//}
		
		if(leftDepth == 0 & rightDepth == 0) {
			return 1;
		}
		
		//if(root.left == null) {
			//return minDepth(root.right) + 1;
		//}
		
		if(leftDepth == 0) {
			return rightDepth + 1;
		}
		
		//if(root.right == null) {
			//return minDepth(root.left) + 1;
		//}
		
		if(rightDepth == 0) {
			return leftDepth + 1;
		}
		return Math.min(leftDepth, rightDepth) +1;
		
	}

}
