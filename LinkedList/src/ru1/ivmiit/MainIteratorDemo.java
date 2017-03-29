package ru1.ivmiit;

import ru1.ivmiit.lists.LinkedList;
import ru1.ivmiit.lists.LinkedList;

import java.util.Iterator;

public class MainIteratorDemo {
    public static void main(String[] args) {
        LinkedList<Human> humans = new LinkedList<>();

        humans.add(new Human("Slava", 4, 18));
        humans.add(new Human("Zufar", 6, 18));
        humans.add(new Human("Azat", 3, 19));
        humans.add(new Human("Nikita", 2, 20));
        humans.add(new Human("Marsel", 1, 23));

        humans.add(new Human("Albert", 7, 18));
        humans.add(new Human("Vika", 10, 18));
        humans.add(new Human("Fedor", 5, 19));
        humans.add(new Human("Ksusha", 8, 19));
        humans.add(new Human("Ruslan", 9, 20));
        humans.add(new Human("Edvard", 11, 25));


        Iterator<Human> humanIterator = humans.iterator();



        while (humanIterator.hasNext()) {
            System.out.println(humanIterator.next());
        }
//
////        Iterator<Human> humanIterator = humans.iterator();
//        for (Human currentHuman : humans) {
//            System.out.println(currentHuman);
//        }

    }
}
