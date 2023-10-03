import java.util.*;

//class ListNode {
//    int val;
//    ListNode next;
//
//    ListNode(int x) {
//        val = x;
//        next = null;
//    }
//}


public class LinkedListCycle {
    public static void main(String[] args) {
        //call your fn here
    }

    // main fn
    public class Solution {
        // class listnode is already present in LinkedListCycle2.java file, no need to add the class again if one is present in the same folder.
        public boolean hasCycle(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;

                if (fast == slow) {
                    return true;
                }
            }
            return false;
        }
    }
}

