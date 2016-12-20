public class sol2 {
	static LinkedListNode removeNodes(LinkedListNode head, int x) {
        if(head == null) return null;
 
        LinkedListNode fakeHead1 = new LinkedListNode(0);
        LinkedListNode fakeHead2 = new LinkedListNode(0);
        fakeHead1.next = head;
 
        ListNode p = head;
        ListNode prev = fakeHead1;
        ListNode p2 = fakeHead2;
 
        while(p != null){
            if(p.val < x){
               
            }else{
 
                p2.next = p;
                prev.next = p.next;
 
                p = prev.next;
                p2 = p2.next;
            } 
        }
 
        // close the list
        p2.next = null;
 
        prev.next = fakeHead2.next;
 
        return fakeHead2.next;
    }
}