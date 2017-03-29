package lists;

import java.util.Iterator;

public class ListsUtils {
    public static <T extends Comparable<T>> void  sort(ArrayList<T> list){
        Object elements[]  =list.getElements();
        for (int i = list.size() - 1; i >= 0; i--){
            for (int j = list.size() - 1; j >= 0; j--){
              if (((Comparable<T>)elements[j]).compareTo((T)elements[j+1]) > 0){
                  Object temp = elements[j];
                  elements[j] = elements[j+1];
                  elements[j+1] = temp;
              }
            }
        }
    }
    /*
    public static <T extends Comparable<T>> LinkedList<T> merge(LinkedList<T> aList, LinkedList<T> bList) {
        int i = 0;
        int j = 0;
        LinkedList<T> resultList = new LinkedList<T>();
        while (i < aList.size() && j < bList.size()) {
            if (aList.get(i).compareTo(bList.get(j)) < 0) {
                resultList.add(aList.get(i));
                i++;
            } else {
                resultList.add(bList.get(j));
                j++;
            }
        }

        while (i < aList.size()) {
            resultList.add(aList.get(i));
            i++;
        }

        while (j < bList.size()) {
            resultList.add(bList.get(j));
            j++;
        }

        return resultList;
    }
    */

    public static <T extends Comparable<T>> LinkedList<T> sort(LinkedList<T> list) {
        LinkedList stack[] = new LinkedList[32];

        for (int i = 0; i < stack.length; i++) {
            stack[i] = new LinkedList<T>();
        }

        int currentStackSize = 0;

        return stack[0];
    }
    /*
     * Функция слияния двух связных списков. Протестировать на случае, когда один из списков пустой, и когда два списка пустые
     * @param aList
     * @param bList
     * @param <T>
     * @return
     */
    public static <T extends Comparable<T>> LinkedList<T> merge(LinkedList<T> aList, LinkedList<T> bList) {
        Iterator<T> aListIterator = aList.iterator();
        Iterator<T> bListIterator = bList.iterator();

        LinkedList<T> resultList = new LinkedList<T>();
        while (aListIterator.hasNext() && bListIterator.hasNext()){
            T aValue = aListIterator.next();
            T bValue = bListIterator.next();

            // ДОПИСАТЬ
        }

        return resultList;
    }
}
