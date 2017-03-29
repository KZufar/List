package ru1.ivmiit.lists;
//
import java.util.Iterator;

public class ArrayList<T> implements List<T> {
    private int maxSize = 15;

    private Object elements[];
    private int count;

    public ArrayList() {
        elements = new Object[maxSize];
        count = 0;
    }


    private class ArrayListIterator<E> implements Iterator<E> {
        int currentIndex;

        public ArrayListIterator() {
            this.currentIndex = 0;
        }

        @Override
        public boolean hasNext() {
            return currentIndex < count;
        }

        @Override
        public E next() {
            E element = (E) elements[currentIndex];
            currentIndex++;
            return element;
        }
    }


    @Override
    public void add(Node<Integer> element) {
        if (count < maxSize) {
            elements[count] = element;
            count++;
        }
    }

    @Override
    public T get(int index) {
        if (index >= 0 && index <= count) {
            return (T) elements[index];
        }
        return null;
    }

    public int find(T element) {
        for (int index = 0; index < this.count + 1; index++) {
            if (this.elements[index].equals(element)) {
                return index;
            }
        }
        return -1;
    }

    public void removeAt(int index) {
        if (index > this.count) {
            System.out.println("Incorrect index");
        } else {
            for (int i = index; i < this.count; i++) {
                this.elements[i] = this.elements[i + 1];
            }
            this.count--;
        }
    }

    public int remove(T element) {
        int index = 0;
        while (index < this.count) {
            if (this.elements[index].equals(element)) {
                for (int i = index; i < this.count; i++) {
                    this.elements[i] = this.elements[i + 1];
                }
                this.count--;
                return index;
            }
            index++;
        }
        System.out.println("Element is not found");
        return -1;
    }

    public int size() {
        return this.count;
    }

    public void reverse() {
        Object temp[] = new Object[this.count];
        for (int i = 0; i < count; i++) {
            temp[i] = this.elements[count - 1 - i];
        }
        for (int i = 0; i < count; i++) {
            this.elements[i] = temp[i];
        }
    }

    public void resize() {
        Object temp[] = new Object[maxSize];
        for (int i = 0; i < maxSize; i++) {
            temp[i] = this.elements[i];
        }
        maxSize = (maxSize * 3) / 2 + 1;
        this.elements = new Object[maxSize];
        for (int i = 0; i < temp.length; i++) {
            this.elements[i] = temp[i];
        }
    }

        // метод доступен во всех классах пакета
        T[] getElements () {
            return (T[]) this.elements;
        }


        public Iterator<T> iterator () {
            return new ArrayListIterator<>();
        }

}

