package com.company;

public class Main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addFirst("1");
        myLinkedList.addFirst("2");
        myLinkedList.addFirst("3");
        myLinkedList.addFirst("4");

        myLinkedList.addLast("8");
        myLinkedList.addLast("9");

//        myLinkedList.addIndex(2,"x");

        myLinkedList.removeFirst();
        myLinkedList.removeLast();
        myLinkedList.removeIndex(2);
    }
}