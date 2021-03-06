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
    public K popLast() {
        Node<K> temp = head;
        Node<K> secondLastNode = null;
        while (temp.next != null) {
            secondLastNode = temp;
            temp = temp.next;
        }
        secondLastNode.next = null;
        K poppedData = temp.key;
        tail = secondLastNode;
        return poppedData;
    }
    public Node<K> search(K key) {
        Node<K> temp = head;
        Node<K> searchedNode = null;
        while (temp != null) {
            if(temp.key.equals(key)) {
                searchedNode = temp;
                break;
            }
            temp = temp.next;
        }
        return searchedNode;
    }
    public void insertAfter(K insertData, K searchData) {
        Node<K> newNode = new Node<>(insertData);
        Node<K> searchedNode = search(searchData);
        newNode.next = searchedNode.next;
        searchedNode.next = newNode;
    }
    public void searchDelete(K key) {
        Node<K> temp = head;
        Node<K> previousNode = null;
        while (temp != null) {
            if(temp.key.equals(key)) {
                previousNode.next = temp.next;
                break;
            }
            previousNode = temp;
            temp = temp.next;
        }
    }
    public int size() {
        int i = 0;
        Node<K> temp = head;
        while (temp != null) {
            i++;
            temp = temp.next;
        }
        return i;
    }

    public void print() {
        Node<K> temp = head;
        while(temp != null){
            System.out.print(temp.key+"->");
            temp = temp.next;
        }
    }
}
