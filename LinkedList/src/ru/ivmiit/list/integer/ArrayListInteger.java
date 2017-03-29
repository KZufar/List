package ru.ivmiit.list.integer;

/**
 * 27.02.2017
 * ArrayListInteger
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class ArrayListInteger implements ListInteger {

    private static final int MAX_ARRAY_SIZE = 5;

    private int elements[];
    private int count;

    public ArrayListInteger() {
        this.elements = new int[MAX_ARRAY_SIZE];
        this.count = 0;
    }

    @Override
    public void add(int element) {
        if (count < MAX_ARRAY_SIZE) {
            this.elements[count] = element;
            this.count++;
        } else {
            System.out.println("Array index of bounds");
        }
    }

    @Override
    public int get(int index) {
        if (index < count) {
            return this.elements[index];
        } else {
            System.out.println("Incorrect index");
            return -1;
        }
    }
}
