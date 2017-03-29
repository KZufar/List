package ru.ivmiit.generics.extended;

import ru.ivmiit.list.generics.ArrayList;
import ru.ivmiit.list.generics.List;

/**
 * 27.02.2017
 * Program
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Program {

    public static void main(String[] args) {



        List<Dog> dogList = new ArrayList<>();
        dogList.add(new Dog());

        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat());

        Animal dogAnimal = new Dog();
        // Нельзя, потому что потом в список можно класть каких угодно животных
        // List<Animal> animalList = dogList;

        List list = dogList;
        list.add(new Cat());
        Cat cat = (Cat) list.get(1);
        cat.eat();

        // Cat cat1 = (Cat)dogList.get(1);
    }
}
