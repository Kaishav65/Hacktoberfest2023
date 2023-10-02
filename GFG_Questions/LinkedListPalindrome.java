


class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}

class Solution
{
    //Function to check whether the list is palindrome.
    Node reverse(Node head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        Node curr=head.next;
        Node prev=head;
        while(curr!=null)
        {
            Node newNext=curr.next;
            curr.next=prev;
            prev=curr;
            curr=newNext;
        }
        head.next=null;
        head=prev;
        
        return head;
    }
    Node middle(Node head)
    {
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    boolean isPalindrome(Node head) 
    {
        //Your code here
        if(head==null || head.next==null)
        {
            return true;
        }
        Node trav=head;
        Node mid=middle(head);
        Node rev=reverse(mid);
        while(rev!=null)
        {
            if(trav.data!=rev.data)
            {
                return false;
            }
            // System.out.print(rev.data);
            rev=rev.next;
            trav=trav.next;
        }
        return true;
    }    
}