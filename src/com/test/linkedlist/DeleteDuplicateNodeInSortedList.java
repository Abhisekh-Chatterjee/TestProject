/*
Given the head of a sorted linked list, delete all duplicates such that 
each element appears only once. Return the linked list sorted as well.

 

Example 1: 
			1 -> 1-> 2

Input: head = [1,1,2]
Output: [1,2]

Example 2:
			1 -> 1-> 2 -> 3 -> 3

Input: head = [1,1,2,3,3]
Output: [1,2,3]

 

Constraints:

    The number of nodes in the list is in the range [0, 300].
    -100 <= Node.val <= 100
    The list is guaranteed to be sorted in ascending order.


 */

package com.test.linkedlist;

public class DeleteDuplicateNodeInSortedList {

	public static void main(String[] args) {
		ListNode n6 = new ListNode(5);
		ListNode n5 = new ListNode(4, n6);
		ListNode n4 = new ListNode(3, n5);
		ListNode n3 = new ListNode(2, n4);
		ListNode n2 = new ListNode(1, n3);
		ListNode head = new ListNode(1, n2);
		
		if(head == null || head.next == null) {
			System.out.println("No Duplicate items");
			return;
		}
		
		ListNode iterator = head;
		
		while(iterator.next != null) {
			if(iterator.val == iterator.next.val) {
				iterator.next = iterator.next.next;
			} else {
				iterator = iterator.next; 
			}
		}
		
		ListNode printIterator = head;
		
		while(printIterator != null){
			System.out.println(printIterator.val);
			printIterator = printIterator.next;
		}

	}

}
