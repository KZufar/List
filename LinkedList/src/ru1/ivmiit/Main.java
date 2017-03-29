package ru1.ivmiit;

import ru1.ivmiit.lists.ArrayList;
import ru1.ivmiit.lists.LinkedList;
import ru1.ivmiit.lists.ListsUtils;
import ru1.ivmiit.lists.Node;

import java.util.Comparator;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
//
//
//        LinkedList<Human> a = new LinkedList<>();
//        LinkedList<Human> b = new LinkedList<>();
//
//
//        a.add(new Human("Zufar", 6, 18));
//        a.add(new Human("Azat", 3, 19));
//        a.add(new Human("Nikita", 2, 20));
//        a.add(new Human("Marsel", 1, 23));
//        a.add(new Human("Slava", 4, 18));
//
//        b.add(new Human("Albert", 7, 18));
//        b.add(new Human("Vika", 10, 18));
//        b.add(new Human("Fedor", 5, 19));
//        b.add(new Human("Ksusha", 8, 19));
//        b.add(new Human("Ruslan", 9, 20));
//        b.add(new Human("Edvard", 11, 25));
//
//
//        for (int i = 0; i < a.size(); i++) {
//            System.out.println(a.get(i));
//            System.out.println(b.get(i));
//        }


//
//        LinkedList<Human> mergedList = ListsUtils.merge2(a, b);
//
//        System.out.println("After merger:");
//        for (int i = 0; i < mergedList.size(); i++) {
//            System.out.println(mergedList.get(i));
//        }





        LinkedList<Integer> t = new LinkedList<>();
        t.add(19);
        t.add(32);
        t.add(2);
        t.add(82);
        t.add(4);
        t.add(23);



        t.remove(t.head.next.next);

//        t.reverse();  // разворот списка
//        t.remove(82); // удаление по значению
//        t.removeAt(3); // удаление по индексу



        System.out.println("Before sort:");
        for (int i = 0; i < t.size(); i++){
            System.out.println(t.get(i));
        }
        System.out.println();

//        LinkedList<Integer> merge = LinkedL
//        System.out.println("After sort:");
//
//        for (int i = 0; i < t.size(); i++){
//            System.out.println(merge.get(i));
//        }
//        System.out.println();ist.sort(t);

//
//        for (int i = 0; i < t.size(); i++){
//            System.out.println(t.get(i));
//        }
//        System.out.println();
//
//        System.out.println(t.find(19));
//        System.out.println();
//
//        ArrayList<Integer> k = new ArrayList<>();
//        k.add(19);
//        k.add(32);
//        k.add(2);
//        k.add(82);
//        k.add(4);
//        k.add(23);
//
//        k.reverse();
//        k.remove(82);
//        k.removeAt(3);
//
//
//        for (int i = 0; i < t.size(); i++){
//            System.out.println(t.get(i));
//        }
//        System.out.println();
//
//        System.out.println(k.find(19));



//        t.add(1);
//        t.add(2);
//        t.add(3);
//        t.add(4);
//        t.add(5);
//        t.add(6);
//
//
//        for (int i = 0; i < t.size(); i++){
//            System.out.println(t.get(i));
//        }
//        System.out.println();
//
//        t.reverse();
//
//        for (int i = 0; i < t.size(); i++){
//            System.out.println(t.get(i));
//        }




//        String s1 = "World";
//        String u1 = "worldkj";
//        System.out.println(s1.compareTo(u1));
//
//
//        System.out.println(s1.hashCode());
//        System.out.println(u1.hashCode());
//
//        String s = new String("Hello");
//        String u = new String("Hello");
//
//        s.equals(u);
//
//        System.out.println(s1==s);
//        System.out.println(s1.equals(s));
//        System.out.println(s1.intern().equals(s.intern()));


//        System.out.println("jgvhlgvhjvgukg");


    }
}
