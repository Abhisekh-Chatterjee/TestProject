/*

You are given the root of a binary search tree (BST) and an integer val.

Find the node in the BST that the node's value equals val and return the 
subtree rooted with that node. If such a node does not exist, return null.
 

Example 1:
			4
		   / \
		  2   7
		 / \
		1   3

Input: root = [4,2,7,1,3], val = 2
Output: [2,1,3]


Example 2:
			4
		   / \
		  2   7
		 / \
		1   3

Input: root = [4,2,7,1,3], val = 5
Output: []

Constraints:

    The number of nodes in the tree is in the range [1, 5000].
    1 <= Node.val <= 107
    root is a binary search tree.
    1 <= val <= 107
 
*/

package com.test.binarysearchtree;

public class SearchBST {

	public static void main(String[] args) {
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(3);
		TreeNode n3 = new TreeNode(7);
		TreeNode n4 = new TreeNode(2, n1, n2);
		TreeNode root = new TreeNode(4, n4, n3);
		TreeNode returnedNode = searchBinSeTree(root, 5);
		if(returnedNode == null) {
			System.out.println("The value does not exists in BST");
		} else {
			System.out.println("The subtree has root as "+returnedNode.val);
			if(returnedNode.left == null) {
				System.out.println("The subtree's root has no left child");
			} else {
				System.out.println("The subtree's root has left child as "+returnedNode.left.val);
			}if(returnedNode.left == null) {
				System.out.println("The subtree's root has no right child");
			} else {
				System.out.println("The subtree's root has right child as "+returnedNode.right.val);
			}
		}
	}
	
	private static TreeNode searchBinSeTree(TreeNode root, int val) {
		if(root == null) {
			return null;
		} else if(root.val == val) {
			return root;
		} else if(root.val > val) {
			return searchBinSeTree(root.left, val);
		}else {
			return searchBinSeTree(root.right, val);
		}
	}

}
