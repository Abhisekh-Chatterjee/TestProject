package com.test.binarytree;

public class IdenticalBTree {

	public static void main(String[] args) {
		
		/*
		 * BTreeNode pn1 = new BTreeNode(15); BTreeNode pn2 = new BTreeNode(7);
		 * BTreeNode pn3 = new BTreeNode(9); BTreeNode pn4 = new BTreeNode(20, pn1,
		 * pn2); BTreeNode proot = new BTreeNode(3, pn3, pn4);
		 */
		 
		BTreeNode pn1 = new BTreeNode(2);
		BTreeNode proot = new BTreeNode(1, null, pn1);
		
		BTreeNode qn1 = new BTreeNode(2);
		BTreeNode qroot = new BTreeNode(1, null, qn1);
		
		if(isSameTree(proot, qroot)) {
			System.out.println("The trees are identical");
		} else {
			System.out.println("The trees are not identical");
		}

	}
	
	private static boolean isSameTree(BTreeNode p, BTreeNode q) {
		if(p == null && q == null) {
			return true;
		}
		
		if(p == null || q == null) {
			return false;
		}
		
		if(p.val != q.val) {
			return false;
		}
		
		return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
	}

}
