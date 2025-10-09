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
        int total=0;
        ListNode temp=head;
        while(temp!=null){
            total++;
            temp=temp.next;

        }
        int count=1;
        n=total-n;
        n=n+1;
        if(n==1){
            return head.next;
        }
        temp=head;
        while(count<n-1){
            temp=temp.next;
            count++;

        }
        temp.next=temp.next.next;
        return head;
        
    }
}