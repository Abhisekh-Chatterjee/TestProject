/*
Given the head of a singly linked list, reverse the list, and return the 
reversed list.

Example 1:

Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]

Example 2:

Input: head = [1,2]
Output: [2,1]

Example 3:

Input: head = []
Output: []

Constraints:

    The number of nodes in the list is the range [0, 5000].
    -5000 <= Node.val <= 5000 

Follow up: A linked list can be reversed either iteratively or recursively. 
Could you implement both?

*/
package com.test.linkedlist;

public class ReverseLinkedList {

	public static void main(String[] args) {
		ListNode n6 = new ListNode(5);
		ListNode n5 = new ListNode(4, n6);
		ListNode n4 = new ListNode(3, n5);
		ListNode n3 = new ListNode(2, n4);
		ListNode n2 = new ListNode(1, n3);
		ListNode head = new ListNode(1, n2);
		
		if(head == null || head.next == null) {
			System.out.println("The Linked list cannot be reversed");
			return;
		}
		
		ListNode prev = null;
		ListNode curr = head;
		ListNode next = head.next;
		
		while(curr != null) {
			curr.next = prev;
			
			prev = curr;
			curr = next;
			
			if(next != null) {
				next = next.next;
			}
		}
		
		head = prev;
		
		ListNode iterator = head;
		
		while(iterator != null) {
			System.out.println(iterator.val);
			iterator = iterator.next;
		}

	}

}
