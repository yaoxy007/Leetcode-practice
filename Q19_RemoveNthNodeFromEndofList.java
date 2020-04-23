package Solution;

import Solution.helper.ListNode;

public class Q19_RemoveNthNodeFromEndofList {

//    better than official solution, solution used dummy ListNode that points as:
//    Dummy_head->head -> head.next-> ...->null
//    so it can use the same method to remove the head of the list
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode tmp=head;
        int count = 0;
        while(tmp!=null){
            tmp=tmp.next;
            count++;
        }
        ListNode rm=head;

        int length=count-n;
        while(length>1){
            length--;
            rm=rm.next;
        }
        if(length==0){
            head=head.next;
        }else{
            rm.next=rm.next.next;
        }

        return head;
    }
}
