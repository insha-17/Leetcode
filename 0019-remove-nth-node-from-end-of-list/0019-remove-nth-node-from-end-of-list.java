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
    public ListNode removeNthFromEnd(ListNode head, int n) {
       int len=0;
       ListNode temp=head;
       if(head==null){
        return null;
       }   
       while(temp!=null){
        len++;
        temp=temp.next;
       }


       int k=len-n +1;
       if(k==1){
        return head.next;
       }
       int cnt=0;
       temp=head;
       ListNode prev=null;
       while(temp!=null){
       cnt++;
       if(cnt==k){
        prev.next=temp.next;
        break;
       }
       prev=temp;
       temp=temp.next;
       }
       return head;
    }
}