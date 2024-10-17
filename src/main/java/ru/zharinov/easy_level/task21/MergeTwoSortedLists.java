package ru.zharinov.easy_level.task21;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode list1;
        ListNode list2;

        list1 = new ListNode(1, null);
        list1.next = new ListNode(2, new ListNode(4, null));

        list2 = new ListNode(1, null);
        list2.next = new ListNode(3, new ListNode(4, null));

        System.out.println(mergeTwoLists(list1, list2));
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        List<Integer> list = new ArrayList<>();
        ListNode result = null;
        ListNode last = null;
        addAll(list1, list);
        addAll(list2, list);
        list.sort(Integer::compareTo);
        for (Integer i : list) {
            if (result == null) {
                result = new ListNode(i, null);
                last = result;
            } else {
                ListNode newNode = last;
                last = new ListNode(i, null);
                newNode.next = last;
            }
        }
        return result;
    }

    private static void addAll(ListNode listNode, List<Integer> list) {
        while (listNode != null) {
            list.add(listNode.val);
            listNode = listNode.next;
        }
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}