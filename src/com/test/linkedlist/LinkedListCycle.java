/*
Given head, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached 
again by continuously following the next pointer. Internally, pos is used to denote the 
index of the node that tail's next pointer is connected to. Note that pos is not passed 
as a parameter.

Return true if there is a cycle in the linked list. Otherwise, return false.


Example 1:

				3 -> 2 -> 0 -> -4 ---
					 ^_ _ _ _ _ _ _ _|

Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).

Example 2:

				1 -> 2 ----
				^_ _ _ _ _|

Input: head = [1,2], pos = 0
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.

Example 3:

Input: head = [1], pos = -1
Output: false
Explanation: There is no cycle in the linked list.

*/

package com.test.linkedlist;

public class LinkedListCycle {

	public static void main(String[] args) {
		ListNode n4 = new ListNode(-4);
		ListNode n3 = new ListNode(0,n4);
		ListNode n2 = new ListNode(2,n3);
		ListNode head = new ListNode(1,n2);
		
		//n4.next = n2;
		
		boolean cycleExists = false;
		
		if(head == null && head.next == null) {
			System.out.println("There are no cycles in the linked list");
		}
		
		ListNode slow = head;
		ListNode fast = head.next;
		
		while(fast.next != null && fast.next.next != null) {
			
			if(slow == fast) {
				cycleExists = true;
				break;
			}
			slow = slow.next;
			fast = fast.next.next;
		}
		
		if(cycleExists) {
			System.out.println("The Linked List has cycle");
		} else {
			System.out.println("The Linked List has no cycles");
		}
	}
}
