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
    public ListNode rotateRight(ListNode head, int k) {
        if(k==0 || head==null || head.next==null ){
            return head;
        }
         k  = KUpdate(head,k);
        for(int i=0;i<k;i++){
            ListNode first=head;
            ListNode temp=head;
            while(first.next!=null){
                temp=first;
                first=first.next;
            }
            first.next = head;
            temp.next=null;
            head = first;
        }
        return head;
    }
    public int KUpdate(ListNode head,int k){
        int count =0;
        ListNode temp = head;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        k = k%count;
        return k;
    }
}