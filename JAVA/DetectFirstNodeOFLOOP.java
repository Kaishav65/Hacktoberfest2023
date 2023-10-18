package LinkedList;

public class DetectFirstNodeOFLOOP extends LL{
    public Node detectFirstNode(Node head){
        Node meet = fastAndSlowPointer(head);
        Node start = head;
        Node prev = null;

        while(start != meet){
            prev = meet;
            start = start.next;
            meet = meet.next;
        }

        prev.next = null;

        return head;
    }

    public Node fastAndSlowPointer(Node head){
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                return fast;
            }
        }

        return null;
    }
}
