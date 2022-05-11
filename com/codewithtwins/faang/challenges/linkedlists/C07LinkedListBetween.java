package com.codewithtwins.faang.challenges.linkedlists;



public class C07LinkedListBetween {


    public LinkedList.Node solution(LinkedList.Node head, int m, int n) {
        int currentPos = 1;
        LinkedList.Node currentNode = head;
        LinkedList.Node start = head;

        while(currentPos < m) {
            start = currentNode;
            currentNode = currentNode.next;
            currentPos++;
        }
        LinkedList.Node newList = null;
        LinkedList.Node tail = currentNode;

        while(currentPos == m && currentPos <= n) {
            LinkedList.Node next = currentNode.next;
            currentNode.next = newList;
            newList = currentNode;
            currentNode = next;
            currentPos++;
        }
        start.next = newList;
        tail.next = currentNode;

        return head;

    }
}
