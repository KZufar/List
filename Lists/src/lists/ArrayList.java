package lists;

import java.util.Iterator;

/**
 * Created by User on 05.03.2017.
 */
public class ArrayList<T> implements List<T>{
    private int maxSize = 15;

    private Object elements[];
    private int count;

    public ArrayList(Object[] elements) {
        elements = new Object[maxSize];
        count = 0;
    }

    @Override
    public void add(T element) {
        if (count < maxSize){
            elements[count] = element;
            count++;
        }
    }



    public T get(int index){
        if (index >= 0 && index <= count){
            return (T)elements[index];
        }
        return null;
    }

    T[] getElements(){
        return (T[])this.elements;
    }

    public int size() {
        return count;
    }

    private class ArrayListIterator<E> implements Iterator<E>{
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
            E element = (E)elements[currentIndex];
            currentIndex++;
            return element;
        }
    }


}
