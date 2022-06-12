package com.bridgelabz.datastructures;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        System.out.println("Push Method");
        linkedList1.push(70);
        linkedList1.push(30);
        linkedList1.push(56);
        linkedList1.print();
        System.out.println();
        System.out.println("**********************");

        LinkedList<Integer> linkedList2 = new LinkedList<>();
        System.out.println("Append Method");
        linkedList2.add(56);
        linkedList2.add(30);
        linkedList2.add(70);
        linkedList2.print();
        System.out.println();

        System.out.println("**********************");
        LinkedList<Integer> linkedList3 = new LinkedList<>();
        System.out.println("Insert Between Method");
        linkedList3.add(56);
        linkedList3.add(70);
        linkedList3.print();
        System.out.println();
        linkedList3.insertBtw(30);
        System.out.println("After Insert");
        linkedList3.print();
        System.out.println();

        System.out.println("**********************");
        System.out.println("POP Method");
        Integer poppedData = linkedList3.pop();
        System.out.println("Popped Data : " + poppedData);

        System.out.println("**********************");
        System.out.println("POP Last Method");
        Integer poppedData2 = linkedList3.popLast();
        System.out.println("Popped Data1 : " + poppedData2);

        System.out.println("**********************");
        System.out.println("Search Method");
        Node<Integer> searchedNode = linkedList2.search(30);
        if(searchedNode == null){
            System.out.println("Data not found");
        }else{
            System.out.println("Data Found ");
        }

        System.out.println("**********************");
        System.out.println("Search & Insert Method");
        linkedList2.insertAfter(40,30);
        linkedList2.print();
        System.out.println();

        System.out.println("**********************");
        System.out.println("Search & delete Method");
        linkedList2.searchDelete(40);
        linkedList2.print();
        System.out.println();
        Integer linkedListSize = linkedList2.size();
        System.out.println("Linked List Size :"+linkedListSize);

    }
}

