package ru.ivmiit.list.generics;

/**
 * 27.02.2017
 * List
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public interface List<T> {
    void add(T element);
    T get(int index);
}
