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
    
    public ListNode sortList(ListNode head) {
      ListNode slow=head;
      ListNode fast=head;
     //step1.split the LL from middle
      if(head==null || head.next==null) return head;
      ListNode prev=slow;
      while(fast!=null && fast.next!=null){
         prev=slow;
        slow=slow.next;
        fast=fast.next.next;
      }
      prev.next=null;
      //recursively sort the List
      ListNode l1= sortList(head);
      ListNode l2=sortList(slow);
       return merge(l1,l2);
    }
    //helper method to merge the sorted lists
    public ListNode merge(ListNode l1,ListNode l2){
        ListNode dummy=new ListNode(0),result=dummy;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                result.next=l1;
                l1=l1.next;
            }else{
                result.next=l2;
                l2=l2.next;
            }
            result=result.next;
        }
        if(l1!=null)result.next=l1;
        if(l2!=null)result.next=l2;
        return dummy.next;
    }
}