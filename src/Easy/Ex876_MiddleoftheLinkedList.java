package Easy;

import Utils.ListNode;

import java.util.*;


public class Ex876_MiddleoftheLinkedList {
    public static ListNode middleNode(ListNode head) {
        int size = 1;
        ListNode node = head;
        while (node.next!=null) {
            size++;
            node = node.next;
        }
        int middlePos = (int) Math.ceil(size/2);
        node = head;
        for (int i = 0; i < middlePos; i++) {
            node = node.next;
        }
        return node;
    }



    public static void main(String[] args) {
        List<Integer> arr = new LinkedList<Integer>(Arrays.asList(1,2,3,4,5));
        ListNode head = ListNode.fill(arr);
        System.out.println(middleNode(head).val); //3

        arr = new LinkedList<Integer>(Arrays.asList(1,2,3,4,5,6));
        head = ListNode.fill(arr);
        System.out.println(middleNode(head).val); //4

    }
}
