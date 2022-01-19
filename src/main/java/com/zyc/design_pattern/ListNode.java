package com.zyc.design_pattern;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ListNode {

    private int value;
    private ListNode next;

    public static ListNode mergeTwoListNode(ListNode node1,ListNode node2){
        // 只要有一个为空就返回不为空的。
        if (node1 == null || node2 == null){
            return node1 == null ? node2 :node1;
        }
        // 找到头节点小的链表记为要返回的head。
        ListNode head = node1.value <= node2.value ? node1 : node2;
        // 记录小头链表的下一个节点。
        ListNode cur1 = head.next;
        // 记录大头节点的下一个节点。
        ListNode cur2 = head == node1 ? node2 : node1;
        // 记录移动指针。
        ListNode pre  = head;
        // 只要有一个链表为空了则跳出循环。
        while (cur1 != null && cur2 != null){
            // pre指向下一个小节点。
            if (cur1.value <= cur2.value){
                pre.next = cur1;
                cur1 = cur1.next;
            }else {
                pre.next = cur2;
                cur2 = cur2.next;
            }
            // 移动pre。
            pre = pre.next;
        }
        // 当一个链表为空了，另外一个链表还有值的情况下直接指向。
        pre.next = cur1 == null ? cur2 : cur1;
        // 返回
        return head;
    }

    public static ListNode reversal(ListNode node){
        // 前一个节点
        ListNode pre = null;
        // 下一个节点
        ListNode next = null;
        // 链表为空则跳出循环
        while (node != null){
            // 记录当前节点的下一个节点
            next = node.next;
            // 当前节点的下一个节点指向pre
            node.next = pre;
            // pre移动到当前节点
            pre = node;
            // 当前节点移动到当前节点的下一个节点
            node = next;
        }
        // 返回pre，此时pre为反转后的第一个节点也就是原链表的最后一个节点
        return pre;
    }

    public static void main(String[] args) {
        final ListNode listNode = new ListNode();
        final ListNode listNode1 = new ListNode();
        final ListNode listNode2 = new ListNode();
        listNode.value = 1;
        listNode1.value = 3;
        listNode2.value = 8;
        listNode.next = listNode1;
        listNode1.next = listNode2;

        final ListNode listNode3 = new ListNode();
        final ListNode listNode4 = new ListNode();
        final ListNode listNode5 = new ListNode();
        listNode3.value = 2;
        listNode4.value = 4;
        listNode5.value = 10;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        ListNode reversal1 = reversal(listNode);
        while (reversal1 != null){
            System.out.println(reversal1.value);
            reversal1 = reversal1.next;
        }
//        final ListNode listNode6 = mergeTwoListNode(listNode, listNode3);
//        ListNode foreach = listNode6;
//        while (foreach.next != null){
//            System.out.println(foreach.value);
//            foreach = foreach.next;
//        }
    }
}


