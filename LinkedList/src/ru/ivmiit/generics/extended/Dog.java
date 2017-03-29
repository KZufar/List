package ru.ivmiit.generics.extended;

/**
 * 27.02.2017
 * Dog
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Dog implements Animal {

    @Override
    public void eat() {
        System.out.println("I'm dog and I'm eating the cat");
    }
}
