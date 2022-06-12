package com.bridgelabz.datastructures;

public class LinkedList<K> {
    Node<K> head;
    Node<K> tail;

    public void push(K key) {
        Node<K> newNode = new Node<>(key);
        if(head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.next = head;
            head = newNode;
        }
    }
    public void add(K key) {
        Node<K> newNode = new Node<>(key);
        if(head == null) {
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void insertBtw(K key) {
        Node<K> newNode = new Node<>(key);
        head.next = newNode;
        newNode.next = tail;
    }
    public K pop() {
        K poppedData = head.key;
        head = head.next;
        return poppedData;
    }
    public void print() {
        Node<K> temp = head;
        while(temp != null){
            System.out.print(temp.key+"->");
            temp = temp.next;
        }
    }
}
