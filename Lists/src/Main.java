
import lists.ArrayList;
import lists.LinkedList;
import lists.List;
import lists.ListsUtils;

public class Main {

    public static void main(String[] args) {
        LinkedList<Human> a = new LinkedList<>();
        LinkedList<Human> b = new LinkedList<>();

        a.add(new Human("Slava", 4, 18));
        a.add(new Human("Zufar", 6, 18));
        a.add(new Human("Azat", 3, 19));
        a.add(new Human("Nikita", 2, 20));
        a.add(new Human("Marsel", 1, 23));

        b.add(new Human("Albert", 7, 18));
        b.add(new Human("Vika", 10, 18));
        b.add(new Human("Fedor", 5, 19));
        b.add(new Human("Ksusha", 8, 19));
        b.add(new Human("Ruslan", 9, 20));
        b.add(new Human("Edvard", 11, 25));


        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }

        LinkedList<Human> mergedList = ListsUtils.merge(a, b);

        System.out.println("After merger:");
        for (int i = 0; i < mergedList.size(); i++) {
            System.out.println(mergedList.get(i));
        }


    }
}
