package com.test.binarytree;

public class SymmetricBTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private static boolean isSymmetricTree(BTreeNode root) {
		if(root.right == null && root.left == null) {
			return true;
		}
		
		if(root.right == null || root.left == null) {
			return false;
		}
		
		if(root.right.val != root.left.val) {
			return false;
		}
		
		return isSymmetricTree(root.right) && isSymmetricTree(root.left);
	}

}
