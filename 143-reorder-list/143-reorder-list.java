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
     public void reorderList(ListNode head) {
        if(head.next==null || head.next.next==null){
            return;
        }
        ListNode  mid = getMidModified(head);
        ListNode  secondHead = reverseList(mid);
        ListNode  tem = secondHead;
        ListNode  nxt  = tem.next;
        ListNode  curr = head;
        ListNode  nxt1 = curr.next;
        while (tem!=null){
            curr.next=tem;
            curr=nxt1;
            tem.next = curr;
            nxt1=nxt1.next;
            tem=nxt;
            if(nxt!=null){
                nxt=nxt.next;
            }
        }
    }
    ListNode getMidModified(ListNode head){
        ListNode midPrev=null;
        while(head!=null && head.next!=null){
            midPrev = (midPrev==null) ? head : midPrev.next;
            head=head.next.next;
        }
        ListNode mid = midPrev.next.next;
        midPrev =midPrev.next;
        midPrev.next=null;
        return mid;
    }
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode prev = null;
        ListNode curr= head;
        ListNode temp= curr.next;
        while (curr!=null){
            curr.next=prev;
            prev=curr;
            curr=temp;
            if(temp!=null){
                temp=temp.next;
            }
        }
        head=prev;
        return head;
    }
}