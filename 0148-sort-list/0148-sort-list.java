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
      ListNode dummy=new ListNode(0);
      dummy.next=head;  
      ListNode temp=head;
      int cnt=0;
      while(temp!=null){
        cnt++;
        temp=temp.next;
      }
      int []arr = new int[cnt];
      temp=head;
      for(int i=0;i<cnt;i++){
        arr[i]=temp.val;
        temp=temp.next;
      }
      Arrays.sort(arr);
      temp=dummy;
      for(int j=0;j<cnt;j++){
        temp.next.val=arr[j];
        temp=temp.next;
      }
      return dummy.next;
    }
}