package ru.zharinov.easy_level.task21;

import java.util.ArrayList;
import java.util.List;

/*
https://leetcode.com/problems/merge-two-sorted-lists/
*/

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
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

    private  void addAll(ListNode listNode, List<Integer> list) {
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