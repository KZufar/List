package ru.ivmiit.list.generics;

/**
 * 27.02.2017
 * ArrayList
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class ArrayList<T> implements List<T> {

    private static final int MAX_ARRAY_SIZE = 5;

    private Object elements[];
    private int count;

    public ArrayList() {
        this.elements = new Object[MAX_ARRAY_SIZE];
        this.count = 0;
    }

    @Override
    public void add(T element) {
        if (count < MAX_ARRAY_SIZE) {
            this.elements[count] = element;
            this.count++;
        } else {
            System.out.println("Array index of bounds");
        }
    }

    @Override
    public T get(int index) {
        if (index < count) {
            return (T)this.elements[index];
        } else {
            System.out.println("Incorrect index");
            return null;
        }
    }
}
