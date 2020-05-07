package Solution;

import Solution.helper.ListNode;

public class Q61_RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null){
            return head;
        }
        int size=0;
        ListNode count=head;
        while(count!=null){
            size++;
            count=count.next;
        }
        int r=k%size;

        if(r==0){
            return head;
        }
        ListNode newEnd=head;
        ListNode oldEnd=head;
        for(int i=0;i<size-1;i++){
            if(i<size-r-1){
                newEnd=newEnd.next;
            }
            oldEnd=oldEnd.next;
        }
        ListNode newHead=newEnd.next;
        newEnd.next=null;
        oldEnd.next=head;


        return newHead;
    }
}
