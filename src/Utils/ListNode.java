package Utils;

import java.util.List;

public class ListNode {
    public int val;
    public ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode fill(List<Integer> arr){
        ListNode node = new ListNode(arr.size());
        for (int i = arr.size()-2; i >=0 ; i--) {
            node = new ListNode(arr.get(i), node);
        }
        return node;
    }

    public static void print(ListNode node) {
        System.out.println(node.val);
        while (node.next!=null) {
            node=node.next;
            System.out.println(node.val);
        }
    }
}
