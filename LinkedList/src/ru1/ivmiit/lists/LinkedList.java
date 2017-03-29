package ru1.ivmiit.lists;

import java.util.Iterator;

public class LinkedList<T> implements List<T> {
//
//    public class Node {
//
//        T value;
//        Node next;
//        int index;
//
//        public Node(T value) {
//            this.value = value;
//        }
//
//        public boolean equals(Object object) {
//            if (object == null || !(object.getClass().getName().equals(this.getClass().getName()))) {
//                return false;
//            }
//            Node that = (Node) object;
//            return this.value.equals(that.value);
//        }
//    }


    public Iterator<T> iterator() {
        return new LinkedListIterator<>();
    }

    private class LinkedListIterator<E> implements Iterator<E> {
        Node currentNode;

        public LinkedListIterator() {
            this.currentNode = head;
        }

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }

        @Override
        public E next() {
            E element = (E) currentNode.value;
            currentNode = currentNode.next;
            return element;
        }
    }


    public Node head;
    public Node tail;
    public int count;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.count = 0;
    }

    public void add(Node<Integer> element) {
        Node newNode = new Node(element);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        count++;
    }
    public void add(T element) {
        Node newNode = new Node(element);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        count++;
    }


    public T get(int index) {
        if (index < count) {
            Node<T> currentNode = head;
            int currentIndex = 0;
            while (currentIndex < index) {
                currentNode = currentNode.next;
                currentIndex++;
            }
            return currentNode.value;
        }
        return null;
    }

    public int find(T element) {
        Node currentNode = this.head;
        for (int currentIndex = 0; currentIndex < this.count; currentIndex++) {
            if (currentNode.value.equals(element)) {
                return currentIndex;
            } else {
                currentNode = currentNode.next;
            }
        }
        return -1;
    }

    public void removeAt(int index) {
        if (index < this.count) {
            Node currentNode = this.head;
            Node previousNode = this.head;
            int currentIndex = 0;
            while (currentIndex < index) {
                previousNode = currentNode;
                currentNode = currentNode.next;
                currentIndex++;
            }
            previousNode.next = currentNode.next;
            this.count--;
        } else {
            System.out.println("incorrect index");
        }

    }

    public int remove(T element) {
        Node currentNode = this.head;
        Node previousNode = this.head;
        for (int currentIndex = 0; currentIndex < this.count; currentIndex++) {
            if (currentNode.value.equals(element)) {
                previousNode.next = currentNode.next;
                this.count--;
                return currentIndex;
            } else {
                previousNode = currentNode;
                currentNode = currentNode.next;
            }
        }
        return -1;
    }


    public void remove(Node n) {
        n.setValue(n.getNext().getValue());
        n.setNext(n.getNext().getNext());
        count--;

    }


    public void reverse() {
        System.out.println("Reversed List: ");
        Node temp = null;

        Node current = head;
        Node next = null;

        while (current != null) {

            next = current.next;

            current.next = temp;
            temp = current;
            current = next;
        }
        head = temp;
    }

    public int size() {
        return count;
    }
