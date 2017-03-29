package ru1.ivmiit.lists;

public class Node<T> {

    public T value;
    public Node next;
    public int index;

    public Node(T value) {
        this.value = value;
    }
    public Node(){

    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public T getValue() {

        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public boolean equals(Object object) {
        if (object == null || !(object.getClass().getName().equals(this.getClass().getName()))) {
            return false;
        }
        Node that = (Node) object;
        return this.value.equals(that.value);
    }
}
