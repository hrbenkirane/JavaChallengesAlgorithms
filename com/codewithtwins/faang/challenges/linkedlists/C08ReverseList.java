package com.codewithtwins.faang.challenges.linkedlists;

public class C08ReverseList {

    public LinkedList.Node reverse(LinkedList.Node head) {
        LinkedList.Node prev = null;
        LinkedList.Node current = head;

        while(current.next != null) {
            LinkedList.Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
