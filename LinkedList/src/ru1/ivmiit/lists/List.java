package ru1.ivmiit.lists;

public interface List<T> extends Iterable<T> {

    void add(Node<Integer> element); // добавление элемента

    T get(int index); // получение значение элемента по индексу

    int size(); // размер

    void reverse(); // разворот

    int find(T element); // нахождение элемента по значению

    void removeAt(int index); // удаление элемента по индексу

    int remove(T element); // удаление элемента по значению
}
