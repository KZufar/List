package lists;

import java.util.Iterator;

public class LinkedList<T> implements List<T> {
    private class Node{

        T value;
        Node next;

        Node(T value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;
    private int count;

    public LinkedList(Node head, Node tail, int count) {
        this.head = null;
        this.tail = null;
        this.count = 0;
    }

    private class LinkedListIterator<E> implements Iterator<E>{
        Node currentNode;

        public LinkedListIterator(Node currentNode) {
            this.currentNode = head;
        }

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }

        @Override
        public E next() {
            E element = (E)currentNode.value;
            currentNode = currentNode.next;
            return element;
        }
    }

    @Override
    public void add(T element) {
        Node newNode = new Node(element);
        if (head == null){
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        count++;
    }

    @Override
    public T get(int index) {
        if (index < count){
            Node currentNode = head;
            int currentIndex = 0;
            while (currentIndex < index){
                currentNode = currentNode.next;
                currentIndex++;
            }
            return currentNode.value;
        }
        return null;
    }

    @Override
    public int size() {
        return count;
    }

    public Iterator<T> iterator(){
        return new LinkedListIterator<>();
    }
}
