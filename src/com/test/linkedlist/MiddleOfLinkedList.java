/*
Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.

Example 1:
			1 -> 2 -> 3 -> 4 -> 5

Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.

Example 2:
			1 -> 2 -> 3 -> 4 -> 5 -> 6

Input: head = [1,2,3,4,5,6]
Output: [4,5,6]
Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.


Constraints:

    The number of nodes in the list is in the range [1, 100].
    1 <= Node.val <= 100

*/
package com.test.linkedlist;

public class MiddleOfLinkedList {

	public static void main(String[] args) {
		ListNode n6 = new ListNode(6);
		ListNode n5 = new ListNode(5, n6);
		ListNode n4 = new ListNode(4, n5);
		ListNode n3 = new ListNode(3, n4);
		ListNode n2 = new ListNode(2, n3);
		ListNode head = new ListNode(1, n2);
		
		
		if(head == null || head.next == null) {
			System.out.println("Linked List contains 0 or 1 element");
		}
		
		ListNode slow = head;
		ListNode fast = head;
		
		//Traversal
		while(fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		ListNode middle = head;
		
		//Odd no. of nodes
		if(fast.next == null) {
			middle = slow;
		} else if(fast.next.next == null) {//even no. of nodes
			middle = slow.next;
		}
		
		System.out.println("Middle Element : "+middle.val);

	}	

}
