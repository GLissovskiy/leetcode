package info.javalab;

public class ReversedLinkedList {

    public static void main(String [] args){

        ReversedLinkedList reversedLinkedList = new ReversedLinkedList();

        ListNode listNode =  reversedLinkedList.reverseList(new ListNode(5));
        System.out.println(listNode.toString());
    }

    public ListNode reverseList(ListNode head){

        ListNode prev = null;

        while(head != null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }

}

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
