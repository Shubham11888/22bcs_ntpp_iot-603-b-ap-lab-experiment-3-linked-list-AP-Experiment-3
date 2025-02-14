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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next ==null){
            return head;
        }
        ListNode dummy = new ListNode(0,head);
        ListNode prev = dummy;
        ListNode curr = head;
        ListNode temp = head.next;
        boolean flag = false;

        while(temp != null){
            if(curr.val != temp.val){
                if(flag == true){
                    prev.next = temp;
                    flag = false;
                }
                else{
                    prev = prev.next;
                }
            }
            else if(curr.val == temp.val){
                flag = true;
            }
            temp = temp.next;
            curr = curr.next;
        }
        if(flag == true){
            prev.next = temp;
        }
        return dummy.next;
        
    }
}
