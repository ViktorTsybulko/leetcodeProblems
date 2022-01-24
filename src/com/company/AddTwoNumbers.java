package com.company;
/*
* You are given two non-empty linked lists representing two non-negative integers.
* The digits are stored in reverse order, and each of their nodes contains a single digit.
* Add the two numbers and return the sum as a linked list.
* You may assume the two numbers do not contain any leading zero, except the number 0 itself.
*
* Example :
* Input: l1 = [2,4,3], l2 = [5,6,4]
* Output: [7,0,8]
* Explanation: 342 + 465 = 807.
* */



/*
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode l3 = null, head;
        head = null;
        int c = 0;

        while((l1 != null) && (l2 != null))
        {
            int x = l1.val + l2.val + c;
            int s = x % 10;

            c = x / 10;
            l1.val = s;

            if (l3 == null) {
                l3 = l1;
                head = l1;
            }
            else {
                l3.next = l1;
                l3 = l3.next;
            }

            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1 != null)
        {
            int x = l1.val + c;
            int s = x % 10;

            c = x / 10;
            l1.val = s;

            if(l3 == null) {
                l3 = l1;
                head = l1;
            }
            else {
                l3.next = l1;
                l3 = l3.next;
            }

            l1 = l1.next;
        }
        while(l2 != null)
        {
            int x = l2.val + c;
            int s = x % 10;

            c = x / 10;
            l2.val = s;

            if(l3 == null) {
                l3 = l2;
                head = l2;
            }
            else {
                l3.next = l2;
                l3 = l3.next;
            }

            l2 = l2.next;
        }
        if(c != 0)
        {
            l3.next = new ListNode(c);
        }
        return head;
    }
}