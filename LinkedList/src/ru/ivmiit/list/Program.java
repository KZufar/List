package ru.ivmiit.list;

import ru.ivmiit.list.generics.ArrayList;
import ru.ivmiit.list.generics.List;
import ru.ivmiit.list.integer.ArrayListInteger;
import ru.ivmiit.list.integer.ListInteger;
import ru.ivmiit.list.object.ArrayListObject;
import ru.ivmiit.list.object.ListObject;

/**
 * 27.02.2017
 * Program
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Program {
    public static void main(String[] args) {
        ListObject list1 = new ArrayListObject();
        list1.add(10);
        list1.add("231");
        list1.add('1');

        System.out.println(list1.get(1));

        ListInteger listInteger = new ArrayListInteger();
        listInteger.add(10);
        listInteger.add(8);

        System.out.println(listInteger.get(0));
        System.out.println(listInteger.get(1));

        ListObject listObject = new ArrayListObject();
        listObject.add('3');
        listObject.add('A');
        listObject.add(145);

        // char charFromList = (char)listObject.get(2);
        // System.out.println(charFromList);

        List<Integer> integerList = new ArrayList<Integer>();
        integerList.add(10);
        integerList.add(12);
        // integerList.add('1');

        int numberFromList = integerList.get(0);

        List<Character> characterList = new ArrayList<Character>();
        characterList.add('a');
        char charFromList = characterList.get(0);

        System.out.println(numberFromList + charFromList);
    }
}
