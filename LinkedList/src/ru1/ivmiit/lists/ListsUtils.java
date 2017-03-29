package ru1.ivmiit.lists;

import java.util.Comparator;
import java.util.Iterator;

public class ListsUtils {

    public static <T> void sort(ArrayList<T> list, Comparator<T> comparator){
        Object elements[] = list.getElements();
        for (int i = list.size() - 1; i >=0; i--){
            for (int j = 0; j < i; j++){
                T a = (T)elements[j];
                T b = (T)elements[j+1];
                boolean aMorethanB;
                if (comparator == null){
                    aMorethanB = ((Comparable<T>)a).compareTo(b) > 0;
                } else {
                    aMorethanB = comparator.compare(a, b) > 0;
                }
                if (aMorethanB){
                    Object temp = elements[j];
                    elements[j] = elements[j+1];
                    elements[j+1] = temp;
                }
            }
        }
    }


    public static <T extends Comparable<T>> void sort(ArrayList<T> list){
        sort(list, null);
    }



    public static <T extends Comparable<T>> LinkedList<T> merge(LinkedList<T> aList, LinkedList<T> bList){
        int i = 0;
        int j = 0;
        LinkedList<T> resultList = new LinkedList<T>();
        while (i < aList.size() && j < bList.size()){
            if (aList.get(i).compareTo(bList.get(j)) < 0){
                resultList.add(aList.get(i));
                i++;
            } else {
                resultList.add(bList.get(j));
                j++;
            }
        }
        while (i < aList.size()){
            resultList.add(aList.get(i));
            i++;
        }
        while (j < bList.size()){
            resultList.add(bList.get(j));
            j++;
        }
        return resultList;
    }



    //
//    public void mergeSort(){
//
//        head = mergeSortRec(head);
//    }
//
//
//    private Node mergeSortRec(Node start) {
//
//        if(start==null || start.next==null)
//            return start;
//
//
//        Node start1 = start;
//        Node start2 = divideList(start);
//        start1 = mergeSortRec(start1);
//        start2 = mergeSortRec(start2);
//        Node startM = merge2(start1,start2);
//        return startM;
//    }
//
//    private Node divideList(Node p) {
//
//        Node q = p.next.next;
//        while(q!=null && q.next!=null) {
//            p=p.next;
//            q=q.next.next;
//        }
//        Node start2 = p.next;
//        p.next = null;
//        return start2;
//    }
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
    public static <T extends Comparable<T>> LinkedList<T> merge2(LinkedList<T> aList, LinkedList<T> bList) {
        LinkedList<T> resultList = new LinkedList<T>();

        Iterator<T> aListIterator = aList.iterator();
        Iterator<T> bListIterator = bList.iterator();

        T aValue = aListIterator.hasNext() ? aListIterator.next() : null;
        T bValue = bListIterator.hasNext() ? bListIterator.next() : null;

        while (aValue != null && bValue != null){

            if (aValue.compareTo(bValue) < 0) {
                resultList.add(aValue);
                aValue = aListIterator.hasNext() ? aListIterator.next() : null;
            } else {
                resultList.add(bValue);
                bValue = bListIterator.hasNext() ? bListIterator.next() : null;
            }
        }

        if (aValue != null) {
            resultList.add(aValue);
            while (aListIterator.hasNext()) {
                resultList.add(aListIterator.next());
            }
        }

        if (bValue != null) {
            resultList.add(bValue);
            while (bListIterator.hasNext()) {
                resultList.add(bListIterator.next());
            }
        }

        return resultList;
    }



    public void removeByNode(Node node) {
        
    }
}
