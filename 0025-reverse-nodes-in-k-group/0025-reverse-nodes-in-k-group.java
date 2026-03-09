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
    public ListNode reverseKGroup(ListNode head, int k) {
         if(head==null ||head.next==null)return head;
   ListNode temp=head;
   int len=0;
   while(temp!=null){
     len++;
     temp=temp.next;
   } 

 ListNode dummy=new ListNode(0);
    dummy.next=head;
    ListNode prevGroup=dummy;

    while(len>=k){

        ListNode curr=prevGroup.next;
        ListNode next=curr.next;

        for(int i=1;i<k;i++){
            curr.next=next.next;
            next.next=prevGroup.next;
            prevGroup.next=next;
            next=curr.next;
        }

        prevGroup=curr;
        len-=k;
    }

    return dummy.next;
//    int i=1;
//    temp=head;
//    int n=k;
//    while( n>0  && i<=(len/n) ){
// //    while(i<=(len/k){
//     // int n=k;
//     // while(n>0){
//         ListNode front=temp.next;
//         temp.next=temp.next.next;
//         front.next=temp;
//         temp=temp.next;
//         n--;
//         i++;
//      } 
//       return head;
    }
}