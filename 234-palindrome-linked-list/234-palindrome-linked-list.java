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
        if(head==null){
            return false;
        }
        ListNode mid = getMid(head);
        ListNode secondhead = reverseList(mid);
        while(head!=null && secondhead!=null){
            if(head.val!=secondhead.val){
                return false;
            }
            head=head.next;
            secondhead=secondhead.next;
        }
        return true;
    }
    public ListNode getMid(ListNode head){
        ListNode fast = head;
        ListNode slow  = head;
        while(fast != null && fast.next!=null){
            slow=slow.next;
            fast =fast.next.next;
        }
        return slow;
    }
     public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev;
    }

}