/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
   public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp = headA;
        ListNode  temp1=headB;
        int val=0;
        ListNode flag = null;
        int count1=0;
        int count2=0;
        while(temp.next!=null){
            temp=temp.next;
            count1++;
        }
        while(temp1.next!=null){
            temp1=temp1.next;
            count2++;
        }
         temp = headA;
         temp1=headB;
        if(count2>count1){
             val = count2-count1;
            int i=0;
            while(i<val){
                temp1=temp1.next;
                i++;
            }
        }else if(count1>count2){
              val=count1-count2;
            int i=0;
            while(i<val){
             temp=temp.next;
                i++;
            } 
          }
        while(temp!=null && temp1!=null){
            if(temp==temp1){
                flag=temp;
                break;
            }
            temp=temp.next;
            temp1=temp1.next;
        }
      return flag;
       
    }
    
}