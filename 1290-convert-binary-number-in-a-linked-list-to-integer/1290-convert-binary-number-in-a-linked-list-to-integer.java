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
    public int getDecimalValue(ListNode head) {
        int ans = 0;
        int pow = size(head) - 1;
        
        while(head!=null) {
            ans += (int)(Math.pow(2, pow)) * head.val;  
            head = head.next;
            pow--;
        }
        
        return ans;
    }
    
    public int size(ListNode head) {
        int c = 0;
        while(head != null) {
            c++;
            head = head.next;
        }
        return c;
    }
}