//
//    public <T extends Comparable<T>> LinkedList<T> sort(LinkedList<T> list) {
//        LinkedList<T> resultList = new LinkedList<T>();
//
//        Iterator<T> listIterator = list.iterator();
//
//        T value = listIterator.hasNext() ? listIterator.next() : null;
//
//        if (value == null || listIterator.next() == null) {
//            return resultList;
//        }
//
//        LinkedList<T> start1;
//        start1 = (LinkedList<T>) value;
//
//        Node start2 = divideList(value);
//
//        start1 = sort(start1);
//
//        start2 = sort(start2);
//        Node startM = merge2(start1, start2);
//        return startM;
//    }
//
//    private Node divideList(LinkedList<T> p) {
//        LinkedList<T> l = new LinkedList<T>();
//        Iterator<T> piter = p.iterator();
//        T k = piter.hasNext() ? piter.next() : null;
//        while (k < 0){
//
//        }
//        while(q!=null && q.next!=null) {
//            p=p.next;
//            q=q.next.next;
//        }
//        Node start2 = p.next;
//        p.next = null;
//        return start2;
//    }
//


    public static <T extends Comparable<T>> LinkedList<T> sort(LinkedList<T> list) {
        LinkedList<T> stack[] = new LinkedList[32];
        int lvl[] = new int[32];
        LinkedList resultList = new LinkedList();
        Iterator<T> listIterator = list.iterator();
        T value = listIterator.next();

        for (int i = 0; i < stack.length; i++) {
            stack[i] = new LinkedList<>();
        }

        int stackPos = 0;
        while (listIterator.hasNext()) {
            lvl[stackPos] = 1;
            stack[stackPos].add(value);
            value = listIterator.next();
            if (listIterator.hasNext() == false) {
                lvl[stackPos] = 1;
                stack[stackPos].add(value);
            }
            stackPos++;
        }
        while (stackPos > 1){
            stack[stackPos - 2] = merge(stack[stackPos - 2],stack[stackPos - 1]);
            lvl[stackPos - 2]++;
            stackPos--;
        }
        if (stackPos > 0)
            resultList = stack[0];

        return resultList;
    }


    public static <T extends Comparable<T>> LinkedList<T> merge(LinkedList<T> aList, LinkedList<T> bList) {
        LinkedList<T> resultList = new LinkedList<>();

        Iterator<T> aListIterator = aList.iterator();
        Iterator<T> bListIterator = bList.iterator();

        T aValue = aListIterator.hasNext() ? aListIterator.next() : null;
        T bValue = bListIterator.hasNext() ? bListIterator.next() : null;

        while (aValue != null && bValue != null){

            if (aValue.compareTo(bValue) < 0) {
                resultList.add(aValue);
                aValue = aListIterator.hasNext() ? aListIterator.next() : null;
            } else {
                resultList.add(bValue);
                bValue = bListIterator.hasNext() ? bListIterator.next() : null;
            }
        }

        if (aValue != null) {
            resultList.add(aValue);
            while (aListIterator.hasNext()) {
                resultList.add(aListIterator.next());
            }
        }

        if (bValue != null) {
            resultList.add(bValue);
            while (bListIterator.hasNext()) {
                resultList.add(bListIterator.next());
            }
        }

        return resultList;
    }
}




//
//    public void mergeSort(){
//
//        head = mergeSortRec(head);
//    }
//
//
//    private Node mergeSortRec(Node start) {
//
//        if(start==null || start.next==null)
//            return start;
//
//
//        Node start1 = start;
//        Node start2 = divideList(start);
//        start1 = mergeSortRec(start1);
//        start2 = mergeSortRec(start2);
//        Node startM = merge2(start1,start2);
//        return startM;
//    }
//
//    private Node divideList(Node p) {
//
//        Node q = p.next.next;
//        while(q!=null && q.next!=null) {
//            p=p.next;
//            q=q.next.next;
//        }
//        Node start2 = p.next;
//        p.next = null;
//        return start2;
//    }
//
//
//    private Node merge2(Node p1, Node p2) {
//
//        Node startM;
//
//        if((Integer)p1.getValue() <= (Integer) p2.getValue()) {
//            startM=p1;
//            p1=p1.next;
//        }
//        else {
//            startM = p2;
//            p2=p2.next;
//        }
//
//        Node pM = startM;
//
//        while(p1!=null && p2!=null) {
//            if((Integer)p1.getValue() <= (Integer) p2.getValue()) {
//                pM.next=p1;
//                pM=pM.next;
//                p1=p1.next;
//            }
//            else {
//                pM.next=p2;
//                pM=pM.next;
//                p2=p2.next;
//            }
//        }
//
//        if(p1==null)
//            pM.next=p2;
//        else
//            pM.next=p1;
//        return startM;
//
//    }


