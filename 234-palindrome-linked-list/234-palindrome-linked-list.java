/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null) return true;
     
     ListNode firstHalfEnd = endOfFirstHalf(head);
     ListNode secondHalfStart = reverseList(firstHalfEnd.next);
     ListNode p1 = head;
     while(secondHalfStart!=null){
         if(p1.val != secondHalfStart.val){
             return false;
         }
         p1 = p1.next;
         secondHalfStart = secondHalfStart.next;
     }
    
  return true;
    }
    private ListNode endOfFirstHalf(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast.next != null && fast.next.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    private ListNode reverseList(ListNode head){
       
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
    return prev;
    }
